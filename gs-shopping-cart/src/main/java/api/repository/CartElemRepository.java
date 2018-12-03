package api.repository;

import org.springframework.data.repository.CrudRepository;

import api.model.CartElement;

public interface CartElemRepository extends CrudRepository<CartElement,Long> {

}
