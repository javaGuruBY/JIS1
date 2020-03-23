package com.vladis1350.factory;

import com.vladis1350.bean.Product;
import com.vladis1350.types.ProductTypes;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static java.math.BigDecimal.ROUND_CEILING;

public class ProductFactory {

    private static BigDecimal getRandomPriceProduct() {
        double randomPrice = Math.random() * 15;
        return new BigDecimal(randomPrice).setScale(3, ROUND_CEILING);
    }

    public static List<Product> createListProducts(int count) {
        List<Product> productList = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            productList.add(getRandomProduct());
        }
        return productList;
    }

    public static Product getRandomProduct() {
        Random random = new Random();
        ProductTypes type = ProductTypes.values()[random.nextInt(ProductTypes.values().length)];
        return new Product(type.name(), getRandomPriceProduct());
    }

}
