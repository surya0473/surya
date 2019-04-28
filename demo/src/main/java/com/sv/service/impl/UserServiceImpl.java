package com.sv.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.sv.bean.req.UserReqBean;
import com.sv.bean.res.UserResBean;
import com.sv.dao.UserDao;
import com.sv.entity.User;
import com.sv.service.UserService;

public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao dao;

	@Override
	public User getUser(String userId) {
		return null;
	}

	@Override
	public UserResBean createUser(UserReqBean reqBean) {
		User user = new User();
		user.setUserName(reqBean.getUserName());
		user.setUserEmail(reqBean.getUserEmail());
		user.setPassword(reqBean.getPassword());
		user.setUserRole(reqBean.getUserRole());
		user.setUserType(reqBean.getUserType());
		user.setMobileNumber(reqBean.getMobileNumber());
		user.setTime(reqBean.getTime());
		user.setDate(reqBean.getDate());
		user.setUserId(reqBean.getUserId());
		user.setEnable(1);
		user = dao.createUser(user);
		UserResBean respBean = new UserResBean();
		respBean.setUserName(user.getUserName());
		respBean.setUserEmail(user.getUserEmail());
		respBean.setPassword(user.getPassword());
		respBean.setUserRole(user.getUserRole());
		respBean.setUserType(user.getUserType());
		respBean.setMobileNumber(user.getMobileNumber());
		respBean.setTime(user.getTime());
		respBean.setDate(user.getDate());
		respBean.setUserId(user.getUserId());
		respBean.setIsEnabled(user.isEnable());
		return respBean;
	}

	@Override
	public User updateUser(User user) {
		return null;
	}

	@Override
	public boolean disableUser(String userId) {
		return false;
	}

	@Override
	public User enableUser(String userId) {
		return null;
	}

	@Override
	public User changeUserPassword(User user) {
		return null;
	}

	@Override
	public User changeUserEmail(User user) {
		return null;
	}

	@Override
	public User changeUserMobile(User user) {
		return null;
	}

}
