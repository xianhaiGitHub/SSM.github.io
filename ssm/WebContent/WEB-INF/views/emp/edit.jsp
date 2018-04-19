<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
	pageContext.setAttribute("path",path);
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>编辑员工</title>
</head>
<body>
	<h1>编辑员工</h1>
	<form action="${path }/emp/edit" method="post">
	
		<!-- 隐藏员工ID -->
		<input type="hidden" name="empId" value="${emp.empId}"/>
		
		<input type="hidden" name="currPage" value="${currPage}"/>
	
		员工姓名<input type="text" name="empName" value="${emp.empName}"/><br><br>
		
		员工性别<select name="gender">
				<option value="男" <c:if test="${emp.gender eq '男' }">selected</c:if> >男</option>
				<option value="女" <c:if test="${emp.gender eq '女' }">selected</c:if> >女</option>
			</select><br><br>
			
		员工邮箱<input type="text" name="email" value="${emp.email}"/><br><br>
		
		员工工资<input type="text" name="salary" value="${emp.salary}"/><br><br>
		员工职务<input type="text" name="jobTitle" value="${emp.jobTitle}"/><br><br>
		员工部门<select name="deptId">
			<c:forEach items="${depts }" var="dept">
				<option value='<c:out value="${dept.deptId }"/>'  
				<c:if test="${emp.deptId == dept.deptId }">selected</c:if> >
				<c:out value="${dept.deptName }"/></option>
			</c:forEach>
		</select>
		
		<br><br>
		
		<input type="submit"  value="修改"/><br>
	</form>
</body>
</html>