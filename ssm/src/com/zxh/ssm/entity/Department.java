package com.zxh.ssm.entity;

import java.util.List;

/**
 * 
 * @author zhaoxianhai
 * 2018年3月10日
 * @version 1.0
 */
public class Department implements java.io.Serializable{

	private static final long serialVersionUID = 1L;

	private int deptId;

	private String deptName;
	
	//private Admin Admin;
	//private List<Employee> emps;
	private int empId;
	
	private String empName;


//	public Admin getAdmin() {
//		return Admin;
//	}
//
//	public void setAdmin(Admin admin) {
//		Admin = admin;
//	}

//	public List<Employee> getEmps() {
//		return emps;
//	}
//
//	public void setEmps(List<Employee> emps) {
//		this.emps = emps;
//	}

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

	public int getDeptId() {
		return deptId;
	}

	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	@Override
	public String toString() {
		return "Department [deptId=" + deptId + ", deptName=" + deptName + ", empId=" + empId + ", empName=" + empName
				+ "]";
	}
	
}
