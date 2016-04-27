package com.github.demo.service;


public interface LoginService {

	public boolean login(String username, String password);
	
	public void register(String username, String password);
}
