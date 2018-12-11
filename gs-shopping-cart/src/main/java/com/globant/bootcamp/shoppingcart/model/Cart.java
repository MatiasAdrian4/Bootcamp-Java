package com.globant.bootcamp.shoppingcart.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.globant.bootcamp.shoppingcart.dto.CartElementDto;

@Entity
public class Cart {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "id_cart", unique = true)
	private Long id;
	
	@OneToOne
	@JoinColumn(name = "id_user", unique = true) //el carro es dueño del usuario
	private User user;
	
	@OneToMany(mappedBy = "cart")
	private List<CartElement> cartElems;
	
	public Cart() {
		
	}
	
	public Cart(List<CartElement> cartElems) {
		this.cartElems = cartElems;
	}
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public User getUser() {
		return user;
	}
	
	public void setUser(User user) {
		this.user = user;
	}
	
	public List<CartElement> getCartElems() {
		return new ArrayList<CartElement>(cartElems);
	}
	
	public void setCartElems(List<CartElement> cartElems) {
		this.cartElems = cartElems;
	}
	
}