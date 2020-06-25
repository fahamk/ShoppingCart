package com.fahamk.spring.service;

import java.util.List;

import com.fahamk.spring.model.ProductInCart;
import com.fahamk.spring.model.User;

public interface ProductInCartService {
	long save(ProductInCart ProductInCart);
	
	ProductInCart get(long id);
	
	List<ProductInCart> list(String user);
	
	void update(long id, int quanity);
	
	void delete(long id);

}
