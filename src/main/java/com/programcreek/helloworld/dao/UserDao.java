package com.programcreek.helloworld.dao;

import org.springframework.stereotype.Repository;

import com.programcreek.helloworld.CustomHibernateSupport;
import com.programcreek.helloworld.entity.User;

@Repository("userDao")
public class UserDao extends CustomHibernateSupport {
	
	public User getUserByUsername(String username)  {
		User user = null;
		try {
			user = (User) getHibernateTemplate().find("from User where username=?", username).get(0);
		} catch (Exception e) {
			user = null;
		}
		return user;
	}

	public User getUserById(int id) {
		User user = null;
		try {
			user = (User) getHibernateTemplate().find("from User where id=?", id).get(0);
		} catch (Exception e) {
			user = null;
		}
		return user;
	}
	
	public void removeUserById(int id) {
		getHibernateTemplate().delete(getUserById(id));
	}
	
	public void removeUserByUsername(String username) {
		getHibernateTemplate().delete(getUserByUsername(username));
	}
}
