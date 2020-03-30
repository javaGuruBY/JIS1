package console_service;

import console.UIConsole;
import console_service.methods.ChangeProductDiscountById;
import console_service.methods.ChangeProductPriceById;
import console_service.methods.RemoveProductDiscountById;
import input.Input;
import stat.UIConsoleString;

public class PriceSectionService {
    public static void priceSectionService(byte number) {
        switch (number) {
            case 1 :
                ChangeProductPriceById.changeProductPriceById();
                break;
            case 2 :
                ChangeProductDiscountById.changeProductDiscountById();
                break;
            case 3 :
                RemoveProductDiscountById.removeProductDiscountById();
                break;
            case 4 :
                UIConsole.mainMenu();
                break;
            default:
                System.out.println(UIConsoleString.ERROR_INPUT_NUMBER);
                priceSectionService(Input.inByte.nextByte());
        }
    }
}
