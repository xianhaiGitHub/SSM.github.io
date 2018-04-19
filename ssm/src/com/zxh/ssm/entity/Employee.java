package com.zxh.ssm.entity;

import java.math.BigDecimal;
/**
 * 
 * @author zhaoxianhai
 * 2018年3月10日
 * @version 1.0
 */
public class Employee implements java.io.Serializable{

	private static final long serialVersionUID = 1L;

	private int empId;
	
	private String empName;
	
	private String gender;
	
	private String email;
	
	private BigDecimal salary;
	
	private String jobTitle;
	
	private int deptId;

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public BigDecimal getSalary() {
		return salary;
	}

	public void setSalary(BigDecimal salary) {
		this.salary = salary;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	public int getDeptId() {
		return deptId;
	}

	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", gender=" + gender + ", email=" + email
				+ ", salary=" + salary + ", jobTitle=" + jobTitle + ", deptId=" + deptId + "]";
	}


	
}
