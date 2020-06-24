package com.fahamk.spring.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.fahamk.spring.model.Product;
import com.fahamk.spring.model.ProductInCart;

@Repository
public class ProductDAOImpl implements ProductDAO {
	
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public Product get(long id) {
		return null;
	}

	@Override
	public List<Product> list() {
		List<Product> list =  sessionFactory.getCurrentSession().createQuery("from Product").list();
		return list;
	}

	@Override
	public void update(long id, Product product) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(long id) {
		// TODO Auto-generated method stub
		
	}

}
