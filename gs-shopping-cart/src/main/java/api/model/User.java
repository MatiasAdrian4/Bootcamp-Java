package api.model;

import java.util.ArrayList;
import java.util.List;

public class User {
	
	private Long id;
	private String firstName;
	private String lastName;
	private List<Cart> carts;
	
	public User() {
		
	}
	
	public User(Long id, String firstName, String lastName, List<Cart> carts) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.carts = carts;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public List<Cart> getCarts() {
		return carts;
	}

	public void setCarts(List<Cart> carts) {
		this.carts = carts;
	}
	
	public void addCart(Cart cart) {
		if(carts == null) {
			carts = new ArrayList<Cart>();
		}
		carts.add(cart);
	}
	
}
