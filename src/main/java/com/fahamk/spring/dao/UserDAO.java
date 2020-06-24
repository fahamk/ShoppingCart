package com.fahamk.spring.dao;

import java.util.List;

import com.fahamk.spring.model.Product;
import com.fahamk.spring.model.ProductInCart;
import com.fahamk.spring.model.User;

public interface UserDAO {
	long save(User user);
	
	Product get(long id);
	
}
