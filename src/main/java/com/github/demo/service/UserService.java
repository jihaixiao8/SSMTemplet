package com.github.demo.service;


import java.util.List;

import com.github.demo.model.User;
import com.github.pagehelper.Page;

public interface UserService {
	
	/**
	 * 根据id查询用户信息
	 * @param id
	 * @param status
	 * @return
	 */
	public User queryUserById(Long id,Integer status);
	
	/**
	 * 根据条件查询用户
	 * @param user
	 * @param pageNo
	 * @param pageSize
	 * @return
	 */
	public Page<User> queryUserByCondition(User user,int pageNo,int pageSize);
	
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
	 * 批量添加用户
	 * @param users
	 * @return
	 */
	public int addUser(List<User> users);
	
	/**
	 * 修改用户信息
	 * @param user
	 * @return
	 */
	public boolean updateUser(User user);
	
	/**
	 * 根据用户名查找
	 * @param username
	 * @return
	 */
	public User findUserByUserName(String username);
	
}
