<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no">
    <title>注册</title>
    <script src="libs/jquery/jquery.js"></script>
    <script src="libs/th2w.core.js"></script>
    <script type="text/javascript">
        Core.init({
            url: 'resources',
            css: ['./css/login'],
            js: ['bootstrap/js/bootstrap.min', 'particles/particles', './js/login','./js/iface/register']
        });
    </script>
</head>
<body>
<div id="particles-js" style="z-index:5;"></div>
<div class="layout">
    <div class="header">
        <div class="logo" style="width: 100px;height: 50px;line-height: 50px;font-size: 40px;">LOGO</div>
    </div>
    <div class="login-main">
        <div class="login-body">
            <div class="register-title">输入注册信息</div>
            <div class="login-form-err">${errmsg}</div>
            <form action="/webapptest/confirmRegister.do" method="post" class="login-form" id="form">
                <div class="login-form-label">Email(用户名):</div>
                <input type="text" id="username" name="username" placeholder="请输入正确的邮箱" class="all-radius">
                <div class="login-form-label">密码:</div>
                <input type="password" id="password" name="password" placeholder="不少于6个字符" class="all-radius">
                <div class="login-form-label">确认密码:</div>
                <input type="password" id="repeatwd" name="repeatwd" placeholder="请再次输入密码" class="all-radius">
            </form>
            <div class="login-form-bt1" id="btn">注册</div>
            <div class="login-form-wd2" style="margin-top: 70px"><a href="/webapptest/login.jsp">返回</a></div>
        </div>
    </div>
    <div class="footer">
        <div class="logo" style="width: 200px;height: 20px;line-height: 40px;font-size: 20px;float: right">
            QQ 微信 微博 XX
        </div>
    </div>
</div>
</body>
</html>