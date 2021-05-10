package com.ncu.models;

import javax.validation.constraints.*;

public class Customer {
	private String fname;
	private String lname;
	private String age;
	private String gender;
	public String[] cart;
	
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}

	 public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String[] getCart() {
		return cart;
	}
	public void setCart(String cart[]) {
		this.cart = cart;
	}
	}

