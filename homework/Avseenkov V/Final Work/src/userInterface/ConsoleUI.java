package userInterface;

import service.ProductService;
import stat.Messages;

import java.util.ArrayList;
import java.util.List;

import static service.UserInput.*;
import static stat.MainMenu.*;
import static stat.Messages.ID_INPUT;
import static stat.Messages.INCORRECT_MENU_SELECT;

public class ConsoleUI {
    List<String> mainMenuList = new ArrayList<>();
    ProductService service = new ProductService();

    public void startConsoleUI() {
        setMainMenuList();
        mainMenu();
    }

    public void mainMenu() {
        System.out.println(Messages.MAIN_MENU);
        printMainMenuList();
        executeAfterUserSelect();
    }

    private void setMainMenuList() {
        mainMenuList.add(ITEM_0);
        mainMenuList.add(ITEM_1);
        mainMenuList.add(ITEM_2);
        mainMenuList.add(ITEM_3);
        mainMenuList.add(ITEM_4);
        mainMenuList.add(ITEM_5);
        mainMenuList.add(ITEM_6);
        mainMenuList.add(ITEM_7);

    }

    private void printMainMenuList() {
        int menuItemNumber = 0;
        for (String i : mainMenuList) {
            System.out.println(menuItemNumber + ". " + i);
            menuItemNumber++;
        }
    }

    private void executeAfterUserSelect() {
        switch (userInputInteger()) {
            case 1:
                service.setItem();
                returnToMainMenu();
                break;
            case 2:
                System.out.print(ID_INPUT);
                System.out.println(service.getProductById((long) userInputInteger()));
                returnToMainMenu();
                break;
            case 3:
                System.out.println("Всего продуктов в базе: " + service.getListOfProducts().size());
                service.getListOfProducts().forEach(System.out::println);
                returnToMainMenu();
                break;
            case 4:
                System.out.println(Messages.ID_INPUT);
                service.removeItemById((long) userInputInteger());
                returnToMainMenu();
                break;
            case 5:
                System.out.println(Messages.ID_INPUT);
                service.editItemPrice((long) userInputInteger(), userInputBigDecimalPrice());
                returnToMainMenu();
                break;
            case 6:
                System.out.println(ID_INPUT);
                service.setItemDiscount((long) userInputInteger(), userInputBigDecimalDiscount());
                returnToMainMenu();
                break;
            case 7:
                System.out.println(ID_INPUT);
                service.editItemDescription((long) userInputInteger(), userInputDescription());
                returnToMainMenu();
                break;
            case 0:
                break;
            default:
                System.err.println(INCORRECT_MENU_SELECT);
                returnToMainMenu();
                break;
        }
    }

    private void returnToMainMenu() {
        System.out.println("\n===================================================================");
        mainMenu();
    }
}
