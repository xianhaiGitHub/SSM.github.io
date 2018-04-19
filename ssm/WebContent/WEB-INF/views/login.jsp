<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
	pageContext.setAttribute("path",path);
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>登录</title>
<script type="text/javascript">
	function reg() {
		location.href="${path}/reg";
	} 
</script>
</head>
<body>
	<h1>登录页面</h1>
	<form action="login" method="post">
		用户名:<input type="text" name="userName" /><br><br>
		密码:<input type="password" name="password" /><br><br>
		<input type="submit" value="登录" />&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
		<input type="button" value="注册" onclick="reg()"/>
	</form>
</body>
</html>