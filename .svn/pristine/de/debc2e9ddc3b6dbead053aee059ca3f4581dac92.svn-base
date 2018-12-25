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
			var vForm=$("#ff")
	}); 
	
	function validSelect(obj){
		$("input[name='"+$(obj).attr('id')+"']").attr('datatype',$(obj).attr('datatype'));
		$("input[name='"+$(obj).attr('id')+"']").attr('errormsg',$(obj).attr('errormsg'));
		$("input[name='"+$(obj).attr('id')+"']").attr('nullmsg',$(obj).attr('nullmsg'));
		vForm.check(false);
	}
	
   function subForm(){
   	   $.post("updateTqSysMaterialResource", $("#ff").serialize(),
	   	function (data, textStatus){
	   //		handlerExp(data);
	      	var msg=data.message;
	      	if(msg)
	    	  alert(msg);
	   }, "json");
	   
   }    
       
</script>


	<form id="ff" method="post">
		<table>
				<tr>
					<td>资料ID</td>
					<td>
						<input type="text" name="materialId" id="materialId" class="dfinput"
						value="${tqSysMaterialResource.materialId}" /> 
					</td>
				</tr>
				<tr>
					<td>资料名称</td>
					<td>
						<input type="text" name="materialName" id="materialName" class="dfinput"
						value="${tqSysMaterialResource.materialName}" /> 
					</td>
				</tr>
				<tr>
					<td>状态 1正常 0 失效</td>
					<td>
						<input type="text" name="status" id="status" class="dfinput"
						value="${tqSysMaterialResource.status}" /> 
					</td>
				</tr>
				
				<tr>
					<td>资料编码(预留)</td>
					<td>
						<input type="text" name="materialCode" id="materialCode" class="dfinput"
						value="${tqSysMaterialResource.materialCode}" /> 
					</td>
				</tr>
				<tr>
					<td>资料备注</td>
					<td>
						<textarea name="materialRemark" id="materialRemark">${tqSysMaterialResource.materialRemark}</textarea>
					</td>
				</tr>
				<tr>
					<td>创建时间</td>
					<td>
						<input type="text" name="birthday" plugin="datepicker"
						value="${tqSysMaterialResource.createdTime}" />
					</td>
				</tr>
				<tr>
					<td>创建人ID</td>
					<td>
						<input type="text" name="createdById" id="createdById" class="dfinput"
						value="${tqSysMaterialResource.createdById}" /> 
					</td>
				</tr>
				<tr>
					<td>创建人姓名</td>
					<td>
						<input type="text" name="createdByName" id="createdByName" class="dfinput"
						value="${tqSysMaterialResource.createdByName}" /> 
					</td>
				</tr>
				<tr>
					<td>最后修改时间</td>
					<td>
						<input type="text" name="birthday" plugin="datepicker"
						value="${tqSysMaterialResource.lastModifiedTime}" />
					</td>
				</tr>
				<tr>
					<td>最后修改操作员ID</td>
					<td>
						<input type="text" name="lastModifiedById" id="lastModifiedById" class="dfinput"
						value="${tqSysMaterialResource.lastModifiedById}" /> 
					</td>
				</tr>
				<tr>
					<td>最后修改操作员姓名</td>
					<td>
						<input type="text" name="lastModifiedByName" id="lastModifiedByName" class="dfinput"
						value="${tqSysMaterialResource.lastModifiedByName}" /> 
					</td>
				</tr>
		</table>
		<input name="" type="button" class="btn" value="确认保存"
			onclick="subForm()" />
	</form>
</body>

