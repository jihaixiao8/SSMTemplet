package com.github.demo.action;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.http.HttpRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.github.demo.service.LoginService;
import com.github.demo.util.SendEmailUtil;
import com.github.demo.util.StitchingStringUtil;

@Controller
//@RequestMapping(value = "/login")
public class LoginController {
	
	private static Logger log = LoggerFactory.getLogger(LoginController.class);
	
	@Resource
	private LoginService loginService;
	
	@RequestMapping(value = "/login", method ={RequestMethod.POST,RequestMethod.GET})
	public ModelAndView login(ModelMap modelMap) throws Exception {
		return new ModelAndView("redirect:/login.jsp");
	}
	
	/**
	 * 登录
	 * @param modelMap
	 * @param username
	 * @param password
	 * @param session
	 * @return
	 */
	@RequestMapping(value = "/confirmLogin", method ={RequestMethod.POST,RequestMethod.GET})
	public ModelAndView login(ModelMap modelMap, String username, String password, HttpSession session, HttpServletRequest request, HttpServletResponse response){
		log.info("登录开始，用户名："+username+"密码："+password+"!");
		boolean flag = loginService.login(username, password);
		if(flag){
			session.setAttribute("username", username);
			String status = request.getParameter("status");

			if(status != "" ||  status != null){
				int statusNew = Integer.parseInt(status);
				loginService.updateStatus(username,statusNew);
			}
			
			log.info("用户"+username+"登录成功");
			return new ModelAndView("/homepage/indextest");
		}else{
			log.info("用户名或者密码不对");
			Map<String,Object> map = new HashMap<>();
			map.put("errmsg", "用户名或密码不正确，请重新输入。");
			return new ModelAndView("forward:/login.jsp",map);
		}
	}
	
	/**
	 * 注册
	 * @param username
	 * @param password
	 * @param session
	 * @return
	 */
	@RequestMapping(value = "/confirmRegister", method ={RequestMethod.POST,RequestMethod.GET})
	public ModelAndView register(String username, String password, HttpSession session){
		System.out.println(username+"___"+password);
		//查询账号是否存在
		boolean flag = loginService.login(username, password);
		if(flag){
			Map<String,Object> map = new HashMap<>();
			map.put("errmsg", "用户名已存在");
			return new ModelAndView("forward:/register.jsp",map);
		}
		//注册
		loginService.register(username, password);
		Map<String,Object> map = new HashMap<>();
		map.put("successMsg", username);
		String content = StitchingStringUtil.appendStr(username,password);
		SendEmailUtil.send(username,content);
		return new ModelAndView("forward:/registerInfo.jsp",map);
	}
	
	/**
	 * 修改密码
	 */
	@RequestMapping(value = "/confirmForget", method ={RequestMethod.POST,RequestMethod.GET})
	public ModelAndView forget(String username, HttpSession session){
		//忘记密码给用户发邮件
		boolean flag = loginService.loginUser(username);
		if(flag){
			Map<String, Object> map = new HashMap<>();
			map.put("errmsg", "该用户不存在！");
			return new ModelAndView("forward:/forget.jsp",map);
		}
		String content = StitchingStringUtil.appendStrUpdate(username);
		SendEmailUtil.send(username, content);
		return new ModelAndView("forward:/forgetInfo.jsp");
	}
}












