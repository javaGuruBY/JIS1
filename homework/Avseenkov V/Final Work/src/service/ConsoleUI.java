package service;

import bean.Product;

import java.util.ArrayList;
import java.util.List;

import static service.UserInput.*;
import static stat.MainMenu.*;
import static stat.Messages.ID_INPUT;
import static stat.Messages.INCORRECT_MENU_SELECT;

/**
 * Тут  есть чего ещё сделать
 * Смотри комментарии
 * По завершению - удали
 */

public class ConsoleUI {
    List<String> mainMenuList = new ArrayList<>();
    ProductService service = new ProductService();

    public void startConsoleUI() {
        setMainMenuList();
        mainMenu();
    }

    public void mainMenu() {
        System.out.println("Главное меню");
        printMainMenuList();
        executeAfterUserSelect();
    }

    private void setMainMenuList() {
        mainMenuList.add(ITEM_1);
        mainMenuList.add(ITEM_2);
        mainMenuList.add(ITEM_3);
        mainMenuList.add(ITEM_4);
        mainMenuList.add(ITEM_0);
    }

    private void printMainMenuList() {
        for (String i : mainMenuList) {
            System.out.println(i);
        }
    }

    private void executeAfterUserSelect() {
        switch (userInputInteger()) {
            case 1:
                service.setItem();
                returnToMainMenu();
                break;
            case 2:
                System.out.println(ID_INPUT);
                service.getProductById((long) userInputInteger());
                returnToMainMenu();
                break;
            case 3:
                System.out.println("Всего продуктов в базе: " + service.getListOfProducts().size());
                service.getListOfProducts().forEach(System.out::println);
                returnToMainMenu();

                break;
            case 4:
                System.out.println(ID_INPUT);
                service.removeItemById((long) userInputInteger());
                break;
            case 0:
                break;
            default:
                System.err.println(INCORRECT_MENU_SELECT);
                returnToMainMenu();
        }
    }

    private void returnToMainMenu() {
        System.out.println("\n===================================================================");
        mainMenu();
    }
}
