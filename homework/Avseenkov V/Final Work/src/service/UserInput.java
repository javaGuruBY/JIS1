package service;

import bean.Category;

import java.math.BigDecimal;
import java.util.Scanner;

public class UserInput {
    static Scanner input;

    static int userInputInteger() {
        input = new Scanner(System.in);
        return input.nextInt();
    }

    static String userInputName() {
        System.out.print("Введите имя продукта: ");
        input = new Scanner(System.in);
        return input.nextLine();
    }

    static BigDecimal userInputBigDecimalPrice() {
        System.out.print("Введите цену продукта: ");
        input = new Scanner(System.in);
        return input.nextBigDecimal();
    }

    static Enum userInputEnum() {
        System.out.print("Введите категорию продукта: ");
       return Category.OTHER; //TODO допилить работу с вводом категории
    }
}
