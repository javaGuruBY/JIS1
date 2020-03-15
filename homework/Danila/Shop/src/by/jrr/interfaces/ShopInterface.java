package by.jrr.interfaces;


import by.jrr.bean.Product;

import java.math.BigDecimal;

public interface ShopInterface {
    void setProduct(Product newProduct);
    void deleteProduct(Product name);
    Product findProductByName(String name);
    void findProduct(BigDecimal minPriceRange, BigDecimal maxPriceRange);
}
