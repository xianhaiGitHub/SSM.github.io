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
<title>添加员工</title>
</head>
<body>
	<h1>添加员工</h1>
	<form action="${path }/emp/add" method="post">
		员工姓名：<input type="text" name="empName" /><br><br>
		员工性别：<select name="gender">
				<option value="男">男</option>
				<option value="女">女</option>
			</select><br><br>
		员工邮箱：<input type="text" name="email" /><br><br>
		员工工资：<input type="text" name="salary" /><br><br>
		员工职务：<input type="text" name="jobTitle" /><br><br>
		员工部门：<select name="deptId">
				<c:forEach items="${depts }" var="dept">
					<option value='<c:out value="${dept.deptId }"/>'>
						<c:out value="${dept.deptName }"></c:out>
					</option>
				</c:forEach>
			</select><br><br>
		<input type="submit"  value="添加"/><br>
	</form>
</body>
</html>