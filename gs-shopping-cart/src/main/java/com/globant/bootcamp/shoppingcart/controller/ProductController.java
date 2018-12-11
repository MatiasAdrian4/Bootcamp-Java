package com.globant.bootcamp.shoppingcart.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.globant.bootcamp.shoppingcart.dto.Mapper;
import com.globant.bootcamp.shoppingcart.dto.ProductDto;
import com.globant.bootcamp.shoppingcart.model.Product;
import com.globant.bootcamp.shoppingcart.service.ProductService;

import org.springframework.beans.factory.annotation.Autowired;

@RestController
@RequestMapping("/api/v1")
public class ProductController {
	
	@Autowired
	private ProductService products;
	
	// AGREGAR UN PRODUCTO
	@PostMapping("/products")
	public ProductDto addProduct(@RequestBody ProductDto product) {
		products.addProduct(Mapper.convert(product));
		return product;
	}
	
	// OBTENER UN PRODUCTO
	@GetMapping("/products/{id_prod}")
	public ProductDto getProduct(@PathVariable("id_prod") Long id_prod) {
		return Mapper.convert(products.getProduct(id_prod));
	}
	
	// BORRAR UN PRODUCTO
	@DeleteMapping("/products/{id_prod}")
	public void removeProduct(@PathVariable("id_prod") Long id_prod) {
		products.removeProduct(id_prod);
	}
	
	// LISTAR PRODUCTOS
	@GetMapping("/products")
	public List<ProductDto> getAllProducts() {
		List<ProductDto> list = new ArrayList<ProductDto>();
		for(Product p : products.getAllProducts()) {
			list.add(Mapper.convert(p));
		}
		return list;
	}
	
}