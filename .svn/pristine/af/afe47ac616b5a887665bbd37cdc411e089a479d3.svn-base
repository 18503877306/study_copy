<%@ page contentType="text/html; charset=UTF-8"%>

<head>
<!--  需要引入必要的js文件，这里需要jquery基本js文件，以及easyui所需要的文件    -->
<%@include file="../../../../js-library/jslib_header.jsp"%>
<title>系统_业务资料配置表 根据业务编号 配置具体业务需要的业务资料，用于受理时确认资料是否齐全；另外是否需要影像等也可以配置在这里  需要配置 显示顺序、是否强制、是否需要影像（否、是、可选）、资料名称、资料代码等。   业务实现的时候需要检查配置中的资料是否失效了列表</title>

</head>


<body>

	<table id="searchTable" width="100%" border="0" align="center" cellpadding="0" cellspacing="0" class="">
	    <tr>
	        <td width="20%">&nbsp;</td>
			<td width="20%">&nbsp;</td>
	        <td width="20%">&nbsp;</td>
	        <td width="20%">&nbsp;</td>
	        <td width="20%">&nbsp;</td>
		</tr>
		
		<tr>
			<td></td>
			<td></td>
			<td></td>
	     	<td><input name="button" type='button' class="button_style" onclick="javascript:subSearchBut()" value='查询' /></td>		
			<td><input name="button" type='button' class="button_style" onclick="javascript:addBut()" value='新增' /></td>
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
				url: 'listTqSysMaterialCfg',
				striped: true,
				singleSelect: true,
				title:'业务资料配置列表',
				pagination:true,
				sortOrder: 'asc',
				idField:'id',
				loadMsg:'正在查询，请稍等...',
				fit: true,
		//		onLoadSuccess:handlerExp(),
				fitColumns: true,
				columns:[[
					{field:'materialCfgId',title:'业务资料配置ID',width:200,align:'center'},
					{field:'materialCfgName',title:'业务资料配置名称',width:200,align:'center'},
					{field:'status',title:'状态 0正常 1 失效  2 未生效',width:200,align:'center'},
					{field:'businessType',title:'业务类型',width:200,align:'center'},
					{field:'businessTypeDetail',title:'业务明细类型',width:200,align:'center'},
					{field:'remark',title:'配置说明',width:200,align:'center'},
					{field:'effectTime',title:'生效时间',width:200,align:'center'},
					{field:'deadTime',title:'失效时间',width:200,align:'center'},
		//			{field:'createdTime',title:'创建时间',width:200,align:'center'},
		//			{field:'createdById',title:'创建人ID',width:200,align:'center'},
		//			{field:'createdByName',title:'创建人姓名',width:200,align:'center'},
		//			{field:'lastModifiedTime',title:'最后修改时间',width:200,align:'center'},
		//			{field:'lastModifiedById',title:'最后修改操作员ID',width:200,align:'center'},
		//			{field:'lastModifiedByName',title:'最后修改操作员姓名',width:200,align:'center'},
 					{field:'operate',title:'操作',width:200,align:'center',formatter:function(value,rowData,rowIndex){
 	                        var c="";
 	                        c+="<a href=\"javascript:viewDetail('"+rowData.materialCfgId+"');\" > 修改</a> | <a href=\"javascript:del('"+rowData.materialCfgId+"');\" > 删除</a>";
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
			$("#tt").datagrid("options").url='listTqSysMaterialCfg';
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
			window.open("editTqSysMaterialCfg?id="+id); 
		}
		
		function del(id){
			if(confirm("是否确定删除？")){
				$.post("deleteTqSysMaterialCfg","id="+id,
	   			   function (data, textStatus){
	   			      alert("删除成功！");
	   			      refresh();
	   			   });
			}
		}
		
		function addBut(){
			
			window.location.href = "addTqSysMaterialCfg";
		}
		
		</script>

</body>

