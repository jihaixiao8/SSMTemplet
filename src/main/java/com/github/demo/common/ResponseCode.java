package com.github.demo.common;

public enum ResponseCode {
	
	SUCCESS(00000,"成功"),
	PARAM_ILLEGAL(10000,"参数不合法"),
	SERVICE_EXCEPTION(10001,"服务器异常");
		
	private int code;
	
	private String msg;
	
	
	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	private ResponseCode(int code,String msg){
		this.code = code;
		this.msg = msg;
	}
	
}
