package com.github.demo.service.impl;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.github.demo.dao.UserMapper;
import com.github.demo.model.User;
import com.github.demo.service.UserService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;


@Service
public class UserServiceImpl implements UserService{
	
	private static Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);
	
	@Resource
	private UserMapper userMapper;

	@Override
	public User queryUserById(Long id) {
		if(id == null){
			logger.info("用户Id为空,方法退出");
			return null;
		}
		return userMapper.findById(id);
	}

	@Override
	public Page<User> queryUserByPage(int pageNo,int pageSize) {
		PageHelper.startPage(pageNo, pageSize);
		Page<User> page = userMapper.findByPage();
		return page;
	}
	
}
