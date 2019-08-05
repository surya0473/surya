package com.sv.bean.req;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;

public class UserReqBean {
	private String userId;
	@NotNull(message = "Name cannot be null")
	@Size(min = 5, max = 14, message = "About Me must be between 5 and 14 characters")
	private String userName;
	@NotNull(message = "Password cannot be null")
	private String password;
	@NotNull(message = "Date cannot be null")
	@Size(min = 8, max = 12, message = "Invalid date")
	private String date;
	@NotNull(message = "Time cannot be null")
	@Size(min = 8, max = 12, message = "Invalid time")
	private String time;
	@NotNull(message = "User Role cannot be null")
	@Size(min = 4, max = 10, message = "Invalid role")
	private String userRole;
	private String userType;
	@Email(message = "Email should be valid")
	private String userEmail;
	@NotNull(message = "Number cannot be null")
	@Size(min = 10, max = 14, message = "Invalid Number")
	private String mobileNumber;
	
	public UserReqBean() {
		super();
	}

	public UserReqBean(String userId, String userName, String password, String date, String time, String userRole,
			String userType, String userEmail, String mobileNumber) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.password = password;
		this.date = date;
		this.time = time;
		this.userRole = userRole;
		this.userType = userType;
		this.userEmail = userEmail;
		this.mobileNumber = mobileNumber;
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

	@Override
	public String toString() {
		return "UserReqBean [userId=" + userId + ", userName=" + userName + ", password=" + password + ", date=" + date
				+ ", time=" + time + ", userRole=" + userRole + ", userType=" + userType + ", userEmail=" + userEmail
				+ ", mobileNumber=" + mobileNumber + "]";
	}

}
