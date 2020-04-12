package com.vladis1350.repositories;

import com.vladis1350.bean.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository extends CrudRepository<Category, Long> {
}
