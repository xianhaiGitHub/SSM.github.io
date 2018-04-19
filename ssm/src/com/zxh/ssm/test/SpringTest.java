package com.zxh.ssm.test;

import java.math.BigDecimal;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.github.pagehelper.PageInfo;
import com.zxh.ssm.entity.Department;
import com.zxh.ssm.entity.Employee;
import com.zxh.ssm.entity.User;
import com.zxh.ssm.mapper.UserMapper;
import com.zxh.ssm.service.DepartmentService;
import com.zxh.ssm.service.EmployeeService;
import com.zxh.ssm.service.UserService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:applicationContext.xml"})
public class SpringTest {
	
	@Autowired 
	private UserService userService;
	
	@Autowired 
	private UserMapper userMapper;
	
	@Autowired 
	private EmployeeService employeeService;
	
	@Autowired
	private DepartmentService departmentService;
	
	@Test
	public void testGetAllDepartment() {
		List<Department> deptList = departmentService.getAllDepartment();
		for (Department deps : deptList) {
			System.out.println(deps);
		}
	}
	
	@Test
	public void deleteEmp(){
		employeeService.deleteEmployee(58);
	}
	
	@Test
	public void updateEmp(){
		Employee emp = new Employee();
		emp.setEmpId(4);
		emp.setEmpName("吴所谓");
		emp.setGender("男");
		emp.setEmail("wwww@163.com");
		emp.setSalary(new BigDecimal(16000));
		emp.setJobTitle("Java架构师");
		emp.setDeptId(1003);
		employeeService.updateEmployee(emp);
	}
	
	@Test
	public void testAddEmployee() {
		Employee emp = new Employee();
		emp.setEmpName("赵先海");
		emp.setGender("男");
		emp.setEmail("2449070916@qq.com");
		emp.setSalary(new BigDecimal(50000));
		emp.setJobTitle("大数据工程师");
		emp.setDeptId(1001);
		employeeService.addEmployee(emp);
	}
	
	@Test
	public void testPageEmp() {
		PageInfo<Employee> emPage = employeeService.getEmplPage(2, 10);
		for (Employee emps : emPage.getList()) {
			System.out.println(emps);
		}
		System.out.println(emPage.getTotal());//总条数
		System.out.println(emPage.getPages());//总页数
	}
	
	@Test
	public void testUserService() {
		User user = new User();
		user.setId("123");
		user.setUserName("admin");
		user.setPassword("123456");
		user.setPwdkey("asdfgh");
		user.setMobile("18844992763");
		user.setCreateTime(new Date());
		userService.addUser(user);
	}
	
	@Test
	public void testSearchUser() {
		User user = userMapper.searchUser("admin");
		System.out.println(user);
	}
	@Test
	public void testUpdateUser() {
		User user = userMapper.searchUser("admin");
		System.out.println(user);
		user.setUserName("boss");
		userService.updateUser(user);
		System.out.println(user);
	}

}
