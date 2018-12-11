package com.globant.bootcamp.shoppingcart.repository;

import org.springframework.data.repository.CrudRepository;

import com.globant.bootcamp.shoppingcart.model.Product;

public interface ProductRepository extends CrudRepository<Product,Long> {

}
