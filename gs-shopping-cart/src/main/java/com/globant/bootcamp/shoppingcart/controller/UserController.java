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

import com.globant.bootcamp.shoppingcart.dto.Mapper;
import com.globant.bootcamp.shoppingcart.dto.UserDto;
import com.globant.bootcamp.shoppingcart.model.Cart;
import com.globant.bootcamp.shoppingcart.model.User;
import com.globant.bootcamp.shoppingcart.service.UserService;

@RestController
@RequestMapping("/api/v1")
public class UserController {
	
	@Autowired
	private UserService users;
	
	// AGREGAR UN USUARIO
	@PostMapping("/users")
	public UserDto addUser(@RequestBody UserDto user) {
		users.addUser(Mapper.convert(user));
		return user;
	}
	
	// OBTENER UN USUARIO
	@GetMapping("/users/{user_id}")
	public UserDto getUser(@PathVariable("user_id") Long user_id) {
		return Mapper.convert(users.getUser(user_id));
	}
	
	// BORRAR UN USUARIO
	@DeleteMapping("/users/{user_id}")
	public void removeUser(@PathVariable("user_id") Long user_id) {
		users.removeUser(user_id);
	}
	
	// LISTAR USUARIOS
	@GetMapping("/users")
	public List<UserDto> getAllUsers() {
		List<UserDto> list = new ArrayList<UserDto>();
		for(User u : users.getAllUsers()) {
			list.add(Mapper.convert(u));
		}
		return list;
	}

}
