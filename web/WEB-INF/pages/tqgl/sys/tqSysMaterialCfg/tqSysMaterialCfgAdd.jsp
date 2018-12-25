<%@ page contentType="text/html; charset=UTF-8"%>

<head>
<!--  引入jquery的文件（如果check方法未定义，就去掉然后用easyui的表单验证）    -->
<%@include file="../../../../js-library/jslib_header.jsp"%>
<title>系统_业务资料配置表 根据业务编号 配置具体业务需要的业务资料，用于受理时确认资料是否齐全；另外是否需要影像等也可以配置在这里  需要配置 显示顺序、是否强制、是否需要影像（否、是、可选）、资料名称、资料代码等。   业务实现的时候需要检查配置中的资料是否失效了编辑页面</title>
</head>

<body>

<script type="text/javascript">

	

	var vForm;
	$(document).ready(function(){
	//	var vForm=$("#ff").Validform({tiptype:3});
			var vForm=$("#ff");
			
			loadByStatus();
			
			$("input:radio[name='status']").change(function(){
				loadByStatus();
			});  
	}); 
	
	function validSelect(obj){
		$("input[name='"+$(obj).attr('id')+"']").attr('datatype',$(obj).attr('datatype'));
		$("input[name='"+$(obj).attr('id')+"']").attr('errormsg',$(obj).attr('errormsg'));
		$("input[name='"+$(obj).attr('id')+"']").attr('nullmsg',$(obj).attr('nullmsg'));
		vForm.check(false);
	}
	
   function subForm(){
 /*   	   $.post("updateTqSysMaterialCfg", $("#ff").serialize(),
	   	function (data, textStatus){
	   //		handlerExp(data);
	      	var msg=data.message;
	      	if(msg)
	    	  alert(msg);
	   }, "json");
	    */
	    
	   $("form").submit();
	    
   }
   
   
   function loadByStatus(){
	   
		var status = $("input[name='status']:checked").val();
		
		if(status == 0 ){  //正常
			
			$("#effect").hide();
			$("#effectTime").val('');
			
		}else if(status == 2){ //未生效

			$("#effect").show();
			
		}
	   
   }
   
   
   
   
</script>


	<form id="form" method="post" action="saveTqSysMaterialCfg">
		<table>
				<tr>
					<td>业务资料配置名称</td>
					<td>
						<input type="text" name="materialCfgName" id="materialCfgName" class="dfinput"
					 /> 
					</td>
				</tr>
				
				<tr>
					<td>业务类型</td>
					<td>
						<input type="text" name="businessType" id="businessType" class="dfinput"
						/> 
					</td>
				</tr>
				<tr>
					<td>业务明细类型</td>
					<td>
						<input type="text" name="businessTypeDetail" id="businessTypeDetail" class="dfinput"
						 /> 
					</td>
				</tr>
				
				<tr>
					
					<td>是否立即生效 </td>
					<td>
					是<input type="radio" name="status" value="0" class="dfinput"  checked/>
					否<input type="radio" name="status" value="2" class="dfinput"/>
					
					<td>
					
				</tr>
				
				
				<tr id="effect">
					<td>生效时间</td>
					<td>
						<input type="text" id="effectTime" name="effectTime" plugin="datepicker"
						/>
					</td>
				</tr>
				<tr>
					<td>配置说明</td>
					<td><textarea  name="remark" id="remark" ></textarea></td> 
				</tr>
		</table>
		<input name="" type="button" class="btn" value="确认保存"
			onclick="subForm()" />
		<input name="" type="button" class="btn" value="返回"
			onclick="history.go(-1);" />
	</form>
</body>

