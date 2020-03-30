package console;

import console_service.UIConsoleService;
import input.Input;
import stat.UIConsoleString;

public class UIConsole {
    public static void mainMenu() {
        System.out.println(UIConsoleString.GET_ALL_PRODUCTS +
                UIConsoleString.GET_ALL_PRODUCTS_BY_ENUM +
                UIConsoleString.GET_PRODUCT_BY_ID +
                UIConsoleString.GO_TO_THE_PRODUCT_SECTION);
        UIConsoleService.uiConsoleService(Input.inByte.nextByte());
    }
}
