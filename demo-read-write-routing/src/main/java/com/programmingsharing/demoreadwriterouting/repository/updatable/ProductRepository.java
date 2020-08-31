package com.programmingsharing.demoreadwriterouting.repository.updatable;

import com.programmingsharing.demoreadwriterouting.entities.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends CrudRepository<Product, Integer> {
}
