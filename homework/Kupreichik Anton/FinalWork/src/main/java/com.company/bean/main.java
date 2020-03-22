package com.company.bean;

import com.company.menuString.MenuString;
import com.company.service.Category;
import com.company.service.Product;
import com.company.service.ProductService;

import java.math.BigDecimal;
import java.math.MathContext;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MenuString menuString = new MenuString();
        int choose = 0, productCountInt = 0, categoryInt = 0, filterType = 0;
        Long productCountLong = 0l, id = -1l;
        String name = null, description;
        BigDecimal price = new BigDecimal(0), discount = new BigDecimal(-1);
        Product product[] = new Product[50];
        ProductService productService = new ProductService();
        Scanner in = new Scanner(System.in).useLocale(Locale.ROOT);
        while (choose != 8) {
           menuString.Menu();
            while (!in.hasNextInt()) {
                System.out.println(MenuString.THIS_NOT_A_NUMBER);
                in.next();
            }
            choose = in.nextInt();
            switch (choose) {
                case 1:
                    product[productCountInt] = new Product();
                    System.out.println(MenuString.ENTER_NAME);
                    name = in.nextLine();
                    name = in.nextLine();
                    product[productCountInt].setName(name);
                    System.out.println(MenuString.ENTER_PRICE);
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
                    product[productCountInt].setPrice(price);
                    System.out.println(MenuString.ENTER_DISCOUNT);
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
                    product[productCountInt].setDiscount(discount);
                    System.out.println(MenuString.ENTER_DESCRIPTION);
                    description = in.nextLine();
                    description = in.nextLine();
                    product[productCountInt].setDescription(description);
                    product[productCountInt].addProduct(productCountLong, name);
                    productCountInt++;
                    productCountLong++;
                    System.out.println(MenuString.PRODUCT_SUCCESSFULLY_ADDED);
                    break;
                case 2:
                    System.out.println(MenuString.ENTER_ID);
                    while (!in.hasNextLong()) {
                        System.out.println(MenuString.THIS_NOT_A_NUMBER);
                        in.next();
                    }
                    id = in.nextLong();
                    while (!productService.validateId(id)) {
                        while (!in.hasNextBigDecimal()) {
                            System.out.println(MenuString.THIS_NOT_A_NUMBER);
                            in.next();
                        }
                        id = in.nextLong();
                    }
                    System.out.print(MenuString.YOU_PRODUCT);
                    product[0].gettingProductById(id);
                    product[0].removeProductById(id);
                    System.out.println(MenuString.SUCCESSFULLY_DELETED);
                    break;
                case 3:
                    System.out.println(MenuString.ENTER_ID);
                    while (!in.hasNextLong()) {
                        System.out.println(MenuString.THIS_NOT_A_NUMBER);
                        in.next();
                    }
                    id = in.nextLong();
                    while (!productService.validateId(id)) {
                        while (!in.hasNextBigDecimal()) {
                            System.out.println(MenuString.THIS_NOT_A_NUMBER);
                            in.next();
                        }
                        id = in.nextLong();
                    }
                    int productNumberToReturnProduct = Math.toIntExact(id);
                    System.out.print(MenuString.YOU_PRODUCT);
                    product[0].gettingProductById(id);
                    BigDecimal actualPrice;
                    MathContext mc = new MathContext(2);
                    BigDecimal discountAmount = new BigDecimal(String.valueOf(product[productNumberToReturnProduct].getPrice()
                            .multiply(product[productNumberToReturnProduct].getDiscount(), mc)));
                    actualPrice = new BigDecimal(String.valueOf(product[productNumberToReturnProduct].getPrice().subtract(discountAmount)));
                    System.out.println("Name: " + product[productNumberToReturnProduct].getName());
                    System.out.println("Price: " + product[productNumberToReturnProduct].getPrice());
                    System.out.println("Discount: " + product[productNumberToReturnProduct].getDiscount());
                    System.out.println("Description: " + product[productNumberToReturnProduct].getDescription());
                    System.out.println("Actual price: " + actualPrice);
                    break;
                case 4:
                    product[0].gettingListOfAllProducts();
                    break;
                case 5:
                    int secondChoose = 0;
                    System.out.println(MenuString.ENTER_ID);
                    while (!in.hasNextLong()) {
                        System.out.println(MenuString.THIS_NOT_A_NUMBER);
                        in.next();
                    }
                    id = in.nextLong();
                    while (!productService.validateId(id)) {
                        while (!in.hasNextBigDecimal()) {
                            System.out.println(MenuString.THIS_NOT_A_NUMBER);
                            in.next();
                        }
                        id = in.nextLong();
                    }
                    product[0].gettingProductById(id);
                    int productNumber = Math.toIntExact(id);
                    while (secondChoose != 5) {
                        System.out.println(MenuString.CHOOSE_TYPE_CHANGE);
                        while (!in.hasNextInt()) {
                            System.out.println(MenuString.THIS_NOT_A_NUMBER);
                            in.next();
                        }
                        secondChoose = in.nextInt();
                        switch (secondChoose) {
                            case 1:
                                System.out.println(MenuString.ENTER_NAME);
                                name = in.nextLine();
                                name = in.nextLine();
                                product[productNumber].setName(name);
                                System.out.println(MenuString.SUCCESSFULLY_CHANGES);
                                product[0].replaceProduct(id, name);
                                break;
                            case 2:
                                System.out.println(MenuString.ENTER_PRICE);
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
                                price = in.nextBigDecimal();
                                product[productNumber].setPrice(price);
                                System.out.println(MenuString.SUCCESSFULLY_CHANGES);
                                break;
                            case 3:
                                System.out.println(MenuString.ENTER_DISCOUNT);

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

                                product[productNumber].setPrice(discount);
                                System.out.println(MenuString.SUCCESSFULLY_CHANGES);
                                break;
                            case 4:
                                System.out.println(MenuString.ENTER_DESCRIPTION);
                                description = in.nextLine();
                                description = in.nextLine();
                                product[productNumber].setDescription(description);
                                System.out.println(MenuString.SUCCESSFULLY_CHANGES);
                                break;
                            case 5:
                                secondChoose = 5;
                                break;
                        }
                    }
                    break;
                case 6:
                    Category category = new Category();
                    int thirdChoose = 0;
                    while (thirdChoose != 7) {
                        System.out.println(MenuString.ADD_PRODUCT_TO_CATEGORY);
                        System.out.println(MenuString.REMOVE_PRODUCT_FROM_CATEGORY);
                        System.out.println(MenuString.DELETE_CATEGORY);
                        System.out.println(MenuString.SHOW_CATEGORY);
                        System.out.println(MenuString.RETURN_ALL_PRODUCTS_FROM_CATEGORY);
                        System.out.println(MenuString.ADD_DISCOUNT_FOR_ALL_PRODUCTS_IN_CATEGORY);
                        System.out.println(MenuString.EXIT_CATEGORY);
                        while (!in.hasNextInt()) {
                            System.out.println(MenuString.THIS_NOT_A_NUMBER);
                            in.next();
                        }
                        thirdChoose = in.nextInt();
                        switch (thirdChoose) {
                            case 1:
                                System.out.println(MenuString.ENTER_NAME);
                                name = in.nextLine();
                                name = in.nextLine();
                                if (!product[0].checkProduct(name)) {
                                    System.out.println(MenuString.NO_SUCH_PRODUCT);
                                    break;
                                }
                                System.out.println(MenuString.ENTER_CATEGORY);
                                System.out.println(MenuString.CHOOSE_CATEGORY_LIST);
                                while (!in.hasNextInt()) {
                                    System.out.println(MenuString.THIS_NOT_A_NUMBER);
                                    in.next();
                                }
                                categoryInt = in.nextInt();
                                category.addProduct(name, category.chooseCategory(categoryInt));
                                System.out.println(MenuString.SUCCESSFULLY_CHANGES);
                                break;
                            case 2:
                                System.out.println(MenuString.ENTER_NAME);
                                name = in.nextLine();
                                name = in.nextLine();
                                if (!product[0].checkProduct(name)) {
                                    System.out.println(MenuString.NO_SUCH_PRODUCT);
                                    break;
                                }
                                category.removeProduct(name);
                                System.out.println(MenuString.SUCCESSFULLY_CHANGES);
                                break;
                            case 3:
                                System.out.println(MenuString.ENTER_CATEGORY);
                                System.out.println(MenuString.CHOOSE_CATEGORY_LIST);
                                while (!in.hasNextInt()) {
                                    System.out.println(MenuString.THIS_NOT_A_NUMBER);
                                    in.next();
                                }
                                categoryInt = in.nextInt();
                                category.deleteCategory(category.chooseCategory(categoryInt));
                                break;
                            case 4:
                                category.showCategory();
                                break;
                            case 5:
                                category.showAllProduct();
                                break;
                            case 6:
                                System.out.println(MenuString.ENTER_CATEGORY);
                                System.out.println(MenuString.CHOOSE_CATEGORY_LIST);
                                while (!in.hasNextInt()) {
                                    System.out.println(MenuString.THIS_NOT_A_NUMBER);
                                    in.next();
                                }
                                categoryInt = in.nextInt();
                                //category.setDiscountForCategory(category.chooseCategory(categoryInt));
                                break;
                            case 7:
                                thirdChoose = 7;
                                break;
                            default:
                                break;
                        }
                    }
                    break;
                case 7:
                    System.out.println(MenuString.CHOOSE_TYPE_OF_FILTRATION);
                    while (!in.hasNextInt()) {
                        System.out.println(MenuString.THIS_NOT_A_NUMBER);
                        in.next();
                    }
                    filterType = in.nextInt();
                    product[0].filtration(filterType);
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

