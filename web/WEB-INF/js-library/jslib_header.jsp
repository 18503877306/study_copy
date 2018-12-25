<%@ page contentType="text/html; charset=UTF-8"%>
<%	
	//String jsLibraryPath = request.getContextPath();
	String jsLibraryPath= request.getContextPath() ;
	//easyui version,default is 1.3.6
	String easyuiVersion = request.getParameter("ev");
	easyuiVersion = (null==easyuiVersion||"".equals(easyuiVersion))?"1.3.1":easyuiVersion;
	
	//whether load annex 
	String isAnnex = request.getParameter("isAnnex");
	//whether load tooltip
	String isTooltip = request.getParameter("isTooltip");
	
	String randomStr	=	String.valueOf(Math.round(Math.random()*200000)+String.valueOf(System.currentTimeMillis()));
%>

<link rel="stylesheet" type="text/css" href="<%=jsLibraryPath%>/js-library/easyui-common/themes/default/easyui.css?r=<%=randomStr%>">
<link rel="stylesheet" type="text/css" href="<%=jsLibraryPath%>/js-library/easyui-common/themes/icon.css?r=<%=randomStr%>">

<script type="text/javascript" src="<%=jsLibraryPath%>/js-library/datePicker/WdatePicker.js?r=<%=randomStr%>"></script>
<%-- <script type="text/javascript" src="<%=jsLibraryPath%>/js-library/easyui-common/ajax.js?r=<%=randomStr%>"></script> --%>
<%-- <script type="text/vbscript" src="<%=jsLibraryPath%>/js-library/easyui-common/ajax.vbs"></script> --%>

<script type="text/javascript" src="<%=jsLibraryPath%>/js-library/easyui-<%=easyuiVersion%>/jquery.min.js?r=<%=randomStr%>"></script>
<script type="text/javascript" src="<%=jsLibraryPath%>/js-library/easyui-<%=easyuiVersion%>/jquery.easyui.min.js?r=<%=randomStr%>"></script>
<script type="text/javascript" src="<%=jsLibraryPath%>/js-library/easyui-common/gov/easyui-gov.js?r=<%=randomStr%>"></script>
<script type="text/javascript" src="<%=jsLibraryPath%>/js-library/easyui-common/common.js?r=<%=randomStr%>"></script>
<script type="text/javascript" src="<%=jsLibraryPath%>/js-library/easyui-common/easyui.validatebox.extend.js?r=<%=randomStr%>"></script>
<script type="text/javascript" src="<%=jsLibraryPath%>/js-library/easyui-common/easyui.datagrid.editors.extend.js?r=<%=randomStr%>"></script>
<script type="text/javascript" src="<%=jsLibraryPath%>/js-library/easyui-<%=easyuiVersion%>/locale/easyui-lang-zh_CN.js?r=<%=randomStr%>"></script>
<script type="text/javascript" src="<%=jsLibraryPath%>/js-library/easyui-common/gov/ValidateFunction.min.js?r=<%=randomStr%>"></script>

<link rel="stylesheet" type="text/css" href="<%=jsLibraryPath%>/js-library/plugins/autocomplete/jquery.autocomplete.css?r=<%=randomStr%>" />
<script type='text/javascript' src="<%=jsLibraryPath%>/js-library/plugins/autocomplete/jquery.autocomplete.js?r=<%=randomStr%>"></script>

<script type="text/javascript" src="<%=jsLibraryPath%>/js-library/plugins/jquery.json.min.js?r=<%=randomStr%>"></script>
<script type="text/javascript" src="<%=jsLibraryPath%>/js-library/plugins/json2.js?r=<%=randomStr%>"></script>
<script type="text/javascript" src="<%=jsLibraryPath%>/js-library/plugins/jquery.cookie.js?r=<%=randomStr%>"></script>
<script type="text/javascript" src="<%=jsLibraryPath%>/js-library/plugins/jquery.uuid.js?r=<%=randomStr%>"></script>
<script type="text/javascript" src="<%=jsLibraryPath%>/js-library/plugins/jquery.serializeObject.js?r=<%=randomStr%>"></script>

<script type="text/javascript" src="<%=jsLibraryPath%>/js-library/valid/exceptionhandle.js?r=<%=randomStr%>"></script>
<script type="text/javascript" src="<%=jsLibraryPath%>/js-library/valid/validform_extend.js?r=<%=randomStr%>"></script>

<%if("true".equals(isAnnex)) {%>
	<script type='text/javascript' src="<%=request.getContextPath()%>/annex/core/codebase/annex/swfupload.js"></script>
	<script type='text/javascript' src="<%=request.getContextPath()%>/annex/core/codebase/annex/handlers.js"></script>
	<script type='text/javascript' src="<%=request.getContextPath()%>/annex/core/codebase/annex/annex.jsp"></script>
<%}%>
<%if("true".equals(isTooltip)){%>
<link rel="stylesheet" type="text/css" href="<%=jsLibraryPath%>/js-library/plugins/tooltip/tip-darkgray/tip-darkgray.css?r=<%=randomStr%>">
<link rel="stylesheet" type="text/css" href="<%=jsLibraryPath%>/js-library/plugins/tooltip/tip-green/tip-green.css?r=<%=randomStr%>">
<link rel="stylesheet" type="text/css" href="<%=jsLibraryPath%>/js-library/plugins/tooltip/tip-skyblue/tip-skyblue.css?r=<%=randomStr%>">
<link rel="stylesheet" type="text/css" href="<%=jsLibraryPath%>/js-library/plugins/tooltip/tip-twitter/tip-twitter.css?r=<%=randomStr%>">
<link rel="stylesheet" type="text/css" href="<%=jsLibraryPath%>/js-library/plugins/tooltip/tip-violet/tip-violet.css?r=<%=randomStr%>">
<link rel="stylesheet" type="text/css" href="<%=jsLibraryPath%>/js-library/plugins/tooltip/tip-yellow/tip-yellow.css?r=<%=randomStr%>">
<link rel="stylesheet" type="text/css" href="<%=jsLibraryPath%>/js-library/plugins/tooltip/tip-yellowsimple/tip-yellowsimple.css?r=<%=randomStr%>">
<script type="text/javascript" src="<%=jsLibraryPath%>/js-library/plugins/tooltip/jquery.poshytip.min.js?r=<%=randomStr%>"></script>
<%}%>

<!-- 代码编辑器 -->
<script type="text/javascript" src="<%=jsLibraryPath%>/js-library/plugins/editarea/edit_area_full.js?r=<%=randomStr%>"></script>
<script type="text/javascript">
editAreaLoader.baseURL="<%=jsLibraryPath%>/js-library/plugins/editarea/";
</script>


<!--[if lte IE 6]>
<script type="text/javascript" src="<%=jsLibraryPath%>/js-library/plugins/DD_belatedPNG_0.0.8a.js?r=<%=randomStr%>"></script>
<script type="text/javascript">
    DD_belatedPNG.fix('div, ul, img, li, input , a');
</script>
<![endif]--> 
