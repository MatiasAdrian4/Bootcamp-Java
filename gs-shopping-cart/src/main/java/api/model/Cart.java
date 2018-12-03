package api.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;

@Entity
public class Cart {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "id_cart")
	private Long id;
	
	@ManyToMany
	@JoinColumn(name ="id_cartElem")
	private List<CartElement> products;
	
	public Cart() {
		
	}
	
	public Cart(List<CartElement> products) {
		this.products = products;
	}
	
	/*public Long getId() {
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
	}*/
	
}