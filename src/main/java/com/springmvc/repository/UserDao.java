package com.springmvc.repository;

import java.util.List;

import com.hibernate.vo.User;

public interface UserDao {

	List<User> getAllUsers();

	void saveUser(User user);

}
