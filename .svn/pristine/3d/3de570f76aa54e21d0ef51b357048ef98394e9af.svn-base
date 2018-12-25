<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix='c' uri="http://java.sun.com/jsp/jstl/core" %>  
<!doctype html>
<html>
<head>
<%
String rootPath = request.getContextPath();
%>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title></title>
<link href="<%=rootPath %>/css/style.css" rel="stylesheet" type="text/css">
<link href="<%=rootPath %>/css/scrollbar.css" rel="stylesheet" type="text/css">
<script src="<%=rootPath %>/script/jquery.min.js" type="text/javascript"></script>
<script src="<%=rootPath %>/script/scrollbar.min.js" type="text/javascript"></script>
<script type="text/javascript" language="javascript">
$(function (){
//模拟滚动条
    $(".system-menu").perfectScrollbar();
});
$(function (){
//menu
    $(".system-menu dt span").click(function(){
		if($(this).hasClass("col")){
			$(this).removeClass("col")
				.parents("dt").siblings("dd").slideUp(200);
		}else{
			$(this).addClass("col")
				.parents("dt").siblings("dd").slideDown(200);
		}
	});
    $(".system-menu a").click(function(){
		$(".system-menu a,.system-menu span").removeClass("act");
		$(this).addClass("act")
			.parents("dd").siblings("dt").find("span").addClass("act");
	});
});
</script>
</head>
<body>
<div class="system-menu">
	<div class="box">
		<c:forEach items="${secondMenu}" var="menu2" varStatus="it2">
		  <c:choose>
		    <c:when test="${menu2.thirdMenu == 'no'}">
		  	  <dl>
				<dt><span><a href="<%=rootPath %>${menu2.url}" target="twoLevelMain">${menu2.name}</a></span></dt>
		  	  </dl>
		  	</c:when>
		  	<c:otherwise>
		  	  <dl>
			    <dt><span>${menu2.name}</span></dt>
			    <c:forEach items="${menu2.thirdMenu}" var="menu3" varStatus="it3">
			    <dd>
				  <a href="<%=rootPath %>${menu3.url}" target="twoLevelMain">${menu3.name}</a>
			    </dd>
			    </c:forEach>
		      </dl>
		  	</c:otherwise>
		  </c:choose>
		</c:forEach>
	</div>
</div>

<div class="sysmain">
	<iframe src="" name="twoLevelMain" frameborder="0" width="100%" height="100%"></iframe>
</div>

</body>
</html>