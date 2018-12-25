<%@ page contentType="text/html; charset=UTF-8"%>

<head>
<%@include file="/WEB-INF/js-library/jslib_header.jsp"%>
<title>系统_提取验证配置表</title>

</head>


<body>

	<table id="searchTable" width="100%" border="0" align="center"
		cellpadding="0" cellspacing="0" class="">
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
			<td><input name="addButton" type='button' class="button_style"
				onclick="javascript:subAddBut()" value='增加' /></td>
			<td><input name="button" type='button' class="button_style"
				onclick="javascript:subSearchBut()" value='查询' /></td>
		</tr>

		<tr>
			<td>&nbsp;</td>
			<td>&nbsp;</td>
			<td>&nbsp;</td>
			<td>&nbsp;</td>
			<td>&nbsp;</td>
		</tr>
	</table>

	<table id="tt" style="width: 90%; height: 500px"></table>

	<script>
		$(function(){
			$('#tt').datagrid({
				url: 'listTqSysVerifyCfg',
				striped: true,
				singleSelect: true,
				title:'系统_提取验证配置表 记录具体业务需要进行哪些验证的表，对该表进行删除是通过修改状态完成，修改需要保留原来的记录，将原来记录标记为失效后，重新插入新数据。',
				pagination:true,
				sortOrder: 'asc',
				idField:'id',
				loadMsg:'正在查询，请稍等...',
				fit: true,
		//		onLoadSuccess:handlerExp(),
				fitColumns: true,
				columns:[[
					{field:'verifyCfgId',title:'业务资料配置ID',width:200,align:'center'},
					{field:'verifyCfgName',title:'配置名称',width:200,align:'center'},
					/* {field:'status',title:'状态 ',width:200,align:'center'}, */
					{field:'businessType',title:'业务类型',width:200,align:'center'},
					{field:'businessTypeDetail',title:'业务明细类型',width:200,align:'center'},
					{field:'remark',title:'配置说明',width:200,align:'center'},
					{field:'effectTime',title:'生效时间',width:200,align:'center'},
					{field:'operate',title:'操作',width:200,align:'center',formatter:function(value,rowData,rowIndex){
 	                        var c="";
 	                        c+="<a href=\"javascript:viewDetail('"+rowData.verifyCfgId+"');\" > 修改</a> | <a href=\"javascript:del('"+rowData.verifyCfgId+"');\" > 删除</a>";
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
			$("#tt").datagrid("options").url='listTqSysVerifyCfg';
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
			window.open("editTqSysVerifyCfg?verifyCfgId="+id); 
		}
		
		function del(id){
			if(confirm("是否确定删除？")){
				$.post("deleteTqSysVerifyCfg","verifyCfgId="+id,
	   			   function (data, textStatus){
	   			      alert("删除成功！");
	   			      refresh();
	   			   });
			}
		}
		
		function subAddBut(){
			window.open("addTqSysVerifyCfg"); 
		}
		
		</script>

</body>

