/*package api.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import api.model.Product;
import api.service.ProductService;

import org.springframework.beans.factory.annotation.Autowired;

@RestController
@RequestMapping("/api")
public class ProductController {
	
	@Autowired
	private ProductService products;
	
	// AGREGAR UN PRODUCTO
	@PostMapping("/products")
	public Product addProduct(@RequestBody Product product) {
		products.addProduct(product);
		return product;
	}
	
	// OBTENER UN PRODUCTO
	@GetMapping("/products/{prod_id}")
	public Product getProduct(@PathVariable("prod_id") Long prod_id) {
		Product product = products.getProduct(prod_id);
		return product;
	}
	
	// BORRAR UN PRODUCTO
	@DeleteMapping("/products/{prod_id}")
	public Product removeProduct(@PathVariable("prod_id") Long prod_id) {
		Product product = products.getProduct(prod_id);
		products.removeProduct(prod_id);
		return product;
	}
	
	// LISTAR PRODUCTOS
	@GetMapping("/products")
	public List<Product> getAllProducts() {
		return products.getAllProducts();
	}
	
}*/	