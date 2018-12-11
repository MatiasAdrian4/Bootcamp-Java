package com.globant.bootcamp.shoppingcart.repository;

import org.springframework.data.repository.CrudRepository;

import com.globant.bootcamp.shoppingcart.model.Cart;

public interface CartRepository extends CrudRepository<Cart,Long> {

}
