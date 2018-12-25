/**
 * 
 */
var msgDiv="<div id='dialog-message'/>";
 $(function() {
	$("html").append(msgDiv); 
    $("#dialog-message").dialog({
      modal: true,
      closable: true,
      closed: true,
      width: 550,
      height: 350,
      href:'/js-library/valid/error.jsp',
      title:'发生错误！',
      buttons:[{
    	  text:'确定',
    	  handler: function() {
          $("#dialog-message").dialog( "close" );
        }
      }]
    });
  });
 
 function handlerExp(data){
	 if(isFrameError(data)){
		 $("#errorCode").text("错误编号："+data.errorCode);
		 $("#errorMsg").text("错误消息："+data.errorMsg);
		 $("#dialog-message").dialog("open");
	 }
 }
 
 function isFrameError(data){
	if(data!=null&&data.result!=null&&data.result=='frameHandlerExp'){
		return true;
	}
	return false;
		 
 }