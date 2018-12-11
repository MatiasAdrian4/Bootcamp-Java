package com.globant.bootcamp.shoppingcart.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.globant.bootcamp.shoppingcart.model.Cart;
import com.globant.bootcamp.shoppingcart.model.CartElement;
import com.globant.bootcamp.shoppingcart.model.Product;
import com.globant.bootcamp.shoppingcart.repository.CartElementRepository;
import com.globant.bootcamp.shoppingcart.repository.CartRepository;
import com.globant.bootcamp.shoppingcart.repository.ProductRepository;

@Service
public class CartElementService {
	
	@Autowired
	private CartElementRepository cartElemRepository;
	
	@Autowired
	private CartRepository cartRepository;
	
	@Autowired
	private ProductRepository productRepository;
	
	
	public CartElement addCartElement(Long id_cart, Long id_prod, double quantity) {
		Cart cart = cartRepository.findById(id_cart).get();
		if(cart != null) {
			Product product = productRepository.findById(id_prod).get();
			if(product != null) {
				CartElement cartElem = new CartElement(cart,product,quantity);
				cartElemRepository.save(cartElem);
				return cartElem;
			} else {
				return null;
			}
		} else {
			return null;
		}
	}
	
	public CartElement getCartElement(Long id_cartElem) {
		try {
			CartElement cartElem = cartElemRepository.findById(id_cartElem).get();
			return cartElem;
		} catch(Exception e) {
			return null;
		}
	}
	
	public void removeCartElement(Long id_cartElem) {
		cartElemRepository.deleteById(id_cartElem);
	}
	
	public List<CartElement> getAllCartElements() {
		return (List<CartElement>) cartElemRepository.findAll();
	}
	
}