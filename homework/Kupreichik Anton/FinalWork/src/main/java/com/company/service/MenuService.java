package com.company.service;

import com.company.bean.Category;
import com.company.bean.Product;
import com.company.menuString.MenuString;

import java.math.BigDecimal;
import java.math.MathContext;
import java.util.Locale;
import java.util.Scanner;

public class MenuService {

    static Scanner in = new Scanner(System.in).useLocale(Locale.ROOT);
    static ProductService productService = new ProductService();
    static Product product[] = new Product[50];
    static int productCountInt = 0, secondChoose = 0, productNumber = 0, thirdChoose = 0, choose = 0;
    static Long productCountLong = 0l, id = -1l;
    static String name, description;
    static int number;
    static BigDecimal price = new BigDecimal(-1), discount = new BigDecimal(-1);
    static Category category = new Category();
    static MenuString menuString = new MenuString();


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

    public static void addProduct() {
        product[productCountInt] = new Product();
        System.out.println(MenuString.ENTER_NAME);
        product[productCountInt].setName(MenuService.returnName());
        System.out.println(MenuString.ENTER_PRICE);
        product[productCountInt].setPrice(MenuService.returnPrice());
        System.out.println(MenuString.ENTER_DISCOUNT);
        product[productCountInt].setDiscount(MenuService.returnDiscount());
        System.out.println(MenuString.ENTER_DESCRIPTION);
        product[productCountInt].setDescription(MenuService.returnDescription());
        product[productCountInt].addProduct(productCountLong, name);
        productCountInt++;
        productCountLong++;
        System.out.println(MenuString.PRODUCT_SUCCESSFULLY_ADDED);
    }

    public static void removeProduct() {
        System.out.println(MenuString.ENTER_ID);
        MenuService.returnId();
        product[0].removeProductById(id);
        System.out.println(MenuString.SUCCESSFULLY_DELETED);
    }

    public static void findProduct() {
        System.out.println(MenuString.ENTER_ID);
        int productNumberToReturnProduct = Math.toIntExact(MenuService.returnId());
        BigDecimal actualPrice;
        MathContext mc = new MathContext(2);
        BigDecimal discountAmount = new BigDecimal(String.valueOf(product[productNumberToReturnProduct].getPrice()
                .multiply(product[productNumberToReturnProduct].getDiscount(), mc)));
        actualPrice = new BigDecimal(String.valueOf(product[productNumberToReturnProduct].getPrice().subtract(discountAmount)));
        System.out.println("Name: " + product[productNumberToReturnProduct].getName());
        System.out.println("Price: " + product[productNumberToReturnProduct].getPrice());
        System.out.println("Discount: " + product[productNumberToReturnProduct].getDiscount());
        System.out.println("Description: " + product[productNumberToReturnProduct].getDescription());
        System.out.println("Actual price: " + actualPrice + "\n");
    }

    public static void displayAllProducts() {
        product[0].gettingListOfAllProducts();
    }

    public static void changeProduct() {
        System.out.println(MenuString.ENTER_ID);
        MenuService.returnId();
        productNumber = Math.toIntExact(id);
        while (secondChoose != 5) {
            System.out.println(MenuString.CHOOSE_TYPE_CHANGE + "\n" + "5.Exit\n");
            switch (MenuService.returnInt()) {
                case 1:
                    changeName();
                    break;
                case 2:
                    changePrice();
                    break;
                case 3:
                    changeDiscount();
                    break;
                case 4:
                    changeDescription();
                    break;
                case 5:
                    secondChoose = 5;
                    break;
            }
        }
    }

    public static void changeName() {
        System.out.println(MenuString.ENTER_NAME);
        product[productNumber].setName(MenuService.returnName());
        System.out.println(MenuString.SUCCESSFULLY_CHANGES);
    }

    public static void changePrice() {
        System.out.println(MenuString.ENTER_PRICE);
        product[productNumber].setPrice(MenuService.returnPrice());
        System.out.println(MenuString.SUCCESSFULLY_CHANGES);

    }

    public static void changeDiscount() {
        System.out.println(MenuString.ENTER_DISCOUNT);
        product[productNumber].setPrice(MenuService.returnDiscount());
        System.out.println(MenuString.SUCCESSFULLY_CHANGES);

    }

    public static void changeDescription() {
        System.out.println(MenuString.ENTER_DESCRIPTION);
        product[productNumber].setDescription(MenuService.returnDescription());
        System.out.println(MenuString.SUCCESSFULLY_CHANGES);
    }

    public static boolean productAvailability() {
        return product[0].checkProduct(MenuService.returnName());
    }

    public static void addProductToCategory() {
        System.out.println(MenuString.ENTER_NAME);
        if (MenuService.productAvailability()) {
            System.out.println(MenuString.ENTER_CATEGORY);
            System.out.println(MenuString.CHOOSE_CATEGORY_LIST);
            MenuService.returnInt();
            category.addProduct(name, category.chooseCategory(number));
            System.out.println(MenuString.SUCCESSFULLY_CHANGES);
        } else System.out.println(MenuString.NO_SUCH_PRODUCT);
    }

    public static void removeProductFromCategory() {
        if (MenuService.productAvailability()) {
            MenuService.returnName();
            category.removeProduct(name);
            System.out.println(MenuString.SUCCESSFULLY_CHANGES);
        } else System.out.println(MenuString.NO_SUCH_PRODUCT);
    }

    public static void deleteCategory() {
        System.out.println(MenuString.ENTER_CATEGORY);
        System.out.println(MenuString.CHOOSE_CATEGORY_LIST);
        returnInt();
        category.deleteCategory(category.chooseCategory(number));
    }

    public static void showCategory() {
        category.showCategory();
    }

    public static void showAllProductFromCategory() {
        category.showAllProduct();
    }

    public static void categoryMenu() {
        while (thirdChoose != 6) {
            MenuString.categoryMenu();
            switch (MenuService.returnInt()) {
                case 1:
                    MenuService.addProductToCategory();
                    break;
                case 2:
                    MenuService.removeProductFromCategory();
                    break;
                case 3:
                    MenuService.deleteCategory();
                    break;
                case 4:
                    MenuService.showCategory();
                    break;
                case 5:
                    MenuService.showAllProductFromCategory();
                    break;
                case 6:
                    thirdChoose = 6;
                    break;
                default:
                    break;
            }
        }
    }

    public static void productFiltration() {
        System.out.println(MenuString.CHOOSE_TYPE_OF_FILTRATION);
        product[0].filtration(MenuService.returnInt());
    }

    public static void mainMenu() {
        while (choose != 8) {
            menuString.Menu();
            switch (MenuService.returnInt()) {
                case 1:
                    MenuService.addProduct();
                    break;
                case 2:
                    MenuService.removeProduct();
                    break;
                case 3:
                    MenuService.findProduct();
                    break;
                case 4:
                    MenuService.displayAllProducts();
                    break;
                case 5:
                    MenuService.changeProduct();
                    break;
                case 6:
                    MenuService.categoryMenu();
                    break;
                case 7:
                    MenuService.productFiltration();
                    break;
                case 8:
                    choose = 8;
                    break;
                default:
                    System.out.println("Choose number between 1 and 8");
                    break;
            }
        }
    }
}
