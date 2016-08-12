package com.springmvc.service;

import java.util.List;

import com.hibernate.vo.User;

public interface UserService {

	User findById(Integer id);

	User findByName(String name);

	void saveUser(User user);

	void updateUser(User user);

	void deleteUserById(long id);

	List<User> findAllUsers();

	void deleteAllUsers();

	public boolean isUserExist(User user);

}
