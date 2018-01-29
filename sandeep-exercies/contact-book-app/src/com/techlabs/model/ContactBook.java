package com.techlabs.model;

import java.io.Serializable;
import java.util.UUID;

public class ContactBook implements Serializable {

	private static final long serialVersionUID = 1L;
	private String firstName;
	private String lastName;
	private String mobile;
	private String email;
	private String contactId;

	public ContactBook() {
		
	}
	
	public ContactBook(String firstName, String lastName, String mobile, String email) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.mobile = mobile;
		this.email = email;
		UUID id = UUID.randomUUID();
		contactId = id.toString();
	}



	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getContactId() {
		return contactId;
	}

}