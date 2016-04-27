$(document).ready(function(){
        $('#btn').click(function () {
        	var filterName = /^([a-zA-Z0-9_\.\-])+\@(([a-zA-Z0-9\-])+\.)+([a-zA-Z0-9]{2,4})+$/;
        	var filterWord = /^(?![0-9]+$)(?![a-zA-Z]+$)[0-9A-Za-z]{6,20}$/;
        	var username = $("#username").val();
        	
        	if(!filterName.test(username)){
        		$(".login-form-err").text("Email格式不正确！");
        		return false;
        	}
        	
        	if(!filterWord.test($("#password").val())){
        		$(".login-form-err").text("密码必须由数字和字母组成,6-20位！");
        		return false;
        	}
        	
            if ($("#password").val() != $("#repeatwd").val()) {
                $(".login-form-err").text("两次密码输入不一致，请重新输入。");
                return false;
            }
            $(".login-form-err").text("");
            $("#form").submit();
        });
});