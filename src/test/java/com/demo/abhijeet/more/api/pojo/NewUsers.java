package com.demo.abhijeet.more.api.pojo;

/***
 * 
 * @author Abhi_Amarr
 *
 */

public class NewUsers {

	private String name;
	private String username;
	private String email;
	private Address address;

	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	public String getUsername() {
		return username;
	}

	/**
	 * @param username
	 *            the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	/**
	 * @param email
	 *            the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	public Address getAddress() {
		return address;
	}

	/**
	 * @param address
	 *            the address to set
	 */
	public void setAddress(Address address) {
		this.address = address;
	}

	public NewUsers(String name, String username, String email, Address address) {
		super();
		this.name = name;
		this.username = username;
		this.email = email;
		this.address = address;
	}

	public NewUsers() {
		super();
	}

}
