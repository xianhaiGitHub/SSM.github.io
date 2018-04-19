package com.zxh.ssm.service;

import com.zxh.ssm.entity.User;

public interface UserService {
	
	public void addUser(User user);
	
	public void updateUser(User user);
	
	public void registerUser(User user);
	
	public boolean userLogin(String userName, String password);

	
}
