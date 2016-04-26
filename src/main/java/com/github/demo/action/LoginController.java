package com.github.demo.action;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.github.demo.service.LoginService;

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
	
	@RequestMapping(value = "/confirmLogin", method ={RequestMethod.POST,RequestMethod.GET})
	public ModelAndView login(ModelMap modelMap, String username, String password, HttpSession session){
		log.info("登录开始，用户名："+username+"密码："+password+"!");
		boolean flag = loginService.login(username, password);
		if(flag){
			session.setAttribute("username", username);
			log.info("用户"+username+"登录成功");
			return new ModelAndView("/homepage/indextest");
		}else{
			log.info("用户名或者密码不对");
			return new ModelAndView("redirect:/login.jsp");
		}
	}
	
}
