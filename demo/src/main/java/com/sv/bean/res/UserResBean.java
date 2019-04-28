package com.sv.bean.res;

public class UserResBean {
	private String userId;
	private String userName;
	private String password;
	private String date;
	private String time;
	private String userRole;
	private String userType;
	private String userEmail;
	private String mobileNumber;
	private int isEnabled;

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

	public int getIsEnabled() {
		return isEnabled;
	}

	public void setIsEnabled(int isEnabled) {
		this.isEnabled = isEnabled;
	}

	@Override
	public String toString() {
		return "UserResBean [userId=" + userId + ", userName=" + userName + ", password=" + password + ", date=" + date
				+ ", time=" + time + ", userRole=" + userRole + ", userType=" + userType + ", userEmail=" + userEmail
				+ ", mobileNumber=" + mobileNumber + ", isEnabled=" + isEnabled + "]";
	}


}
