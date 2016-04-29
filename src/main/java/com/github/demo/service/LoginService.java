package com.github.demo.service;


public interface LoginService {

	public boolean login(String username, String password);
	
	public boolean loginUser(String username);
	
	public void register(String username, String password);
	
	public void updateStatus(String username, int statusNew);
}
