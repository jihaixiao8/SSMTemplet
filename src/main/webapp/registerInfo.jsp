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
            <div class="login-box">
                <div style="font-size: 14px;font-weight: bold;margin-bottom: 10px">STEP 2: 验证邮箱</div>
                亲爱的用户 ${successMsg}，感谢您注册Dotamax账号。
                <br>
                为了更好的管理您的账号和使用Dotamax的其他服务，我们还需要您通过登陆邮箱来激活您的账号。
                <br>
                您的邮箱 “${successMsg}” 会有一封来自 admin@dotamax.com的激活邮件，如果长时间没有收到请查看下垃圾邮件。
                <br>
                <br>
                注意：您如果不激活邮箱也可以正常使用但是忘记密码或者账号被盗可能将无法找回。
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