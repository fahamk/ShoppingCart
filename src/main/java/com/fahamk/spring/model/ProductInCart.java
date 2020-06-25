package com.fahamk.spring.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="productInCart")
public class ProductInCart {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long pCartid; 
	private int quantity;
	private String name;
	private float price;
	private String fk_userId;
	private int fk_productid;
	
	public long getpCartid() {
		return pCartid;
	}

	public void setpCartid(long pCartid) {
		this.pCartid = pCartid;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) { 
		this.quantity = quantity;
	}

	public String getFk_userId() {
		return fk_userId;
	}

	public void setFk_userId(String fk_userId) {
		this.fk_userId = fk_userId;
	}

	public int getFk_productid() {
		return fk_productid;
	}

	public void setFk_productid(int fk_productid) {
		this.fk_productid = fk_productid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}
	
	
}
