package com.vladis1350.services;

import com.vladis1350.bean.Product;
import com.vladis1350.enumCategory.Category;
import com.vladis1350.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository repository;

    public Iterable<Product> findAll() {
        return repository.findAll();
    }

    public void save(Product product) {
        repository.save(product);
    }

    public Product getById(Long id) {
        return repository.findById(id).get();
    }

    public void deleteById(Long id) {
        repository.deleteById(id);
    }

    public List<Product> findAllByCategory(Category category) {
        Iterable<Product> products = repository.findAll();
        List<Product> resultFilter = new ArrayList<>();
        for (Product product: products) {
            if (product.getCategory().equals(category)) {
                resultFilter.add(product);
            }
        }
        return resultFilter;
    }

    public void setDiscountForCategory(Category category, BigDecimal discount) {
        Iterable<Product> products = repository.findAll();
        List<Product> resultList = new ArrayList<>();

        for (Product product: products) {
            if (product.getCategory().equals(category)) {
                product.setDiscount(discount);
                resultList.add(product);
            }
        }
        repository.saveAll(resultList);
    }
}
