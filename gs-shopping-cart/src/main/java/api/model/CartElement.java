package api.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;

@Entity
public class CartElement {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "id_cartElem", unique = true)
	private Long id;
	
	@ManyToMany
	@JoinColumn(name ="id_prod")
	private Product product;
	
	private double quantity;
	
	public CartElement() {
		
	}
	
	public CartElement(Product product, double quantity) {
		this.product = product;
		this.quantity = quantity;
	}
	
	/*public Product getProduct() {
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
	}*/
	
}
