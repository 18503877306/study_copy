<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%@include file="/WEB-INF/js-library/jslib_header.jsp"%>
<title>资料审核（退休）</title>
</head>
<body>
	 <table id="tt" style="width:100%;height:500px"></table>
	 <table>
	 	<tr>
	 		<td><input type="checkbox" name=""  class="dfinput"/>身份证明</td>
	 	</tr>
	 </table>
	 
	 
	
	<script>
		$(function(){
			$('#tt').datagrid({
				url: 'listTqRetireRegister',
				striped: true,
				singleSelect: true,
				title:'退休提取登记详细页面',
				pagination:true,
				sortOrder: 'asc',
				idField:'id',
				loadMsg:'正在查询，请稍等...',
				fit: true,
		//		onLoadSuccess:handlerExp(),
				fitColumns: true,
				columns:[[
					{field:'business',title:'流水号',width:200,align:'center',hidden:'true'},
					{field:'xingming',title:'姓名',width:200,align:'center'},
					{field:'grzh',title:'公积金账号',width:200,align:'center'},
					{field:'relation',title:'关系',width:200,align:'center'},
					{field:'materialCode',title:'补充账号',width:200,align:'center'},
 					{field:'operate',title:'操作',width:200,align:'center',formatter:function(value,rowData,rowIndex){
 	                        var c="";
 	                        c+="<a href=\"javascript:viewDetail('"+rowData.materialId+"');\" > 明细</a>";
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
			$("#tt").datagrid("options").url='listTqRetireRegister';
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
			window.open("viewTqRetireRegisterDetail?id="+id); 
		}
	
		</script>
</body>
</html>




</head>