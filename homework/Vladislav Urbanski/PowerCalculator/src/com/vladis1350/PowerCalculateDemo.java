package com.vladis1350;

import com.vladis1350.service.PowerCalculator;

public class PowerCalculateDemo {
    public static void main(String[] args) {
        PowerCalculator powerCalculator = new PowerCalculator();
        int result = powerCalculator.exponentiation(17, 4);
        System.out.println(result);
    }
}
