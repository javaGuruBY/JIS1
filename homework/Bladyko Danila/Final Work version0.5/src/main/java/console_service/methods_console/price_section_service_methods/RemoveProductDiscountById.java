package console_service.methods_console.price_section_service_methods;

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
