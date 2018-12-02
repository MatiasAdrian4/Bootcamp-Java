package api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import api.model.Cart;
import api.model.User;
import api.service.CartService;
import api.service.UserService;

@RestController
@RequestMapping("/api")
public class UserController {
	
	@Autowired
	private UserService users;
	
	@Autowired
	private CartService carts;
	
	// AGREGAR UN USUARIO
	@PostMapping("/users")
	public User addUser(@RequestBody User user) {
		users.addUser(user);
		return user;
	}
	
	// OBTENER UN USUARIO
	@GetMapping("/users/{user_id}")
	public User getUser(@PathVariable("user_id") Long user_id) {
		User user = users.getUser(user_id);
		return user;
	}
	
	// BORRAR UN USUARIO
	@DeleteMapping("/users/{user_id}")
	public User removeUser(@PathVariable("user_id") Long user_id) {
		User user = users.getUser(user_id);
		users.removeUser(user_id);
		return user;
	}
	
	// LISTAR USUARIOS
	@GetMapping("/users")
	public List<User> getAllUsers() {
		return users.getUsers();
	}
	
	// AGREGAR UN CARRO AL USUARIO
	@GetMapping("/users/{user_id}/carts/{cart_id}")
	public Cart addCart(@PathVariable("user_id") Long user_id, @PathVariable("cart_id") Long cart_id) {
		Cart cart = carts.getCart(cart_id);
		return users.addCart(user_id,cart);
	}
}
