package com.learning.ownpratice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.learning.ownpratice.model.Product;
import com.learning.ownpratice.service.ProductService;

@RestController
public class ProductController {

	@Autowired
	private ProductService prodservice;
	
	@GetMapping("/products")
	public List<Product> getAll()
	{
		return prodservice.getAllProducts();
		
	}
	
	@PostMapping("/product/add")
	public Product addingNewProd(@RequestBody Product newProduct)
	{
		return prodservice.addProduct(newProduct);
		
	}
	
	
	
}
