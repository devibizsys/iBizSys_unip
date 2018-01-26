function loginInit(){
	$('.login-form input').keypress(function (e) {
        if (e.which == 13) {
        	loginAction();
        }
    });
    
    //登录事件与重置事件
    $(".reset").click(function(){
    	loginReset();      
	});
    
	$(".login1").click(function(){
		loginAction();
	});   
		
	loginFocus();
}
function loginFocus(){
	$('#tbx_LoginName')[0].focus();
}
function loginReset(){
	$('.login-form')[0].reset();
	$("#request-answer").html("");
	loginFocus();
}
function loginAction(){
	//alert('enter');
	//获取登录参数
	var loginname=$("#tbx_LoginName").val();
	var pwd=$("#tbx_LoginPassword").val();
	var params = {};
	params.loginname=loginname;
	params.pwd=pwd;
	//清空以前提示信息
	$("#request-answer").html("");
	$.ajax({
		url:loginUrl,
		data:params,
		type:"post",
		dataType:"json",
		success:function(result){
			if(result.success){
				var url = indexUrl;
				
				var winUrl =  window.location.href;
				var pos = winUrl.indexOf("RU=");
				if(pos && pos>0){
					url = decodeURIComponent(winUrl.substring(pos+3));
				}
				
				window.location = url;
			}else{
				$("#request-answer").html(result.errorMessage);
			}
		},
		error:function(){
			alert("登陆异常"); 
		}
	});	 	
}