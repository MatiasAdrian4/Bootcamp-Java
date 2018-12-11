package com.globant.bootcamp.shoppingcart.dto;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.globant.bootcamp.shoppingcart.model.*;

public class Mapper {

	public static ProductDto convert(Product product) {
		return new ProductDto(product.getId(),product.getName(),product.getPrice());
	}
	
	public static Product convert(ProductDto product) {
		Product result = new Product();
		result.setId(product.getId());
		result.setName(product.getName());
		result.setPrice(product.getPrice());
		return result;
	}
	
	public static CartDto convert(Cart cart) {
		CartDto result = new CartDto();
		result.setId(cart.getId());
		result.setUser(Mapper.convert(cart.getUser()));
		/*if(cart.getCartElems() != null) {
			List<CartElementDto> list = new ArrayList<CartElementDto>();
			for(CartElement cartElem : cart.getCartElems()) {
				list.add(Mapper.convert(cartElem));
			}
			result.setCartElems(list);
		} else*/
			result.setCartElems(new ArrayList<CartElementDto>());
		return result;
	}
	
	public static Cart convert(CartDto cart) {
		Cart result = new Cart();
		result.setId(cart.getId());
		result.setUser(Mapper.convert(cart.getUser()));
		/*if(cart.getCartElems() != null) {
			List<CartElement> list = new ArrayList<CartElement>();
			for(CartElementDto cartElem : cart.getCartElems()) {
				list.add(Mapper.convert(cartElem));
			}
			result.setCartElems(list);
		} else*/
			result.setCartElems(new ArrayList<CartElement>());
		return result;
	}
	
	public static UserDto convert(User user) {
		return new UserDto(user.getId(),user.getFirstName(),user.getLastName());
	}
	
	public static User convert(UserDto user) {
		User result = new User();
		result.setId(user.getId());
		result.setFirstName(user.getFirstName());
		result.setLastName(user.getLastName());
		return result;
	}
	
	public static CartElementDto convert(CartElement cartElem) {
		CartElementDto result = new CartElementDto();
		result.setId(cartElem.getId());
		result.setCart(Mapper.convert(cartElem.getCart()));
		result.setProduct(Mapper.convert(cartElem.getProduct()));
		result.setQuantity(cartElem.getQuantity());
		return result;
	}
	
	public static CartElement convert(CartElementDto cartElem) {
		CartElement result = new CartElement();
		result.setId(cartElem.getId());
		result.setCart(Mapper.convert(cartElem.getCart()));
		result.setProduct(Mapper.convert(cartElem.getProduct()));
		result.setQuantity(cartElem.getQuantity());
		return result;
	}
	
}
