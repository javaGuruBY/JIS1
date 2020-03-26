package com.company.bean;

import com.company.enums.Category;
import lombok.*;
import javax.persistence.Entity;
import java.io.Serializable;
import java.math.BigDecimal;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class Product implements Serializable {
    private String name;
    private long id;
    private BigDecimal price;
    private BigDecimal discount;
    private String description;
    private Category.CategoryList categoryList;
    
}
