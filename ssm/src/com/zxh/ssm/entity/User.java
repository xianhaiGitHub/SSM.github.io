package com.zxh.ssm.entity;

import java.util.Date;

/**
 * 
 * @author zhaoxianhai
 * 2018Äê3ÔÂ10ÈÕ
 * @version 1.0
 */
public class User implements java.io.Serializable{
	
	private static final long serialVersionUID = 1L;

	private String id;
	
	private String userName;
	
	private String password;
	
	private String pwdkey;
	
	private String mobile;
	
	private Date createTime;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPwdkey() {
		return pwdkey;
	}

	public void setPwdkey(String pwdkey) {
		this.pwdkey = pwdkey;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", userName=" + userName + ", password=" + password + ", pwdkey=" + pwdkey
				+ ", mobile=" + mobile + ", createTime=" + createTime + "]";
	}
	
}
