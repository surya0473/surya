package com.sv.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import com.sv.constants.QueryConstants;
import com.sv.dao.UserDao;
import com.sv.dao.utility.DaoUtility;
import com.sv.entity.User;

@Repository
public class UserDaoImpl extends DaoUtility implements UserDao {

	@SuppressWarnings("unchecked")
	@Override
	public User getUser(String userId) {
		User user = null;
		Session session = openSession();
		Query query = session.createQuery(QueryConstants.GET_USER);
		query.setParameter(QueryConstants.userId, userId);
		List<User> list = query.list();
		if (list != null && list.size() > 0) {
			user = list.get(0);
		}
		return user;
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
