package com.github.demo.action;

import java.io.File;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.http.protocol.HTTP;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import com.github.demo.model.User;
import com.github.demo.service.UserService;
import com.github.pagehelper.Page;

import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/base")
public class BaseController {
	
	private static Logger log = LoggerFactory.getLogger(BaseController.class);
	
	@Resource
	private UserService userService;
	
	@RequestMapping("/test")
	public String test(){
		return "/index";
	}
	
	@RequestMapping("/json")
	@ResponseBody
	public Page<User> testJson(HttpServletRequest request){
		String s = (String) request.getAttribute("name");
		log.info("开始");
		User user = new User();
		user.setStatus(1);
		user.setEndTime(new Date());
		Page<User> page = userService.queryUserByCondition(user, 1, 2);
		return page;
	}
	
	@RequestMapping("/insert")
	@ResponseBody
	public Long insert(){
		log.info("开始插入数据");
		User user = new User();
		user.setUsername("liubao");
		user.setPassword("12344");
		user.setMobile("15233311211");
		user.setStatus(1);
		Long id = userService.addUser(user);

		return id;
	}
	
	@RequestMapping("/update")
	@ResponseBody
	public boolean update(){
		log.info("开始插入数据");
		User user = userService.queryUserById(7L,null);
		if(user == null){
			log.error("没有数据");
			return false;
		}
		user.setStatus(0);
		boolean result = userService.updateUser(user);
		return result;
	}
	
	@RequestMapping("/upload")
	public String uploadImage(@RequestParam(value="file") MultipartFile file
			,HttpServletRequest request,ModelMap model){
		String realPath = request.getSession().getServletContext().getRealPath("/upload");
		String fileName = file.getOriginalFilename();
		log.info("path is ",realPath);
		File targetFile = new File(realPath, fileName);  
		if(!targetFile.exists()){  
		    targetFile.mkdirs();  
		}
        try {  
            file.transferTo(targetFile);  
        } catch (Exception e) {  
            e.printStackTrace();  
        }
        model.addAttribute("fileUrl", request.getContextPath()+"/upload/"+fileName);          
        return "/result";  
	}

	@RequestMapping(value = "/test1",method = {RequestMethod.POST,RequestMethod.GET})
	@ResponseBody
	public Map<String,Object> test1(@RequestBody(required = false) String uname,@RequestBody(required = false) String pwd){
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("uname",uname);
		map.put("pwd",pwd);
		return map;
	}

	@RequestMapping(value = "/register",method = RequestMethod.POST)
    @ResponseBody
    public Long testRegister(){

    }


}
