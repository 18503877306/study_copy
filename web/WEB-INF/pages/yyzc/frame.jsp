<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix='c' uri="http://java.sun.com/jsp/jstl/core" %>  
<%@ taglib prefix='fmt' uri="http://java.sun.com/jsp/jstl/fmt" %> 
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<%
String rootPath = request.getContextPath();
%>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title></title>
<link href="<%=rootPath %>/css/style.css" rel="stylesheet" type="text/css">
<script src="<%=rootPath %>/script/jquery.min.js" type="text/javascript"></script>
<script type="text/javascript" language="javascript">
$(function (){
//返回平台
    $(".platform-back a").click(function(){
		$(".header h4",window.top.document).html($(this).attr("ads"));
	});
});
$(function (){
//nav
    $(".system-top ul li a").click(function(){
		$(this).addClass("act").parents("li").siblings("li").find("a").removeClass("act");
	});
});

</script>
</head>
<body>
<div class="system-top">
	<div class="platform-back"><a href="http://localhost:8080/pages/fastWay.jsp" ads="综合业务服务和管理平台"><img src="<%=rootPath %>/images/home.png" alt="">返回平台</a></div>
	<ul>
	    <c:forEach items="${firstMenu}" var="menu" varStatus="it">
	      <c:choose>
		    <c:when test="${it.index == 0}">
		      <li><a class="act" href="<%=rootPath %>/yyzc/menu?leftMenuId=${menu.id}" target="twoLevelMenu">${menu.name}</a></li>
		    </c:when>
		    <c:when test="${it.index != 0}">
		      <li><a href="<%=rootPath %>/yyzc/menu?leftMenuId=${menu.id}" target="twoLevelMenu">${menu.name}</a></li>
		    </c:when>
		  </c:choose>
		</c:forEach>
	</ul>
</div>

<div class="sysmenu">
	<iframe src="<%=rootPath %>/yyzc/menu?leftMenuId=${leftMenuId}" name="twoLevelMenu" frameborder="0" width="100%" height="100%"></iframe>
</div>

</body>
</html>