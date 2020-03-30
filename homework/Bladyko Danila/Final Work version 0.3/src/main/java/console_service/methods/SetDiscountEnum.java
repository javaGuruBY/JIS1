package console_service.methods;

import console.UIConsole;
import database.Shop;
import input.Input;
import stat.UIConsoleString;

import java.math.BigDecimal;

public class SetDiscountEnum {
    public static void setDiscountEnum() {
        System.out.println(UIConsoleString.ENTER_ENUM);
        String categoryEnumProducts = Input.inString.nextLine();

        System.out.println(UIConsoleString.ENTER_DISCOUNT_ENUM);
        BigDecimal newDiscount = Input.inBigDecimal.nextBigDecimal();

        Shop.productService.changeDiscountEnumProducts(categoryEnumProducts, newDiscount);

        UIConsole.mainMenu();
    }
}
