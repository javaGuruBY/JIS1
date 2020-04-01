package console_service.methods_console.product_section_service_methods;

import console.UIConsole;
import database.Shop;
import input.Input;
import stat.UIConsoleString;

import java.math.BigDecimal;

public class SetDiscountEnum {
    public static void setDiscountEnum() {
        System.out.println(UIConsoleString.ENTER_CATEGORY);
        String categoryEnumProducts = Input.inString.nextLine();

        System.out.println(UIConsoleString.ENTER_DISCOUNT_CATEGORY);
        BigDecimal newDiscount = Input.inBigDecimal.nextBigDecimal();

        Shop.productService.changeDiscountEnumProducts(categoryEnumProducts, newDiscount);
        UIConsole.mainMenu();
    }
}
