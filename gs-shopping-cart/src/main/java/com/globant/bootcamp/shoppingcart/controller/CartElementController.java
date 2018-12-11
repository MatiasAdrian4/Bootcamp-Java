package com.globant.bootcamp.shoppingcart.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.globant.bootcamp.shoppingcart.dto.CartElementDto;
import com.globant.bootcamp.shoppingcart.dto.Mapper;
import com.globant.bootcamp.shoppingcart.model.CartElement;
import com.globant.bootcamp.shoppingcart.service.CartElementService;

@RestController
@RequestMapping("/api/v1")
public class CartElementController {
	
	@Autowired
	private CartElementService cartElements;
	
	// AGREGAR UN ELEMENTO DE CARRO
	@PostMapping("/cartElements/{id_cart}/{id_prod}/{quantity}")
	public CartElementDto addCartElement(@PathVariable("id_cart") Long id_cart, @PathVariable("id_prod") Long id_prod, @PathVariable("quantity") double quantity) {
		return Mapper.convert(cartElements.addCartElement(id_cart,id_prod,quantity));
	}
	
	// OBTENER UN ELEMENTO DE CARRO
	@GetMapping("/cartElements/{id_cartElem}")
	public CartElementDto getCartElement(@PathVariable("id_cartElem") Long id_cartElem) {
		return Mapper.convert(cartElements.getCartElement(id_cartElem));
	}
	
	// BORRAR UN ELEMENTO DE CARRO
	@DeleteMapping("/cartElements/{id_cartElem}")
	public void removeCartElement(@PathVariable("id_cartElem") Long id_cartElem) {
		cartElements.removeCartElement(id_cartElem);
	}
	
	// LISTAR ELEMENTOS DE CARRO
	@GetMapping("/cartElements")
	public List<CartElementDto> getAllCartElements() {
		List<CartElementDto> list = new ArrayList<CartElementDto>();
		for(CartElement c : cartElements.getAllCartElements()) {
			list.add(Mapper.convert(c));
		}
		return list;
	}
	
}