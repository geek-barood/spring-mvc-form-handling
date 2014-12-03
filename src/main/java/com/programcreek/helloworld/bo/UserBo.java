package com.programcreek.helloworld.bo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.programcreek.helloworld.dao.UserDao;
import com.programcreek.helloworld.entity.User;

@Service("userBo")
public class UserBo {
	@Autowired
	UserDao userDao;
	
	public User getUserById(int id) {
		return userDao.getUserById(id);
	}
	
	public User getUserByUsername(String username) {
		return userDao.getUserByUsername(username);
	}
	
	public void removeUserById(int id) {
		userDao.removeUserById(id);
	}
	
	public void removeUserByUsername(String username) {
		userDao.removeUserByUsername(username);
	}
}
