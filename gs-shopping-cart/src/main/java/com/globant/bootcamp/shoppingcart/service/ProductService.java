package com.globant.bootcamp.shoppingcart.service;

import com.globant.bootcamp.shoppingcart.model.Product;
import com.globant.bootcamp.shoppingcart.repository.ProductRepository;
import com.globant.bootcamp.shoppingcart.repository.UserRepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepository repository;
	
	public Product addProduct(Product product) {
		if(product != null) {
			repository.save(product);
			return product;
		} else
			return null;
	}
	
	public Product getProduct(Long id) {
		try {
			return repository.findById(id).get();
		} catch(Exception e) {
			return null;
		}
	}
	
	public void removeProduct(Long id) {
		repository.deleteById(id);
	}
	
	public List<Product> getAllProducts() {
		return (List<Product>) repository.findAll();
	}
	
}
