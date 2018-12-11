package com.globant.bootcamp.shoppingcart.repository;

import org.springframework.data.repository.CrudRepository;

import com.globant.bootcamp.shoppingcart.model.CartElement;

public interface CartElementRepository extends CrudRepository<CartElement,Long> {

}
