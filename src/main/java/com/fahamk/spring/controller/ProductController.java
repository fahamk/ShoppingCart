package com.fahamk.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fahamk.spring.model.Product;
import com.fahamk.spring.service.ProductService;

@RestController
public class ProductController {
	
	@Autowired
	private ProductService productService;
	
	@GetMapping("/api/product")
	public ResponseEntity<List<Product>> list(){
		List<Product> list =  productService.list();
		return ResponseEntity.ok().body(list);
	}
	
}
