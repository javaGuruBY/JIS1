package console_service;

import console.ProductSection;
import input.Input;
import console_service.methods_console.ui_console_service_methods.GetAllProducts;
import console_service.methods_console.ui_console_service_methods.GetAllProductsByCategory;
import console_service.methods_console.ui_console_service_methods.GetProductById;
import stat.UIConsoleString;

public class UIConsoleService {
    public static void uiConsoleService(byte number) {
        switch (number) {
            case 1 :
                GetAllProducts.getAllProducts();
                break;
            case 2 :
                GetAllProductsByCategory.getAllProductsByCategory();
                break;
            case 3 :
                GetProductById.getProductById();
                break;
            case 4 :
                ProductSection.productSection();
                break;
            default:
                System.out.println(UIConsoleString.ERROR_INPUT_NUMBER);
                uiConsoleService(Input.inByte.nextByte());
        }
    }
}
