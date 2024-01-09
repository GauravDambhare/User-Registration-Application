package com.test1.SaveUser.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class User2 {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int srno ;
	public String username;
	public String password;
	public long mobileno;
	public String email;
	public User2() {
		super();
		
	}
	public User2(String username, String password, long mobileno, String email , int srno) {
		super();
		this.username = username;
		this.password = password;
		this.mobileno = mobileno;
		this.email = email;
		this.srno = srno ;
		
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
	public long getMobileno() {
		return mobileno;
	}
	public void setMobileno(long mobileno) {
		this.mobileno = mobileno;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	public int getSrno() {
		return srno;
	}
	public void setSrno(int srno) {
		this.srno = srno;
	}
	@Override
	public String toString() {
		return "User2 [srno=" + srno + ", username=" + username + ", password=" + password + ", mobileno=" + mobileno
				+ ", email=" + email + "]";
	}
	

}
