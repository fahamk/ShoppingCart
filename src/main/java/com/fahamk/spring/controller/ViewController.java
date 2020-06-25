package com.fahamk.spring.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import com.fahamk.spring.model.Product;
import com.fahamk.spring.model.ProductInCart;

@Controller
@SessionAttributes("user")
public class ViewController {
	
	@RequestMapping("home")
	public ModelAndView listProducts(HttpSession session) {
		String id = session.getId();
		ModelAndView mv = new ModelAndView();		
		final String uri = "http://localhost:8080/ShoppingCartAPI/api/product";
	    RestTemplate restTemplate = new RestTemplate();
	    //String result = restTemplate.getForObject(uri, String.class);
	    Product[] result = restTemplate.getForObject(uri, Product[].class);
	    
		mv.addObject("user", id);
		mv.addObject("productlist", result);
		mv.setViewName("index.jsp");
		return mv;	
	}
	
	@RequestMapping("cart")
	public ModelAndView add(HttpSession session) {
		System.out.println("We are here in new page");
		String id = session.getId();
		ModelAndView mv = new ModelAndView();		
		final String uri = "http://localhost:8080/ShoppingCartAPI/api/productincart?user="+id;
	    RestTemplate restTemplate = new RestTemplate();
	    //String result = restTemplate.getForObject(uri, String.class);
	    ProductInCart[] result = restTemplate.getForObject(uri, ProductInCart[].class);
	    
		mv.addObject("user", id);
		mv.addObject("productlist", result);
		mv.setViewName("cart.jsp");
		return mv;	
	}
	
	@RequestMapping("checkout")
	public ModelAndView checkout() {
		ModelAndView mv = new ModelAndView();		
		mv.setViewName("checkout.jsp");
		return mv;	
	}
}
