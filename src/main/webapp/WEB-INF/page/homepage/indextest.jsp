<%@ page pageEncoding="utf-8"%>  
<!DOCTYPE HTML>
<html>
<head>
    <title>修改密码-广告主</title>
    <meta charset="utf-8"/>
    <meta name="viewport" content="width=device-width,initial-scale=1,maximum-scale=1.0">
    <style type="text/css">
        ${demo.css}
    </style>
    <script src="libs/th2w.core.js"></script>
    <script src="libs/jquery/jquery.js"></script>
    <script type="text/javascript">
        Core.init({
            url: 'resources',
            css: ['bootstrap/css/bootstrap.min', 'dialog/css/ui-dialog', './css/common'],
            js: ['bootstrap/js/bootstrap.min', 'dialog/js/dialog-plus-min', './js/common']
        });
    </script>
</head>
<body>

<nav class="navbar navbar-default  navbar-fixed-top navbar-bgc">
    <div class="container-fluid">
        <!-- Brand and toggle get grouped for better mobile display -->
        <div class="navbar-header">
            <button type="button" class="navbar-toggle collapsed" data-toggle="collapse"
                    data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
                <span class="sr-only">Toggle navigation</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand" href="#">LOGO</a>
        </div>

        <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
            <ul class="nav navbar-nav navbar-right">
                <li class="dropdown">
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true"
                       aria-expanded="false">在线客服 <span class="caret"></span></a>
                    <ul class="dropdown-menu">
                        <li><a class="qq"
                               href="http://b.qq.com/webc.htm?new=0&amp;sid=800006808&amp;eid=2188z8p8p8p8p8x8z8p8z&amp;o=www.youmi.net&amp;q=7"
                               target="_blank">开发者基础服务</a></li>
                        <li><a class="qq" href="http://wpa.qq.com/msgrd?v=3&uin=189991293&site=qq&menu=yes" target="_blank">开发者商务合作（Android）</a>
                        </li>
                        <li><a class="qq" href="http://wpa.qq.com/msgrd?v=3&uin=189991292&site=qq&menu=yes" target="_blank">开发者商务合作（iOS）</a>
                        </li>
                    </ul>
                </li>
                <li><a href="" class="feedback-icon" target="_blank"><i class="icon-chat"></i>反馈网站问题</a></li>
                <li><a href="" class="welcome-icon"><i class="icon-user"></i>cryingstar530@sina.com</a></li>
                <li><a href="" class="logout-icon"><i class="icon-logout"></i>退出</a></li>
            </ul>
        </div>
        <!-- /.navbar-collapse -->
    </div>
    <!-- /.container-fluid -->
</nav>

<div class="container-fluid">
    <div class="row main_content">
        <div class="left_nav">
            <div class="panel-group" id="accordion" role="tablist" aria-multiselectable="true">
                <div class="panel panel-default myPanel">
                    <div class="panel-heading primary-menu close-up" role="tab" id="heading0">
                        <img src="resources/img/ico11.png" data-up-icon="/resources/img/ico11.png"
                             data-down-icon="/resources/img/ico12.png"/>
                        <h4 class="panel-title" data-selected="false">
                            <a class="collapsed" data-toggle="collapse" data-parent="#accordion" href="#collapse0"
                               aria-expanded="false" aria-controls="collapse0">
                                后台首页
                            </a>
                        </h4>
                    </div>
                </div>

                <div class="panel panel-default myPanel">
                    <div class="panel-heading primary-menu close-up" role="tab" id="heading1">
                        <img src="resources/img/ico01.png" data-up-icon="/resources/img/ico01.png"
                             data-down-icon="/resources/img/ico02.png"/>
                        <h4 class="panel-title" data-selected="false">
                            <a class="collapsed" data-toggle="collapse" data-parent="#accordion" href="#collapse1"
                               aria-expanded="false" aria-controls="collapse1">
                                渠道中心
                            </a>
                        </h4>
                    </div>
                    <div id="collapse1" class="panel-collapse collapse subMenu " role="tabpanel" aria-labelledby="heading1">
                        <div class="panel-body">
                            <ul>
                                <li class=""><a href="adv-apply.html">申请广告</a></li>
                                <li class=""><a href="adv-create.html">添加渠道</a></li>
                                <li class=""><a href="adv-lists.html">渠道列表</a></li>
                                <li class=""><a href="adv-income.html">收入明细</a></li>
                            </ul>
                        </div>
                    </div>
                </div>

                <div class="panel panel-default myPanel">
                    <div class="panel-heading primary-menu close-up" role="tab" id="heading2">
                        <img src="resources/img/ico09.png" data-up-icon="/resources/img/ico09.png"
                             data-down-icon="/resources/img/ico10.png"/>
                        <h4 class="panel-title" data-selected="false">
                            <a class="collapsed" data-toggle="collapse" data-parent="#accordion" href="#collapse2"
                               aria-expanded="false" aria-controls="collapse2">
                                数据中心
                            </a>
                        </h4>
                    </div>
                    <div id="collapse2" class="panel-collapse collapse subMenu " role="tabpanel" aria-labelledby="heading2">
                        <div class="panel-body">
                            <ul>
                                <li class=""><a href="/loving_cms/album/photo/">收入报表</a></li>
                                <li class=""><a href="/loving_cms/album/album/">应用报表</a></li>
                                <li class=""><a href="/loving_cms/album/package/">用户报表</a></li>
                            </ul>
                        </div>
                    </div>
                </div>

                <div class="panel panel-default myPanel">
                    <div class="panel-heading primary-menu close-up" role="tab" id="heading3">
                        <img src="resources/img/ico21.png" data-up-icon="/resources/img/ico21.png"
                             data-down-icon="/resources/img/ico22.png"/>
                        <h4 class="panel-title" data-selected="false">
                            <a class="collapsed" data-toggle="collapse" data-parent="#accordion" href="#collapse3"
                               aria-expanded="false" aria-controls="collapse3">
                                财务中心
                            </a>
                        </h4>
                    </div>
                    <div id="collapse3" class="panel-collapse collapse subMenu " role="tabpanel" aria-labelledby="heading3">
                        <div class="panel-body">
                            <ul>

                                <li class=""><a href="/loving_cms/iface/region/">财务记录</a></li>

                                <li class=""><a href="/loving_cms/iface/city/">通知设置</a></li>
                                <li class=""><a href="/loving_cms/iface/city/">申请提款</a></li>

                            </ul>
                        </div>
                    </div>
                </div>

                <div class="panel panel-default myPanel">
                    <div class="panel-heading primary-menu drop-down" role="tab" id="heading4">
                        <img src="resources/img/ico18.png" data-up-icon="/resources/img/ico17.png"
                             data-down-icon="/resources/img/ico18.png"/>
                        <h4 class="panel-title" data-selected="true">
                            <a class="collapsed" data-toggle="collapse" data-parent="#accordion" href="#collapse4"
                               aria-expanded="false" aria-controls="collapse4">
                                个人中心
                            </a>
                        </h4>
                    </div>
                    <div id="collapse4" class="panel-collapse collapse subMenu in" role="tabpanel" aria-labelledby="heading4">
                        <div class="panel-body">
                            <ul>
                                <li class=""><a href="/webapptest/heroinformation.do">基本英雄信息</a></li>
                                <li class=""><a href="/loving_cms/terminal/version/">财务信息设置</a></li>
                                <li class=""><a href="/loving_cms/terminal/about/">推荐有奖</a></li>
                                <li class=""><a href="/loving_cms/terminal/about/">我的信箱</a></li>
                                <li class="activeStyle"><a href="adv-password.html">修改密码</a></li>
                            </ul>
                        </div>
                    </div>
                </div>

            </div>
            <div class="NavToggle">
                <div class="btnToggle"></div>
            </div>
        </div>
        <!-- right content -->
        <div class="right-content">

        </div>
        <!-- end right content -->
    </div>
</div>

</body>
</html>