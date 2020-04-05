package console;

import console_service.ProductSectionService;
import input.Input;
import stat.UIConsoleString;

public class ProductSection {
    public static void productSection() {
        System.out.println(UIConsoleString.SET_PRODUCT +
                UIConsoleString.SET_DISCOUNT_ENUM_PRODUCTS +
                UIConsoleString.REMOVE_PRODUCT_BY_ID +
                UIConsoleString.GO_TO_THE_PRICE_SECTION +
                UIConsoleString.RETURN_TO_MAIN);
        ProductSectionService.productSectionService(Input.inByte.nextByte());
    }
}
