package com.fahamk.spring.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.fahamk.spring.model.Product;
import com.fahamk.spring.model.User;

@Repository
public class UserDAOImpl implements UserDAO {
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public long save(User user) {
		// TODO Auto-generated method stub
		return user.getUserId();
	}

	@Override
	public Product get(long id) {
		// TODO Auto-generated method stub
		return null;
	}
}
