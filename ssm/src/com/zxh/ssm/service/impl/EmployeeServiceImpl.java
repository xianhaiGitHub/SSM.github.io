package com.zxh.ssm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zxh.ssm.entity.Employee;
import com.zxh.ssm.mapper.EmployeeMapper;
import com.zxh.ssm.service.EmployeeService;

@Service("employeeService")
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	private EmployeeMapper employeeMapper;
	
	@Override
	public PageInfo<Employee> getEmplPage(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		List<Employee> emps = employeeMapper.getEmplPage();
		PageInfo<Employee> pageinfo = new PageInfo<Employee>(emps);
		return pageinfo;
	}

	@Override
	public void deleteEmployee(int empId) {
		
		employeeMapper.deleteEmployee(empId);
	}

	@Override
	public void addEmployee(Employee emp) {
		employeeMapper.addEmployee(emp);
	}

	@Override
	public void updateEmployee(Employee emp) {
		employeeMapper.updateEmployee(emp);
	}

	@Override
	public Employee getEmployee(int empId) {
		return employeeMapper.getEmployee(empId);
	}

}
