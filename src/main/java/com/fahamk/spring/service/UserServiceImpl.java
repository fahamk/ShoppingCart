package com.fahamk.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.transaction.Transactional;

import com.fahamk.spring.dao.UserDAOImpl;
import com.fahamk.spring.model.User;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDAOImpl UserDAO;
	
	@Override
	@Transactional
	public long save(User user) {
		return UserDAO.save(user);
	}

	@Override
	public User get(long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
