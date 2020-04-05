package console_service.methods_console.ui_console_service_methods;

import console.UIConsole;
import database.Shop;

public class GetAllProducts {
    public static void getAllProducts() {
        System.out.println(Shop.productService.getListProducts());
        UIConsole.mainMenu();
    }
}
