package com.globant.bootcamp.shoppingcart.dto;

import java.util.ArrayList;
import java.util.List;

public class CartDto {
	
	private Long id;
	private UserDto user;
	private List<CartElementDto> cartElems;
	
	public CartDto() {
		
	}
	
	public CartDto(List<CartElementDto> cartElems) {
		this.cartElems = cartElems;
	}
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public UserDto getUser() {
		return user;
	}
	
	public void setUser(UserDto user) {
		this.user = user;
	}
	
	public List<CartElementDto> getCartElems() {
		return new ArrayList<CartElementDto>(cartElems);
	}
	
	public void setCartElems(List<CartElementDto> cartElems) {
		this.cartElems = cartElems;
	}
	
}