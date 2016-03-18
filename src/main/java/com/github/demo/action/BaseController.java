package com.github.demo.action;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;








import com.github.demo.model.User;
import com.github.demo.service.UserService;
import com.github.pagehelper.Page;

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
	public Page<User> testJson(){
		log.info("开始执行方法");
		Page<User> page = userService.queryUserByPage(1,2);
		return page;
	}
	
}
