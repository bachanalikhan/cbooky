package com.cbooky.invoice.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

@Entity
public class User implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5086964448566915328L;
	private String userName;
	@Id
	@NotNull(message = "Email is required")
	@Pattern(regexp = ".+@.+\\.[a-z]+", message = "Must be valid email")
	private String email;

	public User() {
	}

	public User(String userName,
			@NotNull(message = "Email is required") @Pattern(regexp = ".+@.+\\.[a-z]+", message = "Must be valid email") String email) {
		super();
		this.userName = userName;
		this.email = email;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
