package com.springmvc.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Criteria;
import org.springframework.stereotype.Repository;

import com.hibernate.vo.User;

@Repository
@Transactional
public class UserDaoImpl extends BaseDao<User> implements UserDao {

	@Override
	public List<User> getAllUsers() {
		Criteria criteria = createEntityCriteria();
		List<User> list = (List<User>) criteria.list();
		return list;
	}

	@Override
	public void saveUser(User user) {
		persist(user);

	}

}
