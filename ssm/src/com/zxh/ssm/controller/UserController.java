package com.zxh.ssm.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.zxh.ssm.entity.User;
import com.zxh.ssm.service.UserService;

/**
 * 用户控制层
 * @author zhaoxianhai
 *
 */
@Controller
public class UserController {
	
	@Autowired
	private UserService userService;
	
	/**
	 * 进入用户登录
	 * 
	 */
	@RequestMapping("/home")
	public String home () {
		return "login";
	}
	/**
	 * 进入注册页面
	 */
	@RequestMapping("/reg")
	public  String  register() {
		return "reg";
	}
	/**
	 * 用户注册
	 * @param user
	 * @param model
	 * @return
	 */
	@RequestMapping(value="/register", method=RequestMethod.POST) 
	public String registerUser(User user, Model model) {
		System.out.println(user);
		userService.registerUser(user);
		model.addAttribute("regFlag","注册成功,请登录");
		return "reg";
	}
	/**
	 * 用户登录
	 * @param userName
	 * @param password
	 * @param map
	 * @return
	 */
	@RequestMapping(value="/login", method=RequestMethod.POST)
	public String userLogin(@RequestParam(value="userName") String userName,
			@RequestParam(value="password") String password,Map<String, Object> map) {
		boolean flag = userService.userLogin(userName, password);
		if(flag) {
			return "main";			
		}else {
			map.put("regFlag", "您还没有注册或忘记密码");
			return "reg";
		}
	}
}
