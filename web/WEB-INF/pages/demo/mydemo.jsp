<%@ page contentType="text/html; charset=UTF-8"%>
<head>
<!--  需要引入必要的js文件，这里需要jquery基本js文件，以及easyui所需要的文件    -->
<%@include file="/WEB-INF/js-library/jslib_header.jsp"%>
<title>demo列表</title>

</head>


<body>

<script type="text/javascript">
	var vForm;
	$(document).ready(function(){
	//	var vForm=$("#ff").Validform({tiptype:3});
			var vForm=$("#ff")
	}); 
	
	function validSelect(obj){
		$("input[name='"+$(obj).attr('id')+"']").attr('datatype',$(obj).attr('datatype'));
		$("input[name='"+$(obj).attr('id')+"']").attr('errormsg',$(obj).attr('errormsg'));
		$("input[name='"+$(obj).attr('id')+"']").attr('nullmsg',$(obj).attr('nullmsg'));
		vForm.check(false);
	}
	
   function subForm(){
   	   $.post("addResource", $("#ff").serialize(),
	   	function (data, textStatus){
// 	   		handlerExp(data);
	      	var msg=data.message;
	      	if(msg)
	    	  alert(msg);
	   }, "json");
   
   }    
       
 	 function subForm2(){
 		vForm.submit();
    	 }
</script>
   
<h2>Basic Calendar</h2>
	<form id="ff" method="post">
		<input id="tqSysMaterialResource.materialName" name ="materialName" value ="${tqSysMaterialResource.materialName}" >
		<input id="tqSysMaterialResource.materialCode" name ="materialCode" value ="${tqSysMaterialResource.materialName}">
		<input id="tqSysMaterialResource.status" name ="status" value ="${tqSysMaterialResource.status}">
		<input name="" type="button" class="btn" value="确认保存"
			onclick="subForm()" />
	</form>
	
	this is mydemo
</body>

