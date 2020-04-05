package console_service.methods_console.price_section_service_methods;

import console.UIConsole;
import console_service.methods_console.product_section_service_methods.set_product_methods.SetProductMethods;
import database.Shop;
import input.Input;
import service.methods_service.CheckIdProduct;
import stat.UIConsoleString;

import java.math.BigDecimal;

public class ChangeProductPriceById {
    public static void changeProductPriceById() {
        System.out.println(UIConsoleString.ENTER_ID);
        Long idProduct = Input.inLong.nextLong();
        CheckIdProduct.checkId(idProduct);

        System.out.println(UIConsoleString.ENTER_PRICE_PRODUCT);
        BigDecimal bigDecimalProduct = SetProductMethods.setPriceProduct();

        Shop.productService.changeProductPriceById(idProduct, bigDecimalProduct);

        UIConsole.mainMenu();
    }
}
