package service;

import bean.Category;
import stat.Messages;

import java.math.BigDecimal;
import java.util.Scanner;

public class UserInput {
    static Scanner scanner;

    public static int userInputInteger() {
        scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    static String userInputName() {
        System.out.print(Messages.INPUT_NAME);
        scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public static BigDecimal userInputBigDecimalPrice() {
        System.out.print(Messages.INCORRECT_PRICE);
        scanner = new Scanner(System.in);
        return scanner.nextBigDecimal();
    }

    public static BigDecimal userInputBigDecimalDiscount() {
        System.out.print(Messages.INPUT_DISCOUNT);
        scanner = new Scanner(System.in);
        return scanner.nextBigDecimal();
    }

    static Enum userInputEnum() {
        System.out.print(Messages.INPUT_CATEGORY);
       return Category.OTHER; //TODO допилить работу с вводом категории
    }

    public static String userInputDescription() {
        System.out.println(Messages.INPUT_DESCRIPTION);
        scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}
