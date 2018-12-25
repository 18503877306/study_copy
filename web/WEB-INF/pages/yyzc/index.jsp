<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<%
String rootPath = request.getContextPath();
%>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title></title>
<link href="<%=rootPath %>/css/style.css" rel="stylesheet" type="text/css">
<style>
	html{
		height: 100%;
	}
</style>
</head>



<body class="shell-body">

<div class="header">
	<h3><img src="<%=rootPath %>/images/logo-w.png" alt=""></h3>
	<h4>综合业务服务和管理平台</h4>
	<dl>
		<dt>
			<img src="<%=rootPath %>/images/hicon01.png" alt="">
			欢迎您，<span>${currentPerson.name}</span>
		</dt>
		<dd>
			<a href="#"><img src="<%=rootPath %>/images/hicon02.png" alt="">修改密码</a>
			<a href="#"><img src="<%=rootPath %>/images/hicon03.png" alt="">退出</a>
		</dd>
	</dl>
</div>

<div class="main">
	<iframe src="<%=rootPath %>/yyzc/frame" name="mainIframe" frameborder="0" width="100%" height="100%"></iframe>
</div>
</body>
</html>