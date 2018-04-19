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
<title>注册页面</title>
<script type="text/javascript">
	function back() {
		location.href="home";
	}
</script>
</head>
<body>
	<form action="register" method="post">
		用户名：<input type="text" name="userName" /><br><br>
		密码：<input type="password" name="password" /><br><br>
		电话：<input type="text" name="mobile" /><br><br>
		<input type="submit" value="提交" />&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
		<input type="button" value="返回" onclick="back()"/><br>
		<p><font color="red" size="16">${regFlag }</font></p>
	</form>

</body>
</html>