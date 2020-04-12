package com.vladis1350.repositories;

import com.vladis1350.bean.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Long> {
}
