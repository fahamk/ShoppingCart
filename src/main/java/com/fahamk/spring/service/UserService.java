package com.fahamk.spring.service;

import java.util.List;

import com.fahamk.spring.model.Product;
import com.fahamk.spring.model.User;

public interface UserService {
	long save(User user);
	
	User get(long id);
}
