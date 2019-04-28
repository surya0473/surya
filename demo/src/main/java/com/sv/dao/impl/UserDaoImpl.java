package com.sv.dao.impl;

import com.sv.dao.UserDao;
import com.sv.dao.utility.DaoUtility;
import com.sv.entity.User;

public class UserDaoImpl extends DaoUtility implements UserDao {

	@Override
	public User getUser(String userId) {
		return null;
	}

	@Override
	public User createUser(User user) {
		user.setId(saveEntity(user));
		return user;
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
