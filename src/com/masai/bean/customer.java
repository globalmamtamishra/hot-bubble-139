package com.masai.bean;

public class customer {
	
	private int id;
	private String name;
	private String email;
	private String pass;
	private String mobile;
	private String address;
	
	
	public customer(int id, String name, String email, String pass, String mobile, String address) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.pass = pass;
		this.mobile = mobile;
		this.address = address;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "bean_customer [id=" + id + ", name=" + name + ", email=" + email + ", pass=" + pass + ", mobile="
				+ mobile + ", address=" + address + "]";
	}
	
	


}
