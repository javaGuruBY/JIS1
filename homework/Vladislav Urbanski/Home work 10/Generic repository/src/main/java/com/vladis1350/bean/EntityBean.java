package com.vladis1350.bean;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
@Getter
@Setter
@EqualsAndHashCode
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class EntityBean {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String author;
    private int pagesCount;
}
