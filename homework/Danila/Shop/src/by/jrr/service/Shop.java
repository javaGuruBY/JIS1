package by.jrr.service;


import by.jrr.bean.Product;
import by.jrr.interfaces.ShopInterface;

import java.math.BigDecimal;
import java.util.LinkedList;
import java.util.List;

public class Shop implements ShopInterface {

    public List<Product> product = new LinkedList<>();

    public Shop() {
    }

    @Override
    public void setProduct(Product newProduct) {
        product.add(newProduct);
    }

    @Override
    public void deleteProduct(Product name) {
        product.remove(name);
    }

    @Override
    public Product findProductByName(String name) {
        for (Product entry: product) {
            if(entry.getNameProduct().equals(name)) {
                return entry;
            }
        }
        return null;
    }

    @Override
    public void findProduct(BigDecimal minPriceRange, BigDecimal maxPriceRange) {
        for (Product entry: product) {
            if(entry.getBigDecimal().compareTo(minPriceRange) >= 0 && entry.getBigDecimal().compareTo(maxPriceRange) <= 0) {
                System.out.println(entry.toString());
            }
        }
    }
}
