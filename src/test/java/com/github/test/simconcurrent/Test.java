package com.github.test.simconcurrent;

import com.github.demo.common.RPCResponse;

import java.util.Date;

/**
 * Created by jihaixiao on 2016/4/12.
 */
public class Test {
    public static void main(String[] args) {
        RPCResponse<String> response = new RPCResponse.Builder<String>().setResponseCode("0000")
                .setResponseDate(new Date()).setReponseModule("SEC").setResponseData("哈哈").build();
        System.out.println(response);
    }


}
