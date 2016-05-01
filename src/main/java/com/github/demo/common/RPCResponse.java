package com.github.demo.common;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by jihaixiao on 2016/5/1.
 */
public class RPCResponse<T> implements Serializable{


    private static final long serialVersionUID = 3075944420035788582L;
    /**
     * 响应模块
     */
    private final String reponseModule;

    /**
     * 响应时间
     */
    private final String responseCode;

    /**
     * 响应时间
     */
    private final Date responseDate;

    /**
     * 响应信息
     */
    private final String responseMsg;

    /**
     * 响应备注
     */
    private final String responseMemo;

    /**
     * 相应数据
     */
    private final T responseData;

    public static class Builder<E> {

        private String reponseModule;

        private String responseCode;

        private Date responseDate;

        private String responseMsg;

        private String responseMemo;

        private E responseData;

        public Builder setReponseModule(String reponseModule){
            this.reponseModule = reponseModule;
            return this;
        }

        public Builder setResponseCode(String responseCode){
            this.responseCode = responseCode;
            return this;
        }

        public Builder setResponseDate(Date responseDate){
            this.responseDate = responseDate;
            return this;
        }

        public Builder setResponseMsg(String responseMsg){
            this.responseMsg = responseMsg;
            return this;
        }

        public Builder setResponseMemo(String responseMemo){
            this.responseMemo = responseMemo;
            return this;
        }

        public Builder setResponseData(E responseData){
            this.responseData = responseData;
            return this;
        }

        public RPCResponse<E> build(){
            return new RPCResponse<E>(this);
        }
    }

    private RPCResponse(Builder<T> builder){
        reponseModule = builder.reponseModule;
        responseCode = builder.responseCode;
        responseDate = builder.responseDate;
        responseMsg = builder.responseMsg;
        responseMemo = builder.responseMemo;
        responseData = builder.responseData;
    }

    @Override
    public String toString() {
        return "RPCResponse{" +
                "reponseModule='" + reponseModule + '\'' +
                ", responseCode='" + responseCode + '\'' +
                ", responseDate=" + responseDate +
                ", responseMsg='" + responseMsg + '\'' +
                ", responseMemo='" + responseMemo + '\'' +
                ", responseData=" + responseData +
                '}';
    }
}
