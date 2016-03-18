package com.github.demo.dao;

import org.springframework.dao.DataAccessException;

import com.github.demo.model.User;
import com.github.pagehelper.Page;

public interface UserMapper {
	
	/**
	 * ����id��ѯ�û�
	 * @param id
	 * @return
	 * @throws DataAccessException
	 */
	public User findById(long id) throws DataAccessException;
	
	/**
	 * ��ҳ��ѯ�û���Ϣ
	 * @return
	 * @throws DataAccessException
	 */
	public Page<User> findByPage() throws DataAccessException;

}
