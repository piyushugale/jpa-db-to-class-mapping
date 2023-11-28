package com.piyush.jpa_dbtoclass_mapping.repo;

import com.piyush.jpa_dbtoclass_mapping.model.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Integer> {
}
