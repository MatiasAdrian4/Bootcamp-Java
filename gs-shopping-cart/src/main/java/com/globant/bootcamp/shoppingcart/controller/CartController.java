package com.globant.bootcamp.shoppingcart.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.globant.bootcamp.shoppingcart.dto.CartDto;
import com.globant.bootcamp.shoppingcart.dto.Mapper;
import com.globant.bootcamp.shoppingcart.model.Cart;
import com.globant.bootcamp.shoppingcart.model.CartElement;
import com.globant.bootcamp.shoppingcart.model.Product;
import com.globant.bootcamp.shoppingcart.service.CartService;
import com.globant.bootcamp.shoppingcart.service.ProductService;

@RestController
@RequestMapping("/api/v1")
public class CartController {
	
	@Autowired
	private ProductService products;
	
	@Autowired
	private CartService carts;
	
	// AGREGAR UN CARRO
	@PostMapping("/carts/{id_user}")
	public CartDto addCart(@RequestBody CartDto cart, @PathVariable("id_user") Long id_user) {
		carts.addCart(Mapper.convert(cart),id_user);
		return cart;
	}
	
	// OBTENER UN CARRO
	@GetMapping("/carts/{id_cart}")
	public CartDto getCart(@PathVariable("id_cart") Long id_cart) {
		return Mapper.convert(carts.getCart(id_cart));
	}
	
	// BORRAR UN CARRO
	@DeleteMapping("/carts/{id_cart}")
	public void removeCart(@PathVariable("id_cart") Long id_cart) {
		carts.removeCart(id_cart);
	}
	
	// LISTAR CARROS
	@GetMapping("/carts")
	public List<CartDto> getAllCarts() {
		List<CartDto> list = new ArrayList<CartDto>();
		for(Cart c : carts.getAllCarts()) {
			list.add(Mapper.convert(c));
		}
		return list;
	}
	
}
