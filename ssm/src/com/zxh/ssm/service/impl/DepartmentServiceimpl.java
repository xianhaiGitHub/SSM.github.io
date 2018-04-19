package com.zxh.ssm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zxh.ssm.entity.Department;
import com.zxh.ssm.mapper.DepartmentMapper;
import com.zxh.ssm.service.DepartmentService;

@Service("departmentService")
public class DepartmentServiceimpl implements DepartmentService {
	
	@Autowired
	private DepartmentMapper departmentMapper;
	 
	@Override 
	public List<Department> getAllDepartment() {
		
		return departmentMapper.getAllDepartment();
	}

}
