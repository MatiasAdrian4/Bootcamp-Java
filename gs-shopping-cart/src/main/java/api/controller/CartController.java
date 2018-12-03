/*package api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import api.model.Cart;
import api.model.CartElement;
import api.model.Product;
import api.service.CartService;
import api.service.ProductService;

@RestController
@RequestMapping("/api")
public class CartController {
	
	@Autowired
	private ProductService products;
	
	@Autowired
	private CartService carts;
	
	// AGREGAR UN CARRO
	@PostMapping("/carts")
	public Cart addCart(@RequestBody Cart cart) {
		carts.addCart(cart);
		return cart;
	}
	
	// OBTENER UN CARRO
	@GetMapping("/carts/{cart_id}")
	public Cart getCart(@PathVariable("cart_id") Long cart_id) {
		Cart cart = carts.getCart(cart_id);
		return cart;
	}
	
	// BORRAR UN CARRO
	@DeleteMapping("/carts/{cart_id}")
	public Cart removeCart(@PathVariable("cart_id") Long cart_id) {
		Cart cart = carts.getCart(cart_id);
		carts.removeCart(cart_id);
		return cart;
	}
	
	// LISTAR CARROS
	@GetMapping("/carts")
	public List<Cart> getAllCarts() {
		return carts.getAllCarts();
	}
	
	// AGREGAR UN ELEMENTO DE CARRITO A UN CARRO
	@GetMapping("/carts/{cart_id}/products/{prod_id}/{quantity}")
	public Cart addCartElement(@PathVariable("cart_id") Long cart_id, @PathVariable("prod_id") Long prod_id, @PathVariable("quantity") double quantity) {
		Product product = products.getProduct(prod_id);
		if(product != null) {
			CartElement cartElem = new CartElement(product,quantity);
			return carts.addCartElement(cart_id,cartElem);
		} else {
			return null;
		}
	}
	
}*/
