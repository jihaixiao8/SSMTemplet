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
	public User queryUserById(Long id,Integer status) {
		if(id == null){
			logger.info("用户id为空");
			return null;
		}
		return userMapper.findById(id,status);
	}

	@Override
	public Page<User> queryUserByPage(int pageNo,int pageSize) {
		PageHelper.startPage(pageNo, pageSize);
		Page<User> page = userMapper.findByPage();
		return page;
	}

	@Override
	public Long addUser(User user) {
		if(user == null){
			logger.info("user为空，退出");
			return null;
		}
		userMapper.insert(user);
		return user.getId();
	}

	@Override
	public boolean updateUser(User user) {
		if(user == null){
			logger.info("user为空，更新失败");
			return false;
		}
		int result = userMapper.update(user);
		return result > 0;
	}

	@Override
	public Page<User> queryUserByCondition(User user, int pageNo, int pageSize) {
		PageHelper.startPage(pageNo, pageSize);
		Page<User> page = userMapper.findByCondition(user);
		return page;
	}
	
}
