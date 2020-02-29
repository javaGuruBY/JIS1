package Vladimir_Avseenkov.HomeWork0.ex1_SignComporator;

import java.util.Scanner;

public class SignComporatorDemo {
    public static void main(String[] args) throws Exception {
        SignComporator signComporator = new SignComporator();
        Scanner input = new Scanner(System.in);
        System.out.print("Введите число: ");
        int number = input.nextInt();
        System.out.println(signComporator.compare(number));
        SignComporatorTest test = new SignComporatorTest();
        test.runTests();
    }
}
