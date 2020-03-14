package com.vladis1350.bean;

import java.math.BigDecimal;
import java.util.LinkedList;
import java.util.List;

import static java.math.BigDecimal.ROUND_CEILING;

public class Shop {
    private List<Product> productList = new LinkedList<Product>();

    public Shop() {
        productList.add(new Product("Milk", new BigDecimal(1.2).setScale(3, ROUND_CEILING)));
        productList.add(new Product("Chips", new BigDecimal(9.4).setScale(3, ROUND_CEILING)));
        productList.add(new Product("Potatoes", new BigDecimal(6.2).setScale(3, ROUND_CEILING)));
        productList.add(new Product("Fat", new BigDecimal(11.12).setScale(3, ROUND_CEILING)));
        productList.add(new Product("Bred", new BigDecimal(17.62).setScale(3, ROUND_CEILING)));
    }

    public void addProduct(Product product) {
        productList.add(product);
    }

    public void removeProduct(String name) {
        for (Product product : productList) {
            if (product.getName().equals(name)) {
                productList.remove(product);
            }
        }
    }

    public Product findProductByName(String name) {
        for (Product p : productList) {
            if (p.getName().equals(name)) {
                return p;
            }
        }
        return null;
    }

    public List<Product> findAllProductsInPriceRange(BigDecimal minPriceRange, BigDecimal maxPriceRange) {
        List<Product> searchResult = new LinkedList<>();
        Double minPrice = Double.parseDouble(String.valueOf(minPriceRange));
        Double maxPrice = Double.parseDouble(String.valueOf(maxPriceRange));
        for (Product p : productList) {
            double price = Double.parseDouble(String.valueOf(p.getPrice()));
            if (price > minPrice && price < maxPrice) {
                searchResult.add(p);
            }
        }
        return searchResult;
    }

    public List<Product> getProductList() {
        return productList;
    }
}
