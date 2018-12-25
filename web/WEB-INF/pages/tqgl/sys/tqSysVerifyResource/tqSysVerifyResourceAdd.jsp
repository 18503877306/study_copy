<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%@include file="/WEB-INF/js-library/jslib_header.jsp"%>
<title>验证项添加信息页面</title>
</head>
<body>
<script type="text/javascript">
	function validSelect(obj){
		$("input[name='"+$(obj).attr('id')+"']").attr('datatype',$(obj).attr('datatype'));
		$("input[name='"+$(obj).attr('id')+"']").attr('errormsg',$(obj).attr('errormsg'));
		$("input[name='"+$(obj).attr('id')+"']").attr('nullmsg',$(obj).attr('nullmsg'));
		vForm.check(false);
	}
       
</script>
<form id="ff" action = "saveTqSysVerifyResource"  method="post">
		<table>
				<!-- <tr>
					<td>验证项ID</td>
					<td>
						<input type="text" name="verifyId" id="verifyId" class="dfinput" disabled/> 
					</td>
				</tr> -->
				<tr>
					<td>验证项名称</td>
					<td>
						<input type="text" name="verifyName" id="verifyName" class="dfinput"/> 
					</td>
				</tr>
				<tr>
					<td>验证项代码</td>
					<td>
						<input type="text" name="verifyCode" id="verifyCode" class="dfinput" /> 
					</td>
				</tr>
				<!-- <tr>
					<td>状态</td>
					<td>
						<input type="text" name="status" id="status" class="dfinput" /> 
					</td>
				</tr> -->
				<tr>
					<td>验证项类型  10 (基础) 20 (业务) 30 (外联)</td>
					<td>
						<input type="text" name="verifyType" id="verifyType" class="dfinput"/> 
					</td>
				</tr>
				<tr>
					<td>验证参数值</td>
					<td>
						<input type="text" name="paraValue" id="paraValue" class="dfinput" /> 
					</td>
				</tr>
				<tr>
					<td>验证参数说明</td>
					<td>
						<input type="text" name="paraRemark" id="paraRemark" class="dfinput"/> 
					</td>
				</tr>
				<!-- <tr>
					<td>创建时间</td>
					<td>
						<input type="text" name="birthday" plugin="datepicker" />
					</td>
				</tr>
				<tr>
					<td>创建人ID</td>
					<td>
						<input type="text" name="createdById" id="createdById" class="dfinput"/> 
					</td>
				</tr>
				<tr>
					<td>创建人姓名</td>
					<td>
						<input type="text" name="createdByName" id="createdByName" class="dfinput"/> 
					</td>
				</tr>
				<tr>
					<td>最后修改时间</td>
					<td>
						<input type="text" name="birthday" plugin="datepicker"/>
					</td>
				</tr>
				<tr>
					<td>最后修改操作员ID</td>
					<td>
						<input type="text" name="lastModifiedById" id="lastModifiedById" class="dfinput"/> 
					</td>
				</tr>
				<tr>
					<td>最后修改操作员姓名</td>
					<td>
						<input type="text" name="lastModifiedByName" id="lastModifiedByName" class="dfinput" /> 
					</td>
				</tr> -->
		</table>
		<input name="" type="submit" class="btn" value="添加"/>
	</form>


</body>
</html>