package com.vladis1350.enumCategory;

public enum Category {
    FRUIT("Fruit"),
    VEGETABLES("Vegetables"),
    SPORTS_AND_RECREATION("Sport and recreation"),
    GOODS_FOR_CAR("Goods for car"),
    PRODUCTS_FOR_CHILDREN("Products for children");

    private final String roleCode;

    Category(String roleCode) {
        this.roleCode = roleCode;
    }

    public String getRoleCode() {
        return roleCode;
    }
}
