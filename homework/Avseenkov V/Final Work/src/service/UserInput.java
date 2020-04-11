package service;

import bean.Category;
import stat.Messages;

import java.math.BigDecimal;
import java.util.Scanner;

public class UserInput {
    static Scanner scanner;

    static int userInputInteger() {
        scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    static String userInputName() {
        System.out.print("Введите имя продукта: ");
        scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    static BigDecimal userInputBigDecimalPrice() {
        System.out.print("Введите цену продукта: ");
        scanner = new Scanner(System.in);
        return scanner.nextBigDecimal();
    }

    static BigDecimal userInputBigDecimalDiscount() {
        System.out.print("Введите скидку на продукт: ");
        scanner = new Scanner(System.in);
        return scanner.nextBigDecimal();
    }

    static Enum userInputEnum() {
        System.out.print("Введите категорию продукта: ");
       return Category.OTHER; //TODO допилить работу с вводом категории
    }
}
