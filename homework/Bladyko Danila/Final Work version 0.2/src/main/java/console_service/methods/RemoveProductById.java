package console_service.methods;

import console.UIConsole;
import database.Shop;
import input.Input;
import stat.UIConsoleString;

public class RemoveProductById {
    public static void removeProduct() {
        System.out.println(UIConsoleString.ENTER_ID);
        Long idOfProduct = Input.inString.nextLong();

        Shop.productService.removeProductById(idOfProduct);

        UIConsole.mainMenu();
    }
}
