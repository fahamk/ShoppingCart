package com.fahamk.spring.dao;

import java.util.List;

import com.fahamk.spring.model.ProductInCart;
import com.fahamk.spring.model.User;

public interface ProductInCartDAO {
	long save(ProductInCart productInCart);
	
	ProductInCart get(long id);
	
	List<ProductInCart> list(String userId);
	
	void update(long id, ProductInCart product);
	
	void delete(long id);
}
