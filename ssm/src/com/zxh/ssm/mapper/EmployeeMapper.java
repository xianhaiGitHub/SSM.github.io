package com.zxh.ssm.mapper;

import java.util.List;

import com.zxh.ssm.entity.Employee;

public interface EmployeeMapper {
	
	public List<Employee> getEmplPage();
	
	public void deleteEmployee(int empId);

	public void addEmployee(Employee emp);

	public void updateEmployee(Employee emp);
	
	public Employee getEmployee(int empId);
}
