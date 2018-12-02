package api.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.stereotype.Service;

import api.model.Cart;
import api.model.User;

@Service
public class UserService {
	
	private Map<Long,User> users = new HashMap<Long,User>();
	private AtomicLong sequence = new AtomicLong();
	
	public User addUser(User user) {
		if(user != null) {
			user.setId(sequence.incrementAndGet());
			user.setCarts(new ArrayList<Cart>());
			users.put(sequence.get(),user);
			return user;
		} else {
			return null;
		}
	}
	
	public User getUser(Long id) {
		return users.get(id);
	}
	
	public User removeUser(long id) {
		User user = users.get(id);
		if(user != null) {
			users.remove(id);
			return user;
		} else {
			return null;
		}
	}
	
	public Cart addCart(Long user_id, Cart cart) {
		if(cart != null) {
			User user = users.get(user_id);
			if(user != null) {
				user.addCart(cart);
				return cart;
			} else {
				return null;
			}
		} else {
			return null;
		}
	}
	
	public List<User> getUsers() {
		return new ArrayList<>(users.values());
	}
	
}
