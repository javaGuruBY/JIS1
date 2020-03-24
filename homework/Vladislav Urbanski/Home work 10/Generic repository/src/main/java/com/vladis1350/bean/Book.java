package com.vladis1350.bean;

import lombok.*;
import org.hibernate.annotations.NotFound;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
public class Book extends EntityBean implements Serializable {
    private Long id;
    private String name;
    private String author;
    private int pagesCount;
}
