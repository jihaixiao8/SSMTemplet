package com.github.test.base;

import com.github.demo.util.SendEmailUtil;

/**
 * Created by jihaixiao on 2016/4/22.
 */
public class TestSendMail extends BaseTest{
    public static void main(String[] args) {
        String email = "513933837@qq.com";
        String url = "http://dotamax.com/accounts/activate/?code=1355232010078313026158610802243816008665107084236732338551422530_1461660604.94 ";
//        String content = "亲爱的Dotamax用户 609418509@qq.com : 您可以通过如下链接激活您的账号, \r"+url+"\n"+" 欢迎您使用并注册Dotamax。 "+"\n"
//        				 +"--Dotamax Administrator"+"\n"+"Dear Dotamax User 609418509@qq.com,"+"\n"+"Your can click the above link to activate your account: "
//        				 +url+"\n"+" Thanks for registration and use Dotamax.";
        String content = "qwe"+""+"123";
        SendEmailUtil.send(email,content);
    }
}
