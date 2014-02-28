package com.spring.webflow.domain;

import java.io.Serializable;

public class Logincredential implements Serializable {
	
	private static final long serialVersionUID = 1L;

	private Integer id;
	private String loginname;
	private String password;

	public Logincredential() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getLoginname() {
		return this.loginname;
	}

	public void setLoginname(String loginname) {
		this.loginname = loginname;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}