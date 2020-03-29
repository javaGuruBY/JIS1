package service;

import bean.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static stat.MainMenu.*;
import static stat.Messages.*;

/**
 * Тут  есть чего ещё сделать
 * Смотри комментарии
 * По завершению - удали
 */

public class ConsoleUI {
    List<String> mainMenuList = new ArrayList<>();
    ProductService service;

    public void mainMenu() {
        System.out.println("Главное меню");
        setMainMenuList();
        printMainMenuList();
        toDoAfterUserSelect();
    }

    private void setMainMenuList() {
        mainMenuList.add(ITEM_1);
        mainMenuList.add(ITEM_2);
        mainMenuList.add(ITEM_3);
        mainMenuList.add(ITEM_4);
    }

    private void printMainMenuList() {
        for (String i : mainMenuList) {
            System.out.println(i);
        }
    }

    private int userSelect() {
        Scanner input;
        input = new Scanner(System.in);
        return input.nextInt();
    }

    private void toDoAfterUserSelect() {
        switch (userSelect()) {
            case 1:
                service.setItem(new Product()); //ТУДУ добавить ввод пользователем продукта
                break;
            case 2:
                System.out.println(ID_INPUT);
                service.getProductById((long) userSelect());
                break;
            case 3:
                for (Product product : service.getListOfProducts()) {
                    System.out.println(product);
                }
                break;
            case 4:
                System.out.println(ID_INPUT);
                service.removeItemById((long) userSelect());
                break;
            default:
                System.out.println(INCORRECT_MENU_SELECT);
                mainMenu();
        }
    }
}
