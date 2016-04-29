package com.github.demo.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.dao.DataAccessException;

import com.github.demo.model.User;
import com.github.pagehelper.Page;

public interface UserMapper {
	
	/**
	 * 登录
	 * @param id
	 * @param password
	 * @return
	 */
	public int fingLogin(@Param("username") String username, @Param("password") String password);
	
	/**
	 * 根据用户名查询用户是否存在
	 * @param username
	 * @return
	 */
	public int loginUser(@Param("username") String username);
	/**
	 * 根据id查询User
	 * @param id
	 * @return
	 * @throws DataAccessException
	 */
	public User findById(@Param("id") long id,@Param("status") Integer status) throws DataAccessException;
	
	/**
	 * 根据条件查询User
	 * @param user
	 * @return
	 * @throws DataAccessException
	 */
	public Page<User> findByCondition(@Param("user") User user) throws DataAccessException;
	
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
	
	/**
	 * 批量插入用户信息
	 * @param users
	 * @return
	 * @throws DataAccessException
	 */
	public int batchInsert(List<User> users) throws DataAccessException;
	
	/**
	 * 根据用户名查该用户
	 * @param username
	 * @return
	 */
	public User findUserByUserName(@Param("username") String username);

}
