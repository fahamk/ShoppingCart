package com.fahamk.spring.dao;

import java.util.List;

import com.fahamk.spring.model.Product;
import com.fahamk.spring.model.ProductInCart;

public interface ProductDAO {
	
	Product get(long id);
	
	List<Product> list();
	
	void update(long id, Product product);
	
	void delete(long id);
	
}
