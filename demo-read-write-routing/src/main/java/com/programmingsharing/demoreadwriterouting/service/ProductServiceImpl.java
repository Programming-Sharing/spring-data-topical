package com.programmingsharing.demoreadwriterouting.service;

import com.programmingsharing.demoreadwriterouting.entities.Product;
import com.programmingsharing.demoreadwriterouting.model.CreateProductModel;
import com.programmingsharing.demoreadwriterouting.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Override
    public void create(CreateProductModel model) {
        Product productToBeSaved = new Product();
        productToBeSaved.setName(model.getName());
        productRepository.save(productToBeSaved);
    }

    @Override
    @Transactional(readOnly = true)
    public List<Product> getAll() {
        List<Product> productList = new ArrayList<>();
        productRepository.findAll().forEach(productList::add);
        return productList;
    }
}
