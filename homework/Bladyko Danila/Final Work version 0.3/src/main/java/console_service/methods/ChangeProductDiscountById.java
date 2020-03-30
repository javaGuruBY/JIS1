package console_service.methods;

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
        BigDecimal bigDecimalProduct = Input.inBigDecimal.nextBigDecimal();

        Shop.productService.changeProductDiscountById(idProduct, bigDecimalProduct);
        UIConsole.mainMenu();
    }
}
