$(document).ready(function(){
	$("#btn").click(function(){
		var filterName = /^([a-zA-Z0-9_\.\-])+\@(([a-zA-Z0-9\-])+\.)+([a-zA-Z0-9]{2,4})+$/;
		var username = $("#username").val();
		
		if(username == "" || username == null ){
			$(".login-form-err").text("Email,地址不能为空！");
			return false;
		}
		
		if(!filterName.test(username)){
    		$(".login-form-err").text("Email格式不正确！");
    		return false;
    	}
		 $(".login-form-err").text("");
         $("#form").submit();
	});
});