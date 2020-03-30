package console;

import console_service.PriceSectionService;
import input.Input;
import stat.UIConsoleString;

public class PriceSection {
    public static void priceSection() {
        System.out.println(UIConsoleString.CHANGE_PRODUCT_PRICE +
                UIConsoleString.CHANGE_PRODUCT_DISCOUNT +
                UIConsoleString.REMOVE_PRODUCT_DISCOUNT +
                UIConsoleString.RETURN_TO_MAIN);
        PriceSectionService.priceSectionService(Input.inByte.nextByte());
    }
}
