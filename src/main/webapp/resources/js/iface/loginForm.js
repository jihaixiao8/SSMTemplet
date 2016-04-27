$(document).ready(function(){
	$("#login").click(function(){
		var username = $("#username").val();
		var password = $("#password").val();
		if(username == "" || username == null){
			$(".login-form-err").text("账号为空请填写账号！");
			return false;
		}
		if(password == "" || password == null){
			$(".login-form-err").text("密码不能为空请填写密码！");
			return false;
		}
		$(".login-form-err").text("");
		$("#loginForm").submit();
	});
});