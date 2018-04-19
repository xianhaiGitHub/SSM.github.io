package com.zxh.ssm.mapper;

import com.zxh.ssm.entity.User;

public interface UserMapper {
	
	public void addUser(User user);
	
	public User searchUser(String userName);
	
	public void updateUser(User user);
	
}
