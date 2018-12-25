<%@ page contentType="text/html; charset=UTF-8"%>

<head>
<!--  引入jquery的文件（如果check方法未定义，就去掉然后用easyui的表单验证）    -->
<%@include file="../../../../js-library/jslib_header.jsp"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<title>系统_业务资料配置表 根据业务编号 配置具体业务需要的业务资料，用于受理时确认资料是否齐全；另外是否需要影像等也可以配置在这里  需要配置 显示顺序、是否强制、是否需要影像（否、是、可选）、资料名称、资料代码等。   业务实现的时候需要检查配置中的资料是否失效了编辑页面</title>
</head>

<body>

<script type="text/javascript">
	var vForm;
	$(document).ready(function(){
	//	var vForm=$("#ff").Validform({tiptype:3});
			var vForm=$("#ff")
	}); 
	
	function validSelect(obj){
		$("input[name='"+$(obj).attr('id')+"']").attr('datatype',$(obj).attr('datatype'));
		$("input[name='"+$(obj).attr('id')+"']").attr('errormsg',$(obj).attr('errormsg'));
		$("input[name='"+$(obj).attr('id')+"']").attr('nullmsg',$(obj).attr('nullmsg'));
		vForm.check(false);
	}
	
   function subForm(){
	   
	   var ids = _getMValues();
	   
	   alert(ids);
	   
	   alert(ids);
	   
   	   $.post("updateTqSysMaterialCfg",$("#ff").serialize()+"&materialIds="+ids,
	   	function (data, textStatus){
	   //		handlerExp(data);
	      	var msg=data.result;
	      	if(msg)
	    	  alert(msg);
	   }, "json");  
	   
   }    
       
</script>

<script>
$(function(){  
	//选择一项
    $("#addOne").click(function(){  
        $("#from option:selected").clone().appendTo("#to");  
        $("#from option:selected").remove();  
    });  
    //选择全部  
    $("#addAll").click(function(){  
        $("#from option").clone().appendTo("#to");  
        $("#from option").remove();  
    });  
      
    //移除一项 
    $("#removeOne").click(function(){  
        $("#to option:selected").clone().appendTo("#from");  
        $("#to option:selected").remove();  
    });  
    //移除全部 
    $("#removeAll").click(function(){  
        $("#to option").clone().appendTo("#from");  
        $("#to option").remove();  
    });  
    //移至顶部 
    $("#Top").click(function(){  
        var allOpts = $("#to option");  
        var selected = $("#to option:selected");  
        if(selected.get(0).index!=0){  
            for(i=0;i<selected.length;i++){  
               var item = $(selected.get(i));  
               var top = $(allOpts.get(0));  
               item.insertBefore(top);  
            }  
        }  
    });  
    //上移一行
    $("#Up").click(function(){  
        var selected = $("#to option:selected");  
        if(selected.get(0).index!=0){  
            selected.each(function(){  
                $(this).prev().before($(this));  
            });  
        }  
    });  
    //下移一行
    $("#Down").click(function(){  
        var allOpts = $("#to option");  
        var selected = $("#to option:selected");  
        if(selected.get(selected.length-1).index!=allOpts.length-1){  
            for(i=selected.length-1;i>=0;i--){  
               var item = $(selected.get(i));  
               item.insertAfter(item.next());  
            }  
        }  
    });  
    //移至底部  
    $("#Buttom").click(function(){  
        var allOpts = $("#to option");  
        var selected = $("#to option:selected");  
        if(selected.get(selected.length-1).index!=allOpts.length-1){  
            for(i=selected.length-1;i>=0;i--){  
               var item = $(selected.get(i));  
               var buttom = $(allOpts.get(length-1));  
               item.insertAfter(buttom);  
            }  
        }  
    });  
}); 

function _getMValues(){
	
	var str = '';
	 
    $("#to option").each(function(){  //遍历所有option  
         var txt = $(this).val();   //获取option值   
         if(txt!=''){  
               str += txt +',';
         }  
    }); 
	
    if(str){
    	 str = str.substring(0,str.length-1);
    }
    
    return str;
}


</script>


	<form id="ff" method="post">
		<table>
				<input type="hidden" name="materialCfgId" id="materialCfgId" value="${tqSysMaterialCfg.materialCfgId}">
				<tr>
					<td>业务资料配置名称</td>
					<td>
					<label>${tqSysMaterialCfg.materialCfgName}</label>
					</td>
				</tr>
				<tr>
					<td>状态</td>
					<td>
						<label>${tqSysMaterialCfg.status}</label>
					</td>
				</tr>
				<tr>
					<td>业务类型</td>
					<td>
						<loabel>${tqSysMaterialCfg.businessType}</loabel>
					</td>
				</tr>
				<tr>
					<td>业务明细类型</td>
					<td>
						<label>${tqSysMaterialCfg.businessTypeDetail}</label>
					</td>
				</tr>
				<tr>
					<td>配置说明</td>
					<td>
						
						<textarea  name="remark" id="remark" >${tqSysMaterialCfg.remark}</textarea>
					</td>
				</tr>
			
	<!-- 		
				<tr>
					<td>生效时间</td>
					<td>
						<label>${tqSysMaterialCfg.effectTime}</label>
					</td>
				</tr>
				<tr>
					<td>失效时间</td>
					<td>
						<label>${tqSysMaterialCfg.deadTime}</label>
					</td>
				</tr>
	 -->			
				
				
				
				
				
		</table>
		
		<table align="center"  width="288" border="0" cellpadding="0" cellspacing="0">  
    	<tr>  
        <td colspan="4">  
            <select name="from" id="from" multiple="multiple" size="10" style="width:100%">  
                <c:forEach items="${amountList}" var="model">
                	<option value="${model.materialId}">${model.materialName}</option>  	
                </c:forEach>
            </select>  
        </td>  
        <td align="center">  
            <input type="button" id="addAll" value=" >> " style="width:50px;" /><br />  
            <input type="button" id="addOne" value=" > " style="width:50px;" /><br />  
            <input type="button" id="removeOne" value="&lt;" style="width:50px;" /><br />  
            <input type="button" id="removeAll" value="&lt;&lt;" style="width:50px;" /><br />  
        </td>  
        <td colspan="4">  
            <select name="to" id="to" multiple="multiple" size="10" style="width:100%">  
            </select>  
        </td>  
        <td align="center">  
            <input type="button" id="Top" value="置顶" style="width:50px;" /><br />  
            <input type="button" id="Up" value="上移" style="width:50px;" /><br />  
            <input type="button" id="Down" value="下移" style="width:50px;" /><br />  
            <input type="button" id="Buttom" value="置底" style="width:50px;" /><br />  
        </td>  
    </tr>  
</table>  
		
		
		<input name="" type="button" class="btn" value="确认保存"
			onclick="subForm()" />
	</form>
</body>

