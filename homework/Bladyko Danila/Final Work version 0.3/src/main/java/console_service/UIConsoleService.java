package console_service;

import console.ProductSection;
import console.UIConsole;
import database.Shop;
import input.Input;
import stat.UIConsoleString;

public class UIConsoleService {
    public static void uiConsoleService(byte number) {
        switch (number) {
            case 1 :
                System.out.println(Shop.productService.getListProducts());
                UIConsole.mainMenu();
                break;
            case 2 :
                System.out.println(UIConsoleString.ENTER_ENUM);
                System.out.println(Shop.productService.getListByEnumProducts(Input.inString.nextLine()));
                UIConsole.mainMenu();
                break;
            case 3 :
                System.out.println(UIConsoleString.ENTER_ID);
                System.out.println(Shop.productService.getProductById(Input.inLong.nextLong()));
                UIConsole.mainMenu();
                break;
            case 4 :
                ProductSection.productSection();
                break;
            default:
                System.out.println(UIConsoleString.ERROR_INPUT_NUMBER);
                uiConsoleService(Input.inByte.nextByte());
        }
    }
}
