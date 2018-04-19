package com.zxh.ssm.service;

import com.github.pagehelper.PageInfo;
import com.zxh.ssm.entity.Employee;

public interface EmployeeService {
	
	public PageInfo<Employee> getEmplPage(int pageNum, int pageSize);
	
	public void deleteEmployee(int empId);

	public void addEmployee(Employee emp);

	public void updateEmployee(Employee emp);
	
	public Employee getEmployee(int empId);
		
}
