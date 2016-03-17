package com.github.demo.action;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;



import com.github.demo.model.User;

@Controller
@RequestMapping("/base")
public class BaseController {
	
	private static Logger log = LoggerFactory.getLogger(BaseController.class);
	
	@RequestMapping("/test")
	public String test(){
		return "/index";
	}
	
	@RequestMapping("/json")
	@ResponseBody
	public User testJson(){
		log.info("��ʼִ�з���");
		User user = new User();
		user.setName("����");
		user.setSex("Ů");
		return user;
	}
	
}
