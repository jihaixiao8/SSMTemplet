package com.github.demo.service;


import com.github.demo.model.User;
import com.github.pagehelper.Page;

public interface UserService {
	
	/**
	 * 根据Id查询有效用户
	 * @param id
	 * @return
	 */
	public User queryUserById(Long id);
	
	/**
	 * 分页查询用户
	 * @param pageNo  页数
	 * @param pageSize  页大小
	 * @return
	 */
	public Page<User> queryUserByPage(int pageNo,int pageSize);
	
	/**
	 * 添加新用户
	 * @param user
	 * @return  新增用户的id
	 */
	public Long addUser(User user);
	
	/**
	 * 修改用户信息
	 * @param user
	 * @return
	 */
	public boolean updateUser(User user);
	
}
