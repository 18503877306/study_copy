<%@ page contentType="text/html; charset=UTF-8"%>

<head>
<%@include file="/WEB-INF/js-library/jslib_header.jsp"%>
<title>系统_提取验证配置表  编辑页面</title>
</head>

<body>

<script type="text/javascript">
	
	function validSelect(obj){
		$("input[name='"+$(obj).attr('id')+"']").attr('datatype',$(obj).attr('datatype'));
		$("input[name='"+$(obj).attr('id')+"']").attr('errormsg',$(obj).attr('errormsg'));
		$("input[name='"+$(obj).attr('id')+"']").attr('nullmsg',$(obj).attr('nullmsg'));
		vForm.check(false);
	}
	
	$("#effectY").onclick(function(){
		alert("立即生效");
		$("#effectTime").css("display","block");
	});
</script>


	<form id="ff" action = "updateTqSysVerifyCfg" method="post">
		<table>
			  <tr style="display:none">
					<td>业务资料配置ID</td>
					<td>
						<input type="hidden" name="verifyCfgId" id="verifyCfgId" class="dfinput"
						value="${tqSysVerifyCfg.verifyCfgId}"/> 
					</td>
				</tr>
				<tr>
					<td>配置名称</td>
					<td>
						<input type="text" name="verifyCfgName" id="verifyCfgName" class="dfinput"
						value="${tqSysVerifyCfg.verifyCfgName}" /> 
					</td>
				</tr>
				<%-- <tr>
					<td>状态 1正常 0 失效  2 未生效</td>
					<td>
						<input type="text" name="status" id="status" class="dfinput"
						value="${tqSysVerifyCfg.status}" /> 
					</td>
				</tr> --%>
				<tr>
					<td>业务类型</td>
					<td>
						<input type="text" name="businessType" id="businessType" class="dfinput"
						value="${tqSysVerifyCfg.businessType}" /> 
					</td>
				</tr>
				<tr>
					<td>业务明细类型</td>
					<td>
						<input type="text" name="businessTypeDetail" id="businessTypeDetail" class="dfinput"
						value="${tqSysVerifyCfg.businessTypeDetail}" /> 
					</td>
				</tr>
				<tr>
					<td>配置说明</td>
					<td>
						<input type="text" name="remark" id="remark" class="dfinput"
						value="${tqSysVerifyCfg.remark}" /> 
					</td>
				</tr>
				<tr>
					<td>是否立即生效</td>
					<td>
						<input type="radio" name="effet" id="effectY"/> 是
						<input type="radio" name="effet" id="effectN"/> 否
					</td>
				</tr>
				
				<tr>
					<td>生效时间</td>
					<td>
						<input type="text" name="birthday" plugin="datepicker" id="effectTime"
						value="${tqSysVerifyCfg.effectTime}" style="display:none"/>
					</td>
				</tr>
				<tr>
				<%--	<td>失效时间</td>
					<td>
						<input type="text" name="birthday" plugin="datepicker"
						value="${tqSysVerifyCfg.deadTime}" />
					</td>
				</tr>
				 <tr>
					<td>创建时间</td>
					<td>
						<input type="text" name="birthday" plugin="datepicker"
						value="${tqSysVerifyCfg.createdTime}" />
					</td>
				</tr>
				<tr>
					<td>创建人ID</td>
					<td>
						<input type="text" name="createdById" id="createdById" class="dfinput"
						value="${tqSysVerifyCfg.createdById}" /> 
					</td>
				</tr>
				<tr>
					<td>创建人姓名</td>
					<td>
						<input type="text" name="createdByName" id="createdByName" class="dfinput"
						value="${tqSysVerifyCfg.createdByName}" /> 
					</td>
				</tr>
				<tr>
					<td>最后修改时间</td>
					<td>
						<input type="text" name="birthday" plugin="datepicker"
						value="${tqSysVerifyCfg.lastModifiedTime}" />
					</td>
				</tr>
				<tr>
					<td>最后修改操作员ID</td>
					<td>
						<input type="text" name="lastModifiedById" id="lastModifiedById" class="dfinput"
						value="${tqSysVerifyCfg.lastModifiedById}" /> 
					</td>
				</tr>
				<tr>
					<td>最后修改操作员姓名</td>
					<td>
						<input type="text" name="lastModifiedByName" id="lastModifiedByName" class="dfinput"
						value="${tqSysVerifyCfg.lastModifiedByName}" /> 
					</td>
				</tr> --%>
		</table>
		<input name="" type="submit" class="btn" value="修改"/>
	</form>
</body>

