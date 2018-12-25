<%@ page contentType="text/html; charset=UTF-8"%>

<head>
<!--  需要引入必要的js文件，这里需要jquery基本js文件，以及easyui所需要的文件    -->
<%@include file="../../../../js-library/jslib_header.jsp"%>
<title>系统_业务资料资源表 定义提取业务中所有的资料名称、代码。 可配置是否失效列表</title>


</head>


<body>
	<div class="rightinfo">
	<form id="search">
	<table id="searchTable" width="100%" border="0" align="center" cellpadding="0" cellspacing="0" class="">
	   
	   	<tr>
	        <td width="20%">&nbsp;</td>
			<td width="20%">&nbsp;</td>
	        <td width="20%">&nbsp;</td>
	        <td width="20%">&nbsp;</td>
	        <td width="20%">&nbsp;</td>
		</tr>
		
	    <tr>
	        <td width="20%"></td>
			<td width="20%">名称 <input type="text" name="materialName"></td>
	        <td width="20%">状态 <input type="text" name="status"></td>
	        <td width="20%">编码<input type="text" name="materialCode"></td>
	        <td width="20%"></td>
		</tr>
		
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
	</form>  	
 
  <table id="tt" style="width:100%;height:500px"></table>
  </div>
	<script>
		$(function(){
			$('#tt').datagrid({
				url: 'listTqSysMaterialResource',
				striped: true,
				singleSelect: true,
				title:'系统_业务资料资源表 定义提取业务中所有的资料名称、代码。 可配置是否失效',
				pagination:true,
				sortOrder: 'asc',
				idField:'id',
				loadMsg:'正在查询，请稍等...',
				fit: true,
		//		onLoadSuccess:handlerExp(),
				fitColumns: true,
				columns:[[
					{field:'materialId',title:'资料ID',width:200,align:'center'},
					{field:'materialName',title:'资料名称',width:200,align:'center'},
					{field:'status',title:'状态 0正常 1 失效',width:200,align:'center'},
					{field:'materialRemark',title:'资料备注',width:200,align:'center'},
					{field:'materialCode',title:'资料编码(预留)',width:200,align:'center'},
					{field:'createdTime',title:'创建时间',width:200,align:'center'},
					{field:'createdById',title:'创建人ID',width:200,align:'center'},
					{field:'createdByName',title:'创建人姓名',width:200,align:'center'},
					{field:'lastModifiedTime',title:'最后修改时间',width:200,align:'center'},
					{field:'lastModifiedById',title:'最后修改操作员ID',width:200,align:'center'},
					{field:'lastModifiedByName',title:'最后修改操作员姓名',width:200,align:'center'},
 					{field:'operate',title:'操作',width:200,align:'center',formatter:function(value,rowData,rowIndex){
 	                        var c="";
 	                        c+="<a href=\"javascript:viewDetail('"+rowData.materialId+"');\" > 修改</a> | <a href=\"javascript:del('"+rowData.materialId+"');\" > 删除</a>";
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
			$("#tt").datagrid("options").url='listTqSysMaterialResource';
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
			window.open("editTqSysMaterialResource?id="+id); 
		}
		
		function del(id){
			if(confirm("是否确定删除？")){
				$.post("deleteTqSysMaterialResource","id="+id,
	   			   function (data, textStatus){
	   			      alert("删除成功！");
	   			      refresh();
	   			   });
			}
		}
		
		function addBut(){
			
			window.location.href = "addTqSysMaterialResource";
			
		}
		
		</script>

</body>

