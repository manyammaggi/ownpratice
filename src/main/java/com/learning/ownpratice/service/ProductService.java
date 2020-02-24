package com.learning.ownpratice.service;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.learning.ownpratice.model.Product;

@Service
public class ProductService {
	

	public List<Product> getAllProducts(){
		List<Product> productobj= new ArrayList<>();
		
		productobj.add(new Product('1', "Iphone", "Awesome", "megha", 500.00));
		productobj.add(new Product('2', "Nexus", "Great", "jigu", 400.00));
		productobj.add(new Product('3', "Samsung", "Good", "jagan", 300.00));
		productobj.add(new Product('4', "Redmi", "Average", "madhavi", 200.00));
		
		return productobj;
		
	}
	
	public Product addProduct(Product newProduct) {
		newProduct.setId('5');
//		newProduct.setPname("hp");
//		newProduct.setDescription("nice");
//		newProduct.setSeller("tom");
//		newProduct.setPrice(100.00);
		
		return newProduct;
	}
	
}
