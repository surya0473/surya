package com.sv.dao;

import org.springframework.stereotype.Repository;

import com.sv.entity.User;

@Repository
public interface UserDao {
	public User getUser(String userId);

	public User createUser(User user);

	public User updateUser(User user);

	public boolean disableUser(String userId);

	public User enableUser(String userId);

	public User changeUserPassword(User user);

	public User changeUserEmail(User user);

	public User changeUserMobile(User user);
}
