package com.programmingsharing.demoreadwriterouting.repository.readonly;

import com.programmingsharing.demoreadwriterouting.entities.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductReadonlyRepository extends CrudRepository<Product, Integer> {

}
