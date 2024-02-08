package com.pack.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "User")
public class User {

	@Id
	@Column(name="userId")
	private int userId;

	@Column(name = "userName")
	private String username;

	@Column(name="password")
	private String password;

	@Column(name="email",unique = true)
	//@Email
	private String email;

	@Column(name="phoneNumber")
	private String phoneNumber;
	
	

	public int getUserId() {
		return userId;
	}



	public void setUserId(int userId) {
		this.userId = userId;
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



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public String getPhoneNumber() {
		return phoneNumber;
	}



	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}



	public User() {
			}



	public User(int userId, String username, String password, String email, String phoneNumber) {
		super();
		this.userId = userId;
		this.username = username;
		this.password = password;
		this.email = email;
		this.phoneNumber = phoneNumber;
	}



	@Override
	public String toString() {
		return "User [userId=" + userId + ", username=" + username + ", password=" + password + ", email=" + email
				+ ", phoneNumber=" + phoneNumber + "]";
	}
	

}
