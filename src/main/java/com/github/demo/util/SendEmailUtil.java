package com.github.demo.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Date;
import java.util.Properties;

/**
 * Created by jihaixiao on 2016/4/22.
 */
public class SendEmailUtil {

    private static Logger logger = LoggerFactory.getLogger(SendEmailUtil.class);

    private static final String HOST = "smtp.163.com";

    private static final String PROTOCOL = "smtp";

    private static final int PORT = 25;
    									//woshicainiao1573@163.com
    private static final String SENDER = "woshicainiao1573@163.com";

    private static final String PASSWORD = "daohaode5418";

    private SendEmailUtil(){}

    private static Session getSession(){
        Properties props = new Properties();
        props.put("mail.smtp.host", HOST);//设置服务器地址
        props.put("mail.store.protocol" , PROTOCOL);//设置协议
        props.put("mail.smtp.port", PORT);//设置端口
        props.put("mail.smtp.auth" , true);

        Authenticator authenticator = new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(SENDER, PASSWORD);
            }
        };
        return Session.getDefaultInstance(props,authenticator);
    }

    public static void send(String receiver,String content){
        Session session = getSession();
        try{
            logger.info("开始发送");
            Message msg = new MimeMessage(session);
            //设置message属性
            msg.setFrom(new InternetAddress(SENDER));
            InternetAddress[] addrs = {new InternetAddress(receiver)};
            msg.setRecipients(Message.RecipientType.TO, addrs);
            msg.setSubject("开心网-帐号激活");
            msg.setSentDate(new Date());
            msg.setContent(content,"text/html;charset=utf-8");
            //开始发送
            Transport.send(msg);
            System.out.println("-------发送完成-------");
        } catch (Exception e){
            logger.error("发送邮件异常",e);
        }
    }

}
