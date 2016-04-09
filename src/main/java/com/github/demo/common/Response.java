package com.github.demo.common;

import java.io.Serializable;
import java.util.Date;

public class Response<T> implements Serializable{
	

	private static final long serialVersionUID = -2852060536175433538L;

	/**
	 * 返回码
	 */
	private int code;
	
	/**
	 * 详细说明
	 */
	private String msg;
	
	/**
	 * 返回数据
	 */
	private T data;
	
	/**
	 * 响应时间
	 */
	private Date responseTime;

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

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public Date getResponseTime() {
		return responseTime;
	}

	public void setResponseTime(Date responseTime) {
		this.responseTime = responseTime;
	}
	
	public Response(int code,String msg,T data){
		setCode(code);
		setMsg(msg);
		setData(data);
		this.responseTime = new Date();
	}
	
	public Response(int code,String msg){
		setCode(code);
		setMsg(msg);
		this.responseTime = new Date();
	}
	
}
