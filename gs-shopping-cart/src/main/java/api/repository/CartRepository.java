package api.repository;

import org.springframework.data.repository.CrudRepository;

import api.model.Cart;

public interface CartRepository extends CrudRepository<Cart,Long> {

}
