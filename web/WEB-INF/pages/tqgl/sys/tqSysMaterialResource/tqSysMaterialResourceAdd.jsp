<%@ page contentType="text/html; charset=UTF-8"%>

<head>
<!--  引入jquery的文件（如果check方法未定义，就去掉然后用easyui的表单验证）    -->
<%@include file="../../../../js-library/jslib_header.jsp"%>

<title>系统_业务资料资源表 定义提取业务中所有的资料名称、代码。 可配置是否失效编辑页面</title>
</head>

<body>

<script type="text/javascript">
	var vForm;
	$(document).ready(function(){
	//	var vForm=$("#ff").Validform({tiptype:3});
	//		var vForm=$("#ff")
	}); 
	
	function validSelect(obj){
		$("input[name='"+$(obj).attr('id')+"']").attr('datatype',$(obj).attr('datatype'));
		$("input[name='"+$(obj).attr('id')+"']").attr('errormsg',$(obj).attr('errormsg'));
		$("input[name='"+$(obj).attr('id')+"']").attr('nullmsg',$(obj).attr('nullmsg'));
		vForm.check(false);
	}
	
   function subForm(){
   	   $("#form").submit();
   }    
       
</script>


	<form id="form" method="post" action="saveTqSysMaterialResource">
		
		<table>
				<tr>
					<td>资料名称</td>
					<td>
						<input type="text" name="materialName" id="materialName" class="dfinput"
						/> 
					</td>
				</tr>
				<tr>
					<td>状态</td>
					<td>
					正常 <input type="radio" name="status" value="0" class="dfinput" checked/>
					失效<input type="radio" name="status" value="1" class="dfinput"/>
					<td>
				</tr>
				
				<tr>
					<td>资料编码</td>
					<td>
						<input type="text" name="materialCode" id="materialCode" class="dfinput"
					 /> 
					</td>
				</tr>
				<tr>
					<td>资料备注</td>
					<td>
						
						 <textarea name="materialRemark" id="materialRemark" ></textarea>
					</td>
				</tr>
				
		</table>
		<input name="" type="button" class="btn" value="确认保存"
			onclick="subForm()" />
		<input name="" type="button" class="btn" value="返回"
			onclick="history.go(-1);" />	
	</form>
</body>

