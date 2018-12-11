package com.globant.bootcamp.shoppingcart.dto;

public class CartElementDto {
	
	private Long id;
	private CartDto cart;
	private ProductDto product;
	private double quantity;
	
	public CartElementDto() {
		
	}
	
	public CartElementDto(Long id, CartDto cart, ProductDto product, double quantity) {
		this.id = id;
		this.cart = cart;
		this.product = product;
		this.quantity = quantity;
	}
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public CartDto getCart() {
		return cart;
	}
	
	public void setCart(CartDto cart) {
		this.cart = cart;
	}
	
	public ProductDto getProduct() {
		return product;
	}
	
	public void setProduct(ProductDto product) {
		this.product = product;
	}
	
	public double getQuantity() {
		return quantity;
	}
	
	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}
	
}