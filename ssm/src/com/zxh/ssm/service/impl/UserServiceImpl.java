package com.zxh.ssm.service.impl;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zxh.ssm.entity.User;
import com.zxh.ssm.mapper.UserMapper;
import com.zxh.ssm.service.UserService;
import com.zxh.ssm.utils.MD5Utils;
import com.zxh.ssm.utils.StringTools;


@Service("userService")
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserMapper userMapper;
	
	@Override
	public void addUser(User user) {
		
		userMapper.addUser(user);
	}

	@Override
	public void updateUser(User user) {
		userMapper.updateUser(user);
	}

	@Override
	public void registerUser(User user) {
		String id = StringTools.getUUID();//获取uuid
		String key = StringTools.getStringRamdom(6);//获取6位随机字符
		String pwd = MD5Utils.getMD5Str(user.getPassword() + key);//加密
		
		user.setId(id);
		user.setPassword(pwd);
		user.setPwdkey(key);
		user.setCreateTime(new Date());
		userMapper.addUser(user);
	}

	@Override
	public boolean userLogin(String userName, String password) {
		//查询用户
		User user = userMapper.searchUser(userName);
		//判断用户是否存在
		if(user == null) {
			return false;
		}
		String pwd =MD5Utils.getMD5Str(password + user.getPwdkey());
		//判断密码是否一致
		if(pwd.equals(user.getPassword())) {
			return true;
		}else {
			return false;
		}
	}
}
