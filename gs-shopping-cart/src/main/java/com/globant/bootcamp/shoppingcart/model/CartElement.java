package com.globant.bootcamp.shoppingcart.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class CartElement {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "id_cartElem", unique = true)
	private Long id;
	
	@ManyToOne
	@JoinColumn(name = "id_cart")
	private Cart cart;
	
	@OneToOne
	@JoinColumn(name = "id_prod")
	private Product product;
	
	private double quantity;
	
	public CartElement() {
		
	}
	
	public CartElement(Cart cart, Product product, double quantity) {
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
	
	public Cart getCart() {
		return cart;
	}
	
	public void setCart(Cart cart) {
		this.cart = cart;
	}
	
	public Product getProduct() {
		return product;
	}
	
	public void setProduct(Product product) {
		this.product = product;
	}
	
	public double getQuantity() {
		return quantity;
	}
	
	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}
	
}