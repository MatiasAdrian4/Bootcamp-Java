/*package api.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.stereotype.Service;

import api.model.Cart;
import api.model.CartElement;

@Service
public class CartService {
	
	private Map<Long,Cart> carts = new HashMap<Long,Cart>();
	private AtomicLong sequence = new AtomicLong();
	
	public Cart addCart(Cart cart) {
		if(cart != null) {
			cart.setId(sequence.incrementAndGet());
			cart.setProducts(new ArrayList<CartElement>());
			carts.put(sequence.get(),cart);
			return cart;
		} else {
			return null;
		}
	}
	
	public Cart getCart(Long id) {
		return carts.get(id);
	}
	
	public Cart removeCart(Long id) {
		Cart cart = carts.get(id);
		if(cart != null) {
			carts.remove(id);
			return cart;
		} else {
			return null;
		}
	}
	
	public Cart addCartElement(Long cart_id, CartElement cartElem) {
		if(cartElem != null) {
			Cart cart = carts.get(cart_id);
			if(cart != null) {
				cart.addCartElement(cartElem);
				return cart;
			} else {
				return null;
			}
		} else {
			return null;
		}
	}

	public List<Cart> getAllCarts() {
		return new ArrayList<>(carts.values()); 
	}
	
}*/
