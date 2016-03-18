package com.github.demo.service;


import com.github.demo.model.User;
import com.github.pagehelper.Page;

public interface UserService {
	
	/**
	 * 根据id查询用户信息详情
	 * @param id
	 * @return
	 */
	public User queryUserById(Long id);
	
	/**
	 * 分页查询用户信息
	 * @param pageNo  页数
	 * @param pageSize  页大小
	 * @return
	 */
	public Page<User> queryUserByPage(int pageNo,int pageSize);
	
}
