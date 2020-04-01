package com.vladis1350.bean;

import com.vladis1350.factory.ProductFactory;
import com.vladis1350.types.ProductTypes;

import java.math.BigDecimal;
import java.util.LinkedList;
import java.util.List;

public class Shop {
    private List<Product> productList = ProductFactory.createListProducts(50);

    public Shop() {
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
