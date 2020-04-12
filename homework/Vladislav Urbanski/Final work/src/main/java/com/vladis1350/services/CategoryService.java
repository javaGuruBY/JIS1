package com.vladis1350.services;

import com.vladis1350.bean.Category;
import com.vladis1350.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    public Iterable<Category> findAll() {
        return categoryRepository.findAll();
    }

    public void save(Category category) {
        categoryRepository.save(category);
    }

    public Category getById(Long id) {
        return categoryRepository.findById(id).get();
    }

    public void deleteById(Long id) {
        categoryRepository.deleteById(id);
    }
}
