package com.sv.service;

import org.springframework.stereotype.Service;

import com.sv.bean.req.UserReqBean;
import com.sv.bean.res.UserResBean;
import com.sv.entity.User;

@Service
public interface UserService {
	public User getUser(String userId);

	public UserResBean createUser(UserReqBean user);

	public User updateUser(User user);

	public boolean disableUser(String userId);

	public User enableUser(String userId);

	public User changeUserPassword(User user);

	public User changeUserEmail(User user);

	public User changeUserMobile(User user);

}
