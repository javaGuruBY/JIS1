package console_service.methods;

import console.UIConsole;
import database.Shop;
import input.Input;
import stat.UIConsoleString;

public class RemoveProductDiscountById {
    public static void removeProductDiscountById() {
        System.out.println(UIConsoleString.ENTER_ID);
        Long idProduct = Input.inLong.nextLong();

        Shop.productService.removeProductDiscountById(idProduct);
        UIConsole.mainMenu();
    }
}
