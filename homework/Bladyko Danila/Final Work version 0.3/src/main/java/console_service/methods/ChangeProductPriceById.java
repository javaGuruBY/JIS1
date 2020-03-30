package console_service.methods;

import console.UIConsole;
import database.Shop;
import input.Input;
import stat.UIConsoleString;

import java.math.BigDecimal;

public class ChangeProductPriceById {
    public static void changeProductPriceById() {
        System.out.println(UIConsoleString.ENTER_ID);
        Long idProduct = Input.inLong.nextLong();

        System.out.println(UIConsoleString.ENTER_PRICE_PRODUCT);
        BigDecimal bigDecimalProduct = Input.inBigDecimal.nextBigDecimal();

        Shop.productService.changeProductPriceById(idProduct, bigDecimalProduct);

        UIConsole.mainMenu();
    }
}
