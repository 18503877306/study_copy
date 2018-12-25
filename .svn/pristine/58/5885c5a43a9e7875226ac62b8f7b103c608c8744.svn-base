<%@ page contentType="text/html; charset=UTF-8"%>

<head>
<%@include file="/WEB-INF/js-library/jslib_header.jsp"%>
<title>系统_业务验证配置明细表  添加页面</title>
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


	<form action="saveTqSysVerifyCfgDetail" method="post">
		<table>
				<tr>
					<td>业务资料配置ID</td>
					<td>
						<input type="text" name="verifyCfgId" id="verifyCfgId" class="dfinput"
						value="${tqSysVerifyCfgDetail.verifyCfgId}" /> 
					</td>
				</tr>
				<tr>
					<td>验证项ID</td>
					<td>
						<input type="text" name="verifyId" id="verifyId" class="dfinput"
						value="${tqSysVerifyCfgDetail.verifyId}" /> 
					</td>
				</tr>
				<tr>
					<td>验证项名称</td>
					<td>
						<input type="text" name="verifyName" id="verifyName" class="dfinput"
						value="${tqSysVerifyCfgDetail.verifyName}" /> 
					</td>
				</tr>
				<tr>
					<td>验证项代码</td>
					<td>
						<input type="text" name="verifyCode" id="verifyCode" class="dfinput"
						value="${tqSysVerifyCfgDetail.verifyCode}" /> 
					</td>
				</tr>
				<tr>
					<td>验证项类型 10 基础 20 业务 30 外联</td>
					<td>
						<input type="text" name="verifyType" id="verifyType" class="dfinput"
						value="${tqSysVerifyCfgDetail.verifyType}" /> 
					</td>
				</tr>
				<tr>
					<td>验证参数值</td>
					<td>
						<input type="text" name="paraValue" id="paraValue" class="dfinput"
						value="${tqSysVerifyCfgDetail.paraValue}" /> 
					</td>
				</tr>
				<tr>
					<td>顺序，暂定只是显示用</td>
					<td>
						<input type="text" name="listOrder" id="listOrder" class="dfinput"
						value="${tqSysVerifyCfgDetail.listOrder}" /> 
					</td>
				</tr>
				<tr>
					<td>状态</td>
					<td>
						<input type="text" name="status" id="status" class="dfinput"
						value="${tqSysVerifyCfgDetail.status}" /> 
					</td>
				</tr>
				<tr>
					<td>创建时间</td>
					<td>
						<input type="text" name="birthday" plugin="datepicker"
						value="${tqSysVerifyCfgDetail.createdTime}" />
					</td>
				</tr>
				<tr>
					<td>创建人ID</td>
					<td>
						<input type="text" name="createdById" id="createdById" class="dfinput"
						value="${tqSysVerifyCfgDetail.createdById}" /> 
					</td>
				</tr>
				<tr>
					<td>创建人姓名</td>
					<td>
						<input type="text" name="createdByName" id="createdByName" class="dfinput"
						value="${tqSysVerifyCfgDetail.createdByName}" /> 
					</td>
				</tr>
				<tr>
					<td>最后修改时间</td>
					<td>
						<input type="text" name="birthday" plugin="datepicker"
						value="${tqSysVerifyCfgDetail.lastModifiedTime}" />
					</td>
				</tr>
				<tr>
					<td>最后修改操作员ID</td>
					<td>
						<input type="text" name="lastModifiedById" id="lastModifiedById" class="dfinput"
						value="${tqSysVerifyCfgDetail.lastModifiedById}" /> 
					</td>
				</tr>
				<tr>
					<td>最后修改操作员姓名</td>
					<td>
						<input type="text" name="lastModifiedByName" id="lastModifiedByName" class="dfinput"
						value="${tqSysVerifyCfgDetail.lastModifiedByName}" /> 
					</td>
				</tr>
		</table>
		<input name="" type="submit" class="btn" value="添加"/>
	</form>
</body>

