package com.github.demo.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.dao.DataAccessException;

import com.github.demo.model.User;
import com.github.pagehelper.Page;

public interface UserMapper {
	
	/**
	 * 根据id查询User
	 * @param id
	 * @return
	 * @throws DataAccessException
	 */
	public User findById(@Param("id") long id,@Param("status") Integer status) throws DataAccessException;
	
	/**
	 * 分页查询User详情
	 * @return
	 * @throws DataAccessException
	 */
	public Page<User> findByPage() throws DataAccessException;
		
	/**
	 * 更新用户信息
	 * @param user
	 * @return
	 * @throws DataAccessException
	 */
	public int update(User user) throws DataAccessException;
	
	/**
	 * 插入用户信息
	 * @param user
	 * @return
	 * @throws DataAccessException
	 */
	public int insert(User user) throws DataAccessException;

}
