package com.spring.webflow.domain;

import java.io.Serializable;


public class ShadowUser implements Serializable {
	
	private static final long serialVersionUID = 1L;

	private Integer age;
	private String firstName;
	private Integer id;
	private String lastName;
	private Boolean status;

	public ShadowUser() {
	}

	public Integer getAge() {
		return this.age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Boolean getStatus() {
		return this.status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}

}