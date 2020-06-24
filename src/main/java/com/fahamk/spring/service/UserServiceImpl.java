package com.fahamk.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fahamk.spring.dao.ProductDAO;
import com.fahamk.spring.dao.UserDAOImpl;
import com.fahamk.spring.model.User;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDAOImpl UserDAO;
	
	@Override
	public long save(User user) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public User get(long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
