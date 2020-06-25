package com.fahamk.spring.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.fahamk.spring.model.ProductInCart;
import com.fahamk.spring.model.User;
import com.fahamk.spring.service.ProductInCartService;

@RestController
public class ProductInCartController {
	
	@Autowired
	private ProductInCartService productInCartService;
	
	@GetMapping("/api/productincart")
	public ResponseEntity<List<ProductInCart>> list(@RequestParam("user") String user){
		List<ProductInCart> list =  productInCartService.list(user);
		return ResponseEntity.ok().body(list);
	}
	
	//save book
	@PostMapping("/api/productincart")
	public void save(@ModelAttribute ProductInCart productInCart, HttpServletResponse response) throws IOException{
		System.out.println("Product is: " + productInCart.getFk_productid());
		long id = productInCartService.save(productInCart);
		response.sendRedirect("/ShoppingCartAPI/home");
		// return ResponseEntity.ok().body("Saved product in cart with id: " + productInCartService);
	}
	
	@PostMapping("/api/productincartphase2")
	public void saveFromCart(@ModelAttribute ProductInCart productInCart, HttpServletResponse response) throws IOException{
		System.out.println("Product is: " + productInCart.getFk_productid());
		long id = productInCartService.save(productInCart);
		response.sendRedirect("/ShoppingCartAPI/cart");
		// return ResponseEntity.ok().body("Saved product in cart with id: " + productInCartService);
	}
	
	@GetMapping("/api/productincart/{id}")
	public void delete(@PathVariable("id") long id, HttpServletResponse response) throws IOException{
		productInCartService.delete(id);
		response.sendRedirect("/ShoppingCartAPI/cart");
	}
}
