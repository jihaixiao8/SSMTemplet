package com.github.demo.service;


import com.github.demo.model.User;
import com.github.pagehelper.Page;

public interface UserService {
	
	/**
	 * ����id��ѯ�û���Ϣ����
	 * @param id
	 * @return
	 */
	public User queryUserById(Long id);
	
	/**
	 * ��ҳ��ѯ�û���Ϣ
	 * @param pageNo  ҳ��
	 * @param pageSize  ҳ��С
	 * @return
	 */
	public Page<User> queryUserByPage(int pageNo,int pageSize);
	
}
