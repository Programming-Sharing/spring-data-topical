package com.programmingsharing.demoreadwriterouting.controller;

import com.programmingsharing.demoreadwriterouting.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/")
    public String productList(Model model){
        model.addAttribute("productList", productService.getAll());
        return "product-list";
    }

    @GetMapping("/create")
    public String createProduct(Model model){
        model.addAttribute("productList", productService.getAll());
        return "product-list";
    }

}
