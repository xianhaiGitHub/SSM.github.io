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
<title>员工列表页</title>
<link rel="stylesheet" type="text/css" href="${path }/jsAndcss/css/table.css"/>
</head>
<body>
	<h1>员工列表</h1>
	<!-- 对查询到的数据进行判断 -->
	<c:if test="${empty emps }">
		没有查到员工信息
	</c:if>
	<c:if test="${!empty emps }">
		<table  border="1" cellpadding="10" cellspacing="0">
			<tr>
				<td colspan="9" align="left">
					<input id="btn" type="button" value="添加" onclick="addEmp()"/>
				</td>
			</tr>
			<tr>
				<th>ID</th>   
				<th>姓名</th>
				<th>性别</th>
				<th width="300px">Email</th>
				<th>工资</th>
				<th>职务</th>
				<th>部门</th>
				<th class="bg-edit">编辑操作</th>
				<th class="bg-dele">删除操作</th>
			</tr>
			<c:forEach items="${emps }" var="emp" >
				<tr>
					<td>${emp.empId }</td>
					<td>${emp.empName }</td>
					<td>${emp.gender }</td>
					<td>${emp.email }</td>
					<td>${emp.salary }</td>
					<td>${emp.jobTitle }</td>
					<td>${emp.deptId }</td>
					<td class="bg-edit"><a href="${path }/emp/toedit/${emp.empId}/${currPage }">Edit</a></td>
					<td class="bg-dele"><a href="${path }/emp/delete/${emp.empId}/${currPage }" onclick="javascript:return del();">Delete</a></td>
				</tr>
			</c:forEach>
			
			<!-- 分页 -->
			<tr class="table-foot">
				<td class="table-foot" colspan="9">
					<span>第<c:out value="${currPage }"/>页</span><span>共<c:out value="${totalPage }"/>页</span>
					<c:if test="${currPage !=1 }">
						<a href="${path }/emp/list/1">首页</a>
						<a href="${path }/emp/list/<c:out value="${currPage-1 }"/>">上一页</a>
					</c:if>
					<c:if test="${currPage != totalPage }">
						<a href="${path }/emp/list/<c:out value="${currPage+1  }"/>">下一页</a>
						<a href="${path }/emp/list/<c:out value="${totalPage }"/>">尾页</a>
					</c:if>
				</td>
			</tr>
		</table>
	</c:if>
	
<script type="text/javascript" src="${path }/jsAndcss/js/jquery-1.9.1.min.js"></script>
<script type="text/javascript">
	function addEmp() {
		location.href ="${path}/emp/toadd"
	}
	function del() {
		var msg ="您确定要删除该员工?";
		return confirm(msg) == true? true:false;
	}
</script>
</body>
</html>
