package service;

import bean.Product;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class Shop {

    Map<String, BigDecimal> shopMap = new HashMap<>();

    public void addProduct(Product product) {
        shopMap.put(product.getName(), product.getPrice());
    }

    public void removeProduct(String name) {
        shopMap.remove(name);
    }

    public void findProduct(String name) {
        if (shopMap.containsKey(name)) {
            System.out.println(name + " " + shopMap.get(name));
        } else {
            System.out.println("Такого продукта тут нет. Всё разобрали");
        }


    }

    @Override
    public String toString() {
        return "Shop " +
                "shopMap = " + shopMap;
    }

    public void findProductByPrice(BigDecimal minPrice, BigDecimal maxPrice) {
        shopMap.values().stream()
                .filter(item -> (item.compareTo(minPrice) == 1) && (item.compareTo(maxPrice) == -1))
                .forEach(System.out::println);
    }
}
