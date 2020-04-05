package com.vladis1350.validate;

import com.vladis1350.bean.Product;

import java.math.BigDecimal;

public class ProductValidator {

    public static boolean validateName(String name) {
        if (name.length() < 3 || name.length() > 55) {
            return false;
        }
        return true;
    }

    public static boolean validatePrice(BigDecimal price) {
        if (price.compareTo(new BigDecimal(0)) <= 0) {
            return false;
        }
        return true;
    }

    public static boolean validateDiscount(BigDecimal discount) {
        if (discount.compareTo(new BigDecimal(0)) == -1 || discount.compareTo(new BigDecimal(100)) >= 0) {
            return false;
        }
        return true;
    }

    public static boolean checkValidateDataProduct(Product product) {
        return validateName(product.getName()) &&
                validatePrice(product.getPrice()) &&
                validateDiscount(product.getDiscount());
    }
}
