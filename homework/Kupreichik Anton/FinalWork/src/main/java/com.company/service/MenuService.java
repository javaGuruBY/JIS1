package com.company.service;

import com.company.menuString.MenuString;
import com.company.repository.EmbeddedProductDataBase;

import java.math.BigDecimal;
import java.util.Locale;
import java.util.Scanner;

public class MenuService {

    static Scanner in = new Scanner(System.in).useLocale(Locale.ROOT);
    static EmbeddedProductDataBase embeddedProductDataBase = new EmbeddedProductDataBase();
    static ProductService productService = new ProductService();

    static Long id = -1l;
    static String name, description;
    static int number;
    static BigDecimal price = new BigDecimal(-1), discount = new BigDecimal(-1);

    public static int returnInt() {
        while (!in.hasNextInt()) {
            System.out.println(MenuString.THIS_NOT_A_NUMBER);
            in.next();
        }
        number = in.nextInt();
        return number;
    }

    public static BigDecimal returnPrice() {
        while (!in.hasNextBigDecimal()) {
            System.out.println(MenuString.THIS_NOT_A_NUMBER);
            in.next();
        }
        price = in.nextBigDecimal();
        while (!productService.validatePrice(price)) {
            while (!in.hasNextBigDecimal()) {
                System.out.println(MenuString.THIS_NOT_A_NUMBER);
                in.next();
            }
            price = in.nextBigDecimal();
        }
        return price;
    }

    public static BigDecimal returnDiscount() {
        while (!in.hasNextBigDecimal()) {
            System.out.println(MenuString.THIS_NOT_A_NUMBER);
            in.next();
        }
        discount = in.nextBigDecimal();
        while (!productService.validateDiscount(discount)) {
            while (!in.hasNextBigDecimal()) {
                System.out.println(MenuString.THIS_NOT_A_NUMBER);
                in.next();
            }
            discount = in.nextBigDecimal();
        }
        return discount;
    }

    public static Long returnId() {
        while (!in.hasNextLong()) {
            System.out.println(MenuString.THIS_NOT_A_NUMBER);
            in.next();
        }
        id = in.nextLong();
        while (!productService.validateId(id)) {
            while (!in.hasNextLong()) {
                System.out.println(MenuString.THIS_NOT_A_NUMBER);
                in.next();
            }
            id = in.nextLong();
        }
        return id;
    }

    public static String returnName() {
        name = in.nextLine();
        name = in.nextLine();
        return name;
    }

    public static String returnDescription() {
        description = in.nextLine();
        description = in.nextLine();
        return description;
    }

    public static void mainMenu() {
        while (true) {
            MenuString.Menu();
            switch (returnInt()) {
                case 1:
                    embeddedProductDataBase.enterProduct();
                    break;
                case 2:
                    embeddedProductDataBase.deleteProduct();
                    break;
                case 3:
                    embeddedProductDataBase.findProduct();
                    break;
                case 4:
                    embeddedProductDataBase.readProduct();
                    break;
                case 5:
                    embeddedProductDataBase.updateProduct();
                    break;
                case 6:
                    System.out.println(MenuString.CHOOSE_TYPE_OF_FILTRATION);
                    embeddedProductDataBase.filtration(returnInt());
                    break;
                case 8:
                    embeddedProductDataBase.findProductByCategory();
                    break;
                case 7:
                    embeddedProductDataBase.setDiscountToCategory();
                    break;
                case 9:
                    return;
                default:
                    System.out.println("Choose number between 1 and 7");
                    break;
            }
        }
    }
}
