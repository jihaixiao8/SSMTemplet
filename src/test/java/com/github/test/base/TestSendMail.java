package com.github.test.base;

import com.github.demo.util.SendEmailUtil;

/**
 * Created by jihaixiao on 2016/4/22.
 */
public class TestSendMail extends BaseTest{
    public static void main(String[] args) {
        String email = "609418509@qq.com";
        String content = "哈哈哈";
        SendEmailUtil.send(email,content);
    }
}
