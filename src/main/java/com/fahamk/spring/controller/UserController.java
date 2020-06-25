package com.fahamk.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.fahamk.spring.model.ProductInCart;
import com.fahamk.spring.model.User;
import com.fahamk.spring.service.ProductInCartService;
import com.fahamk.spring.service.UserService;

@RestController
public class UserController {
	@Autowired
	private UserService userService;
	
	@PostMapping("/api/createuser")
	public ResponseEntity<?> save(@RequestBody User user){
		long id = userService.save(user);
		return ResponseEntity.ok().body("User successfully created with id: " + id);
	}
}
