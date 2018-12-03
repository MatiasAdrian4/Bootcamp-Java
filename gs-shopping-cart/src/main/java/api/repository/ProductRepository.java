package api.repository;

import org.springframework.data.repository.CrudRepository;

import api.model.Product;

public interface ProductRepository extends CrudRepository<Product,Long> {

}
