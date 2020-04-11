package service;

import bean.Category;

import java.math.BigDecimal;
import java.util.Scanner;

public class UserInput {

    static int userInputInteger() {
        Scanner input;
        input = new Scanner(System.in);
        return input.nextInt();
    }

    static String userInputString() {
        Scanner input;
        input = new Scanner(System.in);
        return input.next();
    }

    static BigDecimal userInputBigDecimal() {
        Scanner input;
        input = new Scanner(System.in);
        return input.nextBigDecimal();
    }

    static Enum userInputEnum() {
       return Category.OTHER; //TODO допилить работу с вводом категории
    }
}
