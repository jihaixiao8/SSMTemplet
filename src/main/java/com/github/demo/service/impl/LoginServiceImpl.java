package com.github.demo.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.github.demo.dao.UserMapper;
import com.github.demo.model.User;
import com.github.demo.service.LoginService;

@Service
public class LoginServiceImpl implements LoginService{

	@Resource 
	private UserMapper userMapper;
	
	
	public boolean login(String username, String password) {
		int loginResult  = userMapper.fingLogin(username,password);
		if(loginResult==1){
			return true;
		}
		return false;
	}

	public void register(String username, String password) {
		User user = new User();
		user.setUsername(username);
		user.setPassword(password);
		userMapper.insert(user);
	}

}
