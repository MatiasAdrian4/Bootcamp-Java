package com.globant.bootcamp.shoppingcart.repository;

import org.springframework.data.repository.CrudRepository;

import com.globant.bootcamp.shoppingcart.model.User;

public interface UserRepository extends CrudRepository<User,Long> {

}
