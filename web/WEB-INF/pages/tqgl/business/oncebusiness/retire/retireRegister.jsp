<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%@include file="/WEB-INF/js-library/jslib_header.jsp"%>
<title>人员录入（单人）</title>
</head>
<body>
<script type="text/javascript">

//    document.getElementById("table1").display='none';
   function submit(){
   	   $("#form").submit();
   }  
   
   function tqRegister(){
	  // alert($("#businessType").val());
	   
// 	    
	   $(function(){
		    var IsCheckFlag=false;//是否选中的标志
			var rowIndexTo;
			$('#tt').datagrid({
				url: 'getSysMaterialCfgByBusinessType?businessType='+$("#businessType").val(),
				striped: true,
				singleSelect: true,
				title:'业务资料',
				pagination:true,
				checkbox:true,
				sortOrder: 'asc',
				idField:'id',
				loadMsg:'正在查询，请稍等...',
				fit: true,
				fitColumns: true,
				onSelect: function (rowIndex, rowData) {
					if(!IsCheckFlag){
					    IsCheckFlag = true;
					    rowIndexTo=rowIndex;
					 }else if(rowIndexTo==rowIndex){
						 IsCheckFlag = false;
						 $('#tt').datagrid("unselectRow",rowIndex);
					 }else{
						 IsCheckFlag = false;
					 }
				},           
				columns:[[
					{field:'ck',checkbox:true,align:'center'},
					{field:'id.materialId',title:'资料ID',width:200,align:'center',
						formatter:function(value,row,index){return row.id.materialId;} },
					{field:'materialName',title:'资料名称',width:200,align:'center'},
					{field:'necessity',title:'必须性',width:200,align:'center',hidden:'true'}
				]]
			});
		
		});
	//   $("#tt").datagrid("reload");
// 	   // 显示 业务资料
// 	   $("#table1").show();  
   }
   
   function submitCheck(){
	   $("#table2").show();  
	   $("#table3").show();  
   }
</script>
		<form id="form" method="post" action="saveRetireRegister">
		
		<table>
				<tr>
					<td>证件类型:</td>
					<td>
						<input type="text" name="tqPersonBasicVO.zjlx" id="zjlx" 
						/> 
					</td>
					<td>证件号码:</td> 
					<td>
						<input type="text" name="tqPersonBasicVO.zjhm" id="zjhm" 
					<td>
					<td><input type="button" name="" id="" value="读卡" onclick=" "></td>
				</tr>
				<tr>   
					<td>公积金账号:</td>
					<td>
						<input type="text" name="tqPersonBasicVO.grzh" id="grzh" 
					 /> 
					</td>
					
					<td>姓名:</td>
					<td>
						<input type="text" name="tqPersonBasicVO.xingming" id="xingming" 
					</td>
				</tr>
				<tr>
					<td>业务类型:</td>
					<td>
						<input type="text" name="tqPersonBasicVO.businessType" id="businessType" 
					 /> 
					</td>
					<td>婚姻情况:</td>
					<td>
						<input type="text" name="tqPersonBasicVO.hyzk" id="hyzk" 
					</td>
				</tr>
				<tr>
					<td>配偶证件类型:</td>
					<td>
						<input type="text" name="tqPersonBasicVO.mateZjlx" id="mateZjlx" 
					 /> 
					</td>
					<td>配偶证件号码:</td>
					<td>
						<input type="text" name="tqPersonBasicVO.mateZjhm" id="mateZjhm" 
					</td>
					<td><input type="button" name="" id="" value="读卡" onclick=" "></td>
				</tr>
				
		</table>
		<input name="" type="button" class="btn" value="提取登记"
			onclick="tqRegister()" />
			
			<table id="tt" style="width:100%;height:500px"></table>
			
			
<!-- 	<table name="table1" id="table1" style="display:none"> -->
<!-- 		<tr> -->
<!-- 			<td><input type="checkbox" name="" value="1">身份证明</input> </td> -->
<!-- 		</tr> -->
<!-- 		<tr> -->
<!-- 		<td> -->
<!-- 			<input name="" type="button" class="btn" value="提交验证" -->
<!-- 				onclick="submitCheck()" /> -->
<!-- 		</td> -->
<!-- 		</tr> -->
<!-- 	</table> -->
	
	

		<table name="table2" id="table2" style="display:none">
			<tr>
				<td>受托人与委托人关系:</td>
					<td>
						<input type="text" name="tqAgentVO.relation" id="relation" 
					</td>
					<td>受托人姓名:</td>
					<td>
						<input type="text" name="tqAgentVO.agentXingming" id="agentXingming" 
					</td>
			</tr>
			
			<tr>
				<td>受托人身份证:</td>
					<td>
						<input type="text" name="tqAgentVO.agentZjhm" id="agentZjhm" 
					</td>
					<td>受托人联系电话:</td>
					<td>
						<input type="text" name="tqAgentVO.agentSjhm" id="agentSjhm" 
					</td>
			</tr>
		</table>
	
		<table name="table3" id="table3" style="display:none">
			<tr>
				<td>姓名:</td>
					<td>
						<input type="text" name="xingming1" id="xingming1" 
					</td>
					<td>身份证号:</td>
					<td>
						<input type="text" name="zjhm1" id="zjhm1" class="dfinput"
					</td>
			</tr>
			
			<tr>
				<td>手机号:</td>
					<td>
						<input type="text" name="tqBankVO.sjhm" id="sjhm" 
					</td>
					<td>银行名称:</td>
					<td>
						<input type="text" name="tqBankVO.bankName" id="bankName" 
					</td>
			</tr>
			
			<tr>
				<td>银行卡号:</td>
					<td>
						<input type="text" name="tqBankVO.cardNum" id="cardNum" 
					</td>
			</tr>
		</table>
	</form>
	<input name="" type="button" class="btn" value="确认提交"
			onclick="submit()" />
	<input name="" type="button" class="btn" value="取消申请"
	onclick="history.go(-1);" />
</body>
</html>




</head>