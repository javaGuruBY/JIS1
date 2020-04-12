package com.vladis1350.validate;

import com.vladis1350.bean.Product;
import com.vladis1350.constant.DataCondition;

import java.math.BigDecimal;

public class ProductValidator {

    private ProductValidator(){}

    public static boolean validateName(String name) {
        return (name.length() >= DataCondition.MIN_LENGTH_NAME ||
                name.length() <= DataCondition.MAX_LENGTH_NAME);
    }

    public static boolean validatePrice(BigDecimal price) {
        return (price.compareTo(DataCondition.MIN_PRICE) > 0);
    }

    public static boolean validateDiscount(BigDecimal discount) {
        return (discount.compareTo(DataCondition.MIN_DISCOUNT) >= 0 ||
                discount.compareTo(DataCondition.MAX_DISCOUNT) <= 0);
    }

    public static boolean checkValidateDataProduct(Product product) {
        return validateName(product.getName()) &&
                validatePrice(product.getPrice()) &&
                validateDiscount(product.getDiscount());
    }
}
