package com.piyush.jpa_dbtoclass_mapping.service;

import com.piyush.jpa_dbtoclass_mapping.model.Product;
import com.piyush.jpa_dbtoclass_mapping.repo.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    public List<Product> getProducts() {
        List<Product> products = new ArrayList<>();
        productRepository.findAll().forEach(products::add);

        return products;
    }

    public Product addProduct(Product product) {
        return productRepository.save(product);
    }
}
