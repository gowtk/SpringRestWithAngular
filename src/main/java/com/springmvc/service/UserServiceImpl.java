package com.springmvc.service;

import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hibernate.vo.User;
import com.springmvc.repository.UserDao;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserDao userDao;

	private static final AtomicLong counter = new AtomicLong();

	private static List<User> users;

	public List<User> findAllUsers() {
		return userDao.getAllUsers();
	}

	public User findById(Integer id) {
		for (User user : users) {
			if (user.getId() == id) {
				return user;
			}
		}
		return null;
	}

	public User findByName(String name) {
		for (User user : users) {
			if (user.getUsername().equalsIgnoreCase(name)) {
				return user;
			}
		}
		return null;
	}

	public void saveUser(User user) {
		userDao.saveUser(user);
	}

	public void updateUser(User user) {
		;
	}

	public void deleteUserById(long id) {

	}

	public boolean isUserExist(User user) {
		return findByName(user.getUsername()) != null;
	}

	public void deleteAllUsers() {
		users.clear();
	}

}
