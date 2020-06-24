package com.fahamk.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.fahamk.spring.model.ProductInCart;
import com.fahamk.spring.model.User;
import com.fahamk.spring.service.ProductInCartService;

@RestController
public class ProductInCartController {
	
	@Autowired
	private ProductInCartService productInCartService;
	
	@GetMapping("/api/productincart")
	public ResponseEntity<List<ProductInCart>> list(@RequestBody User user){
		List<ProductInCart> list =  productInCartService.list(user);
		return ResponseEntity.ok().body(list);
	}
}
