<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no">
    <title>忘记密码</title>
    <script src="libs/jquery/jquery.js"></script>
    <script src="libs/th2w.core.js"></script>
    <script type="text/javascript">
        Core.init({
            url: 'resources',
            css: ['./css/login'],
            js: ['bootstrap/js/bootstrap.min', 'particles/particles', './js/login']
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
            <div class="register-title">找回密码</div>
            <div class="login-form-box">
                重置密码链接已经发送到您的邮箱，请点击邮件里的链接继续重置密码。
                <br>
                <span style="color: #CCCCCC;">注意：如果没有收到邮箱可以查看垃圾箱。</span>
            </div>
            <div class="login-form-wd2"><a href="/webapptest/login.jsp">返回</a></div>
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