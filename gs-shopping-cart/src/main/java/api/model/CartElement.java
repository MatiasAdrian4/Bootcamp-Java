package api.model;

public class CartElement {

	private Product product;
	private double quantity;
	
	public CartElement() {
		
	}
	
	public CartElement(Product product, double quantity) {
		this.product = product;
		this.quantity = quantity;
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
