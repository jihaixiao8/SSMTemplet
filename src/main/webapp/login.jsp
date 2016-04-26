<%@ page pageEncoding="utf-8"%>  
<!DOCTYPE HTML>
<html>
<head>
 <title>广告平台</title>
<style>														
	body{background:url('resources/img/p_03.jpg') no-repeat top center;position:relation;}
	form{
		margin: 0 auto;
	}
</style>
 <meta charset="utf-8" />
 <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no">
 <script src="libs/th2w.core.js"></script>
 <script src="libs/jquery/jquery.js"></script>
 <script type="text/javascript">
	Core.init ({
		url : 'resources',
		css	: ['bootstrap/css/bootstrap.min'],
		js  : ['bootstrap/js/bootstrap.min','./js/particles.min','./js/particles','./js/app' ]
	});
 </script>
</head>

<body>
 <div id="particles-js" style="z-index:6;"></div>

 <div class="form" style="background-color: rgba(0.0.0.0.5);z-index:3;width:500px;height:500px;">
	<form id="loginForm" action="/webapptest/confirmLogin.do" method="post" >
        <input autocomplete="off" type="text" name="username" placeholder="用户名" required="required" autofocus="autofocus"/>
        <input autocomplete="off" type="password" name="password" placeholder="密码" required="required"/>
        <input type="submit" value="登录"/>
	</form>
</div>
</body>
</html>