package api.model;

import java.util.ArrayList;
import java.util.List;

public class Cart {
	
	private Long id;
	private List<CartElement> products;
	
	public Cart() {
		
	}
	
	public Cart(Long id, List<CartElement> products) {
		this.id = id;
		this.products = products;
	}
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public List<CartElement> getProducts() {
		return products;
	}
	
	public void setProducts(List<CartElement> products) {
		this.products = products;
	}
	
	public void addCartElement(CartElement cartElem) {
		if(products == null) {
			products = new ArrayList<CartElement>();
		}
		products.add(cartElem);
	}
	
}