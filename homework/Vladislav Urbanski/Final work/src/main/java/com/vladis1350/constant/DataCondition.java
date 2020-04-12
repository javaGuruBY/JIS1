package com.vladis1350.constant;

import java.math.BigDecimal;

public class DataCondition {
    public static final int MIN_LENGTH_NAME = 3;
    public static final int MAX_LENGTH_NAME = 55;

    public static final BigDecimal MIN_PRICE = new BigDecimal(0.1);
    public static final BigDecimal MIN_DISCOUNT = new BigDecimal(0);
    public static final BigDecimal MAX_DISCOUNT = new BigDecimal(100);
}
