package com.fahamk.spring.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fahamk.spring.dao.ProductInCartDAO;
import com.fahamk.spring.model.ProductInCart;
import com.fahamk.spring.model.User;

@Service
public class ProductInCartServiceImpl implements ProductInCartService {
	@Autowired
	private ProductInCartDAO productInCartDAO;
	
	@Override
	public long save(ProductInCart ProductInCart) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ProductInCart get(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@Transactional
	public List<ProductInCart> list(User user) {
		// TODO Auto-generated method stub
		return productInCartDAO.list(user);
	}

	@Override
	public void update(long id, int quanity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(long id) {
		// TODO Auto-generated method stub
		
	}

}
