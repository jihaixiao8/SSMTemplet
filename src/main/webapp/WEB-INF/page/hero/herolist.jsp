<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE HTML>
<html>
<head>
    <title>英雄信息</title>
    <meta charset="utf-8"/>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">  
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
	<form id="searchForm" action="" method="post">
			<input type="hidden" name="_method" value="get" />
			<input type="hidden" name="page" value="1">
			<div class="lujing">
               <span class="zhucaidan">英雄信息</span>
               <span class="jiantou">&lt;&lt;</span>
               <span class="zicaidan">英雄基本信息</span>
           	  	<div class="form-inline" style="float: right;">
	               	<select class="form-control" name="heroAttribute" id="channel">
	               		<option value="" selected="selected">英雄属性</option>
	               		<option value="力量" >力量</option>
	               		<option value="敏捷" >敏捷</option>
	               		<option value="智力" >智力</option>
	               	</select>
	               	
	               	<select class="form-control" name="heroOrientation" id="app">
	               		<option value="" >英雄定位</option>
	               		<option value="中单" >中单</option>
	               		<option value="辅助" >辅助</option>
	               		<option value="gank" >gank</option>
	               		<option value="大核" >大核</option>
	               	</select>

	               	 <input type="submit" value="查询" >  
				</div>
			</div>
           <!--table-->
			<table class="table table-bordered table-striped table-hover myTable">
				<thead>
					<tr class="originalTr">
                       <th>英雄名字</th>
	                   <th>英雄技能</th>
	                   <th>技能加点</th>
	               	   <th>英雄出装</th>
	               	   <th>英雄故事</th>
	               	   <th>英雄位置</th>
	               	   <th>英雄属性</th>
					</tr>
				</thead>
				<tbody>				
					<c:forEach var="listHero" items="${listHeros}">
						<tr>
							<td>${listHero.heroName}</td>
							<td>${listHero.heroSkills}</td>
							<td>${listHero.skillPlusPoint}</td>
							<td>${listHero.heroOutOfThePack}</td>
							<td><a href="${listHero.heroLegendStory}">${listHero.heroLegendStory}</a></td>
							<td>${listHero.heroOrientation}</td>
							<td>${listHero.heroAttribute}</td>
						</tr>
					</c:forEach>
               </tbody>
           </table>
      </form>
</body>
</html>