package com.github.demo.dao;

import org.springframework.dao.DataAccessException;

import com.github.demo.model.User;
import com.github.pagehelper.Page;

public interface UserMapper {
	
	/**
	 * 根据id查询用户
	 * @param id
	 * @return
	 * @throws DataAccessException
	 */
	public User findById(long id) throws DataAccessException;
	
	/**
	 * 分页查询用户信息
	 * @return
	 * @throws DataAccessException
	 */
	public Page<User> findByPage() throws DataAccessException;

}
