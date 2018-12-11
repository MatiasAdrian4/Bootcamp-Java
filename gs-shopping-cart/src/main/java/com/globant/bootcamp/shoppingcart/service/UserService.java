package com.globant.bootcamp.shoppingcart.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.globant.bootcamp.shoppingcart.model.User;
import com.globant.bootcamp.shoppingcart.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	public User addUser(User user) {
		if(user != null) {
			User newUser = new User(user.getFirstName(),user.getLastName());
			userRepository.save(newUser);
			return newUser;
		} else {
			return null;
		}
	}
	
	public User getUser(Long id) {
		try {
			User user = userRepository.findById(id).get();
			return user;
		} catch(Exception e) {
			return null;
		}
	}
	
	public void removeUser(long id) {
		userRepository.deleteById(id);
	}
	
	public List<User> getAllUsers() {
		return (List<User>) userRepository.findAll();
	}
	
}
