package com.globant.bootcamp.shoppingcart.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.globant.bootcamp.shoppingcart.model.Cart;
import com.globant.bootcamp.shoppingcart.model.CartElement;
import com.globant.bootcamp.shoppingcart.model.User;
import com.globant.bootcamp.shoppingcart.repository.CartRepository;
import com.globant.bootcamp.shoppingcart.repository.UserRepository;

@Service
public class CartService {
	
	@Autowired
	private CartRepository cartRepository;
	
	@Autowired
	private UserRepository userRepository;
	
	public Cart addCart(Cart cart, Long id_user) {
		User user = userRepository.findById(id_user).get();
		if(user != null) {
			cart.setCartElems(null);
			cart.setUser(user);
			cartRepository.save(cart);
			return cart;
		} else {
			return null;
		}
	}
	
	public Cart getCart(Long id) {
		try {
			Cart cart = cartRepository.findById(id).get();
			return cart;
		} catch (Exception e) {
			return null;
		}
		
	}
	
	public void removeCart(Long id) {
		cartRepository.deleteById(id);
	}
	
	public List<Cart> getAllCarts() {
		return (List<Cart>) cartRepository.findAll();
	}
	
}
