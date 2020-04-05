package com.vladis1350.bean;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class Category {
    @Id
    @SequenceGenerator(name="category_id", initialValue=11, allocationSize=100)
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="category_id")
    private Long id;
    private String nameCategory;

    public Category() {
    }

    public Category(String productCategory) {
        this.nameCategory = productCategory;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Category category = (Category) o;
        return Objects.equals(id, category.id) &&
                Objects.equals(nameCategory, category.nameCategory);
    }

    @Override
    public String toString() {
        return "Category{" +
                "id=" + id +
                ", productCategory='" + nameCategory + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nameCategory);
    }

    public Long getId() {
        return id;
    }

    public String getNameCategory() {
        return nameCategory;
    }

    public void setNameCategory(String nameCategory) {
        this.nameCategory = nameCategory;
    }
}
