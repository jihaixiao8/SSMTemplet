package com.github.demo.util;

public class StitchingStringUtil {
	
	//注册发送邮件
	public static String appendStr(String username, String password){
		String url = StitchingStringUtil.appendUrl(username, password);
		String content = "亲爱的Dotamax用户 "+username+" : "+"<br>"+"<br>"+
						 "&nbsp;&nbsp;您可以通过如下链接激活您的账号,"+"<br>"+"<br>"+
				         "&nbsp;&nbsp;"+url+"<br>"+"<br>"+
						 "&nbsp;&nbsp;欢迎您使用并注册Dotamax。 "+"<br>"+"<br>"+
				         "--Dotamax Administrator"+"<br>"+"Dear Dotamax User "+username+","+
						 "<br>"+"<br>"+"&nbsp;&nbsp;Your can click the above link to activate your account: "+
						 "&nbsp;&nbsp;"+"<br>"+"<br>"+url+"<br>"+"<br>"+"&nbsp;&nbsp;Thanks for registration and use Dotamax.";
    	return content;
    }
	
	private static String appendUrl(String username, String password){
		String url = "http://localhost:8080/webapptest/confirmLogin.do?username="+username+"&password="+password+"&status=1";
		return url;
	}
	
	//修改密码发送邮件
	public static String appendStrUpdate(String username){
		String url = StitchingStringUtil.appendUrlUpdate(username);
		String content = "亲爱的DotaMax用户 :"+"<br><br>"+"您可以通过如下链接找回您的密码。"+"<br><br>"+url+"<br><br>"+"欢迎您加入DotaMax用户组。"+"<br><br>"+"--来自DotaMax用户组 ";
		return content;
	}
	
	private static String appendUrlUpdate(String username){
		String url = "http://localhost:8080/webapptest/update.jsp?username="+username;
		return url;
	}
}
