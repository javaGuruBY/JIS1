package com.vladis1350.bean;

import lombok.EqualsAndHashCode;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;

@Entity
@EqualsAndHashCode
@ToString
public class Product implements Serializable {
    @Id
    @SequenceGenerator(name="product_id", initialValue=7, allocationSize=100)
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="product_id")
    private long id;
    private String name;
    private BigDecimal price;
    private String category;
    private BigDecimal discount;
    private String description;

    public Product() {
    }

    public Product(String name, BigDecimal price, String category, BigDecimal discount) {
        this.name = name;
        this.price = price;
        this.category = category;
        this.discount = discount;
    }

    public Product(Long id, String name, BigDecimal price, String category, BigDecimal discount) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.category = category;
        this.discount = discount;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public BigDecimal getDiscount() {
        return discount;
    }

    public void setDiscount(BigDecimal discount) {
        this.discount = discount;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


}
