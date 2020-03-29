package console_service.methods;

import console.UIConsole;
import database.Shop;
import enums.Category;
import input.Input;
import stat.UIConsoleString;

import java.math.BigDecimal;

public class SetDiscountEnum {
    public static void setDiscountEnum() {
        System.out.println(UIConsoleString.ENTER_ENUM);
        Category category = Input.inString.nextLine(); // Ну реши проблему

        System.out.println(UIConsoleString.ENTER_DISCOUNT_ENUM);
        BigDecimal newDiscount = Input.inBigDecimal.nextBigDecimal();

        Shop.productService.changeDiscountEnumProducts(category, newDiscount);

        UIConsole.mainMenu();
    }
}
