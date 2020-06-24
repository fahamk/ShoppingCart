package com.fahamk.spring.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.fahamk.spring.model.Product;
import com.fahamk.spring.model.ProductInCart;
import com.fahamk.spring.model.User;

@Repository
public class ProductInCartDAOImpl implements ProductInCartDAO {
	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public long save(ProductInCart productInCart) {
		// TODO Auto-generated method stub
		return productInCart.getpCartid();
	}

	@Override
	public ProductInCart get(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ProductInCart> list(User userId) {
		Query query =  sessionFactory.getCurrentSession().createQuery("from ProductInCart where user=:userId");
		query.setParameter("userId", userId);
		return query.list();
	}

	@Override
	public void update(long id, ProductInCart product) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(long id) {
		// TODO Auto-generated method stub
		
	}

}
