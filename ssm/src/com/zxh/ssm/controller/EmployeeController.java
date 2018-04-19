package com.zxh.ssm.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.github.pagehelper.PageInfo;
import com.zxh.ssm.entity.Department;
import com.zxh.ssm.entity.Employee;
import com.zxh.ssm.service.DepartmentService;
import com.zxh.ssm.service.EmployeeService;

@Controller
@RequestMapping("/emp")
public class EmployeeController {
	//每页显示10条数据
	private static final int PAGESIZE = 10;
	
	@Autowired
	private EmployeeService employeeService;
	
	@Autowired
	private DepartmentService departmentService;
	
	/**
	 * 分页查询员工
	 * @param currPage
	 * @param map
	 * @return
	 */
	@RequestMapping(value="/list/{currPage}")
	public String pageEmployee(@PathVariable("currPage") Integer currPage, Map<String, Object> map) {
		System.out.println("当前页："+currPage);
		PageInfo<Employee> pagemp = employeeService.getEmplPage(currPage, PAGESIZE);
		//获取员工列表
		map.put("emps", pagemp.getList());//测试空数据pagemp.getList()则改为null
		//当前页
		map.put("currPage", currPage);
		//总页数
		map.put("totalPage", pagemp.getPages());
		return "emp/list";
	}
	/**
	 * 跳到添加员工页面
	 * @return
	 */
	@RequestMapping(value="/toadd")
	public String toAddEmp(Map<String, Object> map) {
		List<Department> depts = departmentService.getAllDepartment();
		map.put("depts", depts);
		return "emp/add";
	}
	/**
	 * 添加员工
	 * @param employee
	 * @return
	 */
	@RequestMapping(value="/add",method = RequestMethod.POST)
	public String addEmp(Employee employee) {
		System.out.println(employee);
		employeeService.addEmployee(employee);
		return "redirect:/emp/list/1";
	}
	/**
	 * 删除员工
	 * @param empId
	 * @param currPage
	 * @return
	 */
	@RequestMapping(value="/delete/{empId}/{currPage}")
	public ModelAndView deleteEmp(@PathVariable("empId") Integer empId,
			@PathVariable("currPage") Integer currPage) {
		employeeService.deleteEmployee(empId);
		ModelAndView mv = new ModelAndView("redirect:/emp/list/"+currPage);
		return mv;
	}
	/**
	 * 跳到编辑 页面
	 * @param empId
	 * @param currPage
	 * @param map
	 * @return
	 */
	@RequestMapping(value="/toedit/{empId}/{currPage}")
	public String toEditEmp(@PathVariable("empId") Integer empId,
			@PathVariable("currPage") Integer currPage, Map<String, Object> map) {
		List<Department> depts = departmentService.getAllDepartment();
		Employee emp = employeeService.getEmployee(empId);
		map.put("depts", depts);
		map.put("emp", emp);
		map.put("currPage", currPage);
		return "emp/edit";
	}
	
	/**
	 * 编辑员工
	 * @param employee
	 * @param currPage
	 * @return
	 */
	@RequestMapping(value="/edit", method=RequestMethod.POST)
	public String editEmp(Employee employee, @RequestParam("currPage") Integer currPage){
		System.out.println(employee);
		employeeService.updateEmployee(employee);
		return "redirect:/emp/list/" + currPage;
	}
	
}
