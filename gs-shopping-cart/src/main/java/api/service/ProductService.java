/*package api.service;

import api.model.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.stereotype.Service;

@Service
public class ProductService {
	
	private Map<Long,Product> products = new HashMap<Long,Product>();
	private AtomicLong sequence = new AtomicLong();
	
	public Product addProduct(Product product) {
		if(product != null) {
			product.setId(sequence.incrementAndGet());
			products.put(sequence.get(),product);
			return product;
		} else
			return null;
	}
	
	public Product getProduct(Long id) {
		return products.get(id);
	}
	
	public Product removeProduct(Long id) {
		Product product = products.get(id);
		if(products != null) {
			products.remove(id);
			return product;
		} else
			return null;
	}
	
	public List<Product> getAllProducts() {
		return new ArrayList<>(products.values());
	}
	
}*/
