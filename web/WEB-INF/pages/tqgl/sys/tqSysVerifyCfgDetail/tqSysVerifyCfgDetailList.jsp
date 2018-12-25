<%@ page contentType="text/html; charset=UTF-8"%>

<head>
<%@include file="/WEB-INF/js-library/jslib_header.jsp"%>
<title>系统_业务验证配置明细表  需要配置 验证顺序、是否强制、是否需要影像（否、是、可选）、资料名称、资料代码等。列表</title>

</head>


<body>

	<table id="searchTable" width="100%" border="0" align="center" cellpadding="0" cellspacing="0" class="">
	    <tr>
	        <td width="12%">&nbsp;</td>
			<td width="31%">&nbsp;</td>
	        <td width="8%">&nbsp;</td>
	        <td width="39%">&nbsp;</td>
	        <td width="10%">&nbsp;</td>
	        
		</tr>
		
		<tr>
			<td></td>
			<td></td>
			<td></td>
			<td></td>
	     	<td><input name="button" type='button' class="button_style" onclick="javascript:subSearchBut()" value='查询' /></td>		
		</tr>
		
		<tr>
	        <td>&nbsp;</td> 
	        <td>&nbsp;</td>
	        <td>&nbsp;</td>
	        <td>&nbsp;</td>
	        <td>&nbsp;</td>
	     </tr>
	</table>
		    	
  <table id="tt" style="width:90%;height:500px"></table>
	
	<script>
		$(function(){
			$('#tt').datagrid({
				url: 'listTqSysVerifyCfgDetail',
				striped: true,
				singleSelect: true,
				title:'系统_业务验证配置明细表  需要配置 验证顺序、是否强制、是否需要影像（否、是、可选）、资料名称、资料代码等。',
				pagination:true,
				sortOrder: 'asc',
				idField:'id',
				loadMsg:'正在查询，请稍等...',
				fit: true,
		//		onLoadSuccess:handlerExp(),
				fitColumns: true,
				columns:[[
					{field:'verifyCfgId',title:'业务资料配置ID',width:200,align:'center'},
					{field:'verifyId',title:'验证项ID',width:200,align:'center'},
					{field:'verifyName',title:'验证项名称',width:200,align:'center'},
					{field:'verifyCode',title:'验证项代码',width:200,align:'center'},
					{field:'verifyType',title:'验证项类型 10 基础 20 业务 30 外联',width:200,align:'center'},
					{field:'paraValue',title:'验证参数值',width:200,align:'center'},
					{field:'listOrder',title:'顺序，暂定只是显示用',width:200,align:'center'},
					{field:'status',title:'状态',width:200,align:'center'},
					{field:'createdTime',title:'创建时间',width:200,align:'center'},
					{field:'createdById',title:'创建人ID',width:200,align:'center'},
					{field:'createdByName',title:'创建人姓名',width:200,align:'center'},
					{field:'lastModifiedTime',title:'最后修改时间',width:200,align:'center'},
					{field:'lastModifiedById',title:'最后修改操作员ID',width:200,align:'center'},
					{field:'lastModifiedByName',title:'最后修改操作员姓名',width:200,align:'center'},
 					{field:'operate',title:'操作',width:200,align:'center',formatter:function(value,rowData,rowIndex){
 	                        var c="";
 	                        c+="<a href=\"javascript:viewDetail('"+rowData.id+"');\" > 修改</a> | <a href=\"javascript:del('"+rowData.id+"');\" > 删除</a>";
 	                        return c;
 						}
                    }	
				]]
			});
		
		});
		
		function refresh(){
			 $('#tt').datagrid("reload");
		}
		
		function subSearch(){
			var obj=$("#search").serializeObject();
			$("#tt").datagrid("options").url='listTqSysVerifyCfgDetail';
			$("#tt").datagrid("reload",obj);
		}
		
		function subSearchBut(){
			//显示第一页数据 
			$("#tt").datagrid("options").pageNumber = 1;  
			//分页栏上跳转到第一页  
			$("#tt").datagrid('getPager').pagination({pageNumber: 1});  
			subSearch();
		}
		
		function viewDetail(id){
			window.open("editTqSysVerifyCfgDetail?id="+id); 
		}
		
		function del(id){
			if(confirm("是否确定删除？")){
				$.post("deleteTqSysVerifyCfgDetail","id="+id,
	   			   function (data, textStatus){
	   			      alert("删除成功！");
	   			      refresh();
	   			   });
			}
		}
		
		
		</script>

</body>

