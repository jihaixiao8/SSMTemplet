package com.github.demo.model;

import java.io.Serializable;
import java.util.Date;

public class User extends BaseQueryPO implements Serializable{
	
	
	private static final long serialVersionUID = 1L;

	private Long id;
	
	private String username;
	
	private String password;

	private String mobile;
	
	private int type;
	
	private int status;
	
	private Date createTime;
	
	private Date modifiedTime;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}
	
	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getModifiedTime() {
		return modifiedTime;
	}

	public void setModifiedTime(Date modifiedTime) {
		this.modifiedTime = modifiedTime;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", password="
				+ password + ", mobile=" + mobile + ", type=" + type
				+ ", status=" + status + ", createTime=" + createTime
				+ ", modifiedTime=" + modifiedTime + "]";
	}
	
}
