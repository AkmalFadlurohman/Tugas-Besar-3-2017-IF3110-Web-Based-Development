package com.olride.bean;

import com.google.gson.Gson;


public class User {
 
	private int id;
	private String fullname;
	private	String username;
	private String email;
	private String phone;
	private String status;
	private String token;

	public User() {
		
	}
	public User(int id,String fullname,String username,String email,String phone,String status,String token) {
		this.fullname = fullname;
		this.username = username;
		this.email = email;
		this.phone = phone;
		this.status = status;
		this.token = token;
	}
	public String toString() {
		return ("User [id=" + id + ", fullname=" + fullname + ", username=" + username + ", email=" + email + ", phone=" + phone + ", status=" + status + ", token=" + token + "]");
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFullname() {
		return fullname;
	}
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
}
