package HomeWork2.Ex5_PowerCalculator;

import java.util.Scanner;

public class PowerCalculatorDemo {
    public static void main(String[] args) throws Exception {
        PowerCalculator calc = new PowerCalculator();
        PowerCalculatorTest test = new PowerCalculatorTest();

        System.out.println("Result is " + calc.powerCalculator(5, 3));
        System.out.println("Result is " + calc.powerCalculator(7, 2));
        System.out.println("Result is " + calc.powerCalculator(3,5));

        test.runner();
    }
}
