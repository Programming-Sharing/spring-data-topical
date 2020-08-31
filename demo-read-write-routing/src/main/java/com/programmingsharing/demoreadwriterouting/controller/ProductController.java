package com.programmingsharing.demoreadwriterouting.controller;

import com.programmingsharing.demoreadwriterouting.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/productlist")
    public String productList(Model model){
        model.addAttribute("productList", productService.getAll());
        return "product-list";
    }

}
