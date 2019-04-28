package com.sv.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user")
public class User implements Serializable {
	private static final long serialVersionUID = -1483094383674780005L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private long id;
	@Column(name = "user_id", nullable = false, unique = true)
	private String userId;
	@Column(name = "user_name", nullable = false, unique = false)
	private String userName;
	@Column(name = "password", nullable = false, unique = true)
	private String password;
	@Column(name = "date", nullable = false, unique = false)
	private String date;
	@Column(name = "time", nullable = false, unique = false)
	private String time;
	@Column(name = "user_role", nullable = false, unique = false)
	private String userRole;
	@Column(name = "user_type", nullable = true, unique = false)
	private String userType;
	@Column(name = "email", nullable = false, unique = true)
	private String userEmail;
	@Column(name = "moble", nullable = false, unique = true)
	private String mobileNumber;
	@Column(name = "is_enable", nullable = false)
	private int isEnable;

	public User() {
		super();
	}

	public User(long id, String userId, String userName, String password, String date, String time, String userRole,
			String userType, String userEmail, String mobileNumber, int isEnable) {
		super();
		this.id = id;
		this.userId = userId;
		this.userName = userName;
		this.password = password;
		this.date = date;
		this.time = time;
		this.userRole = userRole;
		this.userType = userType;
		this.userEmail = userEmail;
		this.mobileNumber = mobileNumber;
		this.isEnable = isEnable;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getUserRole() {
		return userRole;
	}

	public void setUserRole(String userRole) {
		this.userRole = userRole;
	}

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public int isEnable() {
		return isEnable;
	}

	public void setEnable(int isEnable) {
		this.isEnable = isEnable;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", userId=" + userId + ", userName=" + userName + ", password=" + password + ", date="
				+ date + ", time=" + time + ", userRole=" + userRole + ", userType=" + userType + ", userEmail="
				+ userEmail + ", mobileNumber=" + mobileNumber + ", isEnable=" + isEnable + "]";
	}

}
