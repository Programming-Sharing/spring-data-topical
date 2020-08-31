package com.programmingsharing.demoreadwriterouting.service;

import com.programmingsharing.demoreadwriterouting.entities.Product;
import com.programmingsharing.demoreadwriterouting.model.CreateProductModel;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface ProductService {

    void create(CreateProductModel model);

    @Transactional(readOnly = true)
    List<Product> getAll();

}
