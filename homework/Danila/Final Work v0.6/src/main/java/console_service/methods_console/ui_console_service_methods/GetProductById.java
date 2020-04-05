package console_service.methods_console.ui_console_service_methods;

import bean.Product;
import console.UIConsole;
import database.Shop;
import input.Input;
import stat.UIConsoleString;

public class GetProductById {
    public static void getProductById() {
        System.out.println(UIConsoleString.ENTER_ID);
        Long requestedId = Input.inLong.nextLong();

        checkRequestedId(requestedId);

        System.out.println(Shop.productService.getProductById(requestedId));

        UIConsole.mainMenu();
    }

    private static void checkRequestedId(Long requestedId) {
        for (Product entry : Shop.products) {
            if(entry.getIdProduct() == requestedId) {
                return;
            }
        }
        System.out.println(UIConsoleString.ERROR_INPUT_ID_PRODUCT_GO_MAIN);
        UIConsole.mainMenu();
    }
}
