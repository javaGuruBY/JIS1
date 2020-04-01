package console_service.methods_console.price_section_service_methods;

import console.UIConsole;
import database.Shop;
import input.Input;
import stat.UIConsoleString;

import java.math.BigDecimal;

public class ChangeProductDiscountById {
    public static void changeProductDiscountById() {
        System.out.println(UIConsoleString.ENTER_ID);
        Long idProduct = Input.inLong.nextLong();

        System.out.println(UIConsoleString.ENTER_DISCOUNT_PRODUCT);
        BigDecimal newDiscount = Input.inBigDecimal.nextBigDecimal();

        Shop.productService.changeProductDiscountById(idProduct, newDiscount);
        UIConsole.mainMenu();
    }
}
