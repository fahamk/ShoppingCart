package com.fahamk.spring.dao;

import java.util.List;

import org.hibernate.Session;
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
		String userID = productInCart.getFk_userId();
		int productID = productInCart.getFk_productid();
		Query query =  sessionFactory.getCurrentSession().createQuery("from ProductInCart where fk_userId=:userId and fk_productid=:productId");
		query.setParameter("userId", userID);
		query.setParameter("productId", productID);
		List<ProductInCart> list = query.list();
		if(list.size()>0) {
			int quanity = productInCart.getQuantity();
			productInCart = list.get(0);
			productInCart.setQuantity(quanity);
		}
		sessionFactory.getCurrentSession().saveOrUpdate(productInCart);
		return productInCart.getpCartid();
	}

	@Override
	public ProductInCart get(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ProductInCart> list(String userId) {
		Query query =  sessionFactory.getCurrentSession().createQuery("from ProductInCart where fk_userId=:userId");
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
		Session session = sessionFactory.getCurrentSession();
		ProductInCart productInCart = session.byId(ProductInCart.class).load(id);
		session.delete(productInCart);
	}

}
