<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE HTML>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no">
    <title>登录</title>
    <script src="libs/jquery/jquery.js"></script>
    <script src="libs/th2w.core.js"></script>
    <script type="text/javascript">
        Core.init({
            url: 'resources',
            css: ['./css/login'],
            js: ['bootstrap/js/bootstrap.min', 'particles/particles', './js/login','./js/iface/loginForm']
        });
    </script>
</head>
<body>
<div id="particles-js" style="z-index:6;"></div>
<div class="layout">
    <div class="header">
        <div class="logo" style="width: 100px;height: 50px;line-height: 50px;font-size: 40px;">LOGO</div>
    </div>
    <div class="login-main">
        <div class="login-body">
            <div style="width: 120px;height: 60px;margin: 0 auto 20px auto;font-size: 40px;">MAX+</div>
            <form id="loginForm" action="/webapptest/confirmLogin.do" method="post" class="login-form">
                <input type="text" id="username" name="username" placeholder="账号" class="top-radius">
                <input type="password" id="password" name="password" placeholder="密码" class="bottom-radius"
                       style="">
            </form>
            	
            <div class="login-form-bt1" id="login">登录</div>
            <div class="login-form-err">${errmsg}</div>
            <a href="/webapptest/register.jsp"><div class="login-form-bt2">创建账号</div></a>
            <div class="login-form-wd1"><a href="">忘记密码?</a></div>
            <div class="login-form-wd2"><a href="">返回</a></div>
        </div>
    </div>
    <div class="footer">
        <div class="logo" style="width: 200px;height: 20px;line-height: 40px;font-size: 20px;float: right">QQ 微信 微博 XX
        </div>
    </div>
</div>
</body>
</html>

