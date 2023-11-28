package com.piyush.jpa_dbtoclass_mapping.controller;

import com.piyush.jpa_dbtoclass_mapping.model.Product;
import com.piyush.jpa_dbtoclass_mapping.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/")
    public List<Product> getProducts() {
        return productService.getProducts();
    }

    @PostMapping("/")
    public Product addProduct(@RequestBody Product product){
        return productService.addProduct(product);
    }
}
