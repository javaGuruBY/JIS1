package com.company.service;

import com.company.interfaces.MapInterface;
import lombok.*;

import javax.persistence.Entity;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;


@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class Product implements Serializable, MapInterface {
    private String name;
    private static long id;
    private BigDecimal price;
    private BigDecimal discount;
    private String description;

    static Map<Long, String> productMap = new HashMap<>();

    public void addProduct(Long id, String name) {
        productMap.put(id, name);
    }

    public void gettingProductById(Long id) {
        System.out.println(productMap.get(id));
    }

    public void filtration(int typeOfFiltration) {
        switch (typeOfFiltration) {
            case 1:
                System.out.println("Id|Name");
                productMap.entrySet().stream()
                        .sorted(Map.Entry.<Long, String>comparingByKey())
                        .forEach(System.out::println);
                break;

            case 2:
                System.out.println("Id|Name");
                productMap.entrySet().stream()
                        .sorted(Map.Entry.<Long, String>comparingByValue())
                        .forEach(System.out::println);
                break;
            case 3:
                System.out.println("Id|Name");
                productMap.entrySet().stream()
                        .sorted(Map.Entry.<Long, String>comparingByKey().reversed())
                        .forEach(System.out::println);
                break;
            case 4:
                System.out.println("Id|Name");
                productMap.entrySet().stream()
                        .sorted(Map.Entry.<Long, String>comparingByValue().reversed())
                        .forEach(System.out::println);
                break;
            default:
                System.out.println("Choose number between 1-4");
                break;
        }
    }

    @Override
    public int getMapSize() {
        return productMap.size();
    }

    public static long getId() {
        return id;
    }

    public boolean checkProduct(String name) {
        return productMap.containsValue(name);
    }

    public void replaceProduct(Long id, String name) {
        productMap.replace(id, name);
    }

    public void removeProductById(Long Id) {
        productMap.remove(Id);
    }

    public void gettingListOfAllProducts() {
        System.out.println("Products:" + productMap.values());
    }


}
