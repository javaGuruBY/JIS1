package console_service;

import console.PriceSection;
import console.UIConsole;
import console_service.methods.RemoveProductById;
import console_service.methods.SetDiscountEnum;
import console_service.methods.SetProduct;
import input.Input;
import stat.UIConsoleString;

public class ProductSectionService {
    public static void productSectionService(byte number) {
        switch (number) {
            case 1 :
                SetProduct.setProduct();
                break;
            case 2 :
                SetDiscountEnum.setDiscountEnum();
                break;
            case 3 :
                RemoveProductById.removeProduct();
                break;
            case 4 :
                PriceSection.priceSection();
                break;
            case 5 :
                UIConsole.mainMenu();
                break;
            default:
                System.out.println(UIConsoleString.ERROR_INPUT_NUMBER);
                productSectionService(Input.inByte.nextByte());
        }
    }
}
