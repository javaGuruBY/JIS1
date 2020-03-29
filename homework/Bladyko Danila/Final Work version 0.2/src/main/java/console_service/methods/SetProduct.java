package console_service.methods;

import bean.Product;
import console.UIConsole;
import console_service.UIConsoleService;
import database.Shop;
import enums.Category;
import input.Input;
import stat.UIConsoleString;

import java.math.BigDecimal;

public class SetProduct {
    public static void setProduct() {
        System.out.println(UIConsoleString.ENTER_NAME_PRODUCT);
        String nameNewProduct = Input.inString.nextLine();

        System.out.println(UIConsoleString.ENTER_CATEGORY_PRODUCT);
        String categoryNewProduct = Input.inString.nextLine(); // Реши проблему со списком

        System.out.println(UIConsoleString.ENTER_DESCRIPTION_PRODUCT);
        String descriptionNewProduct = Input.inString.nextLine();

        System.out.println(UIConsoleString.ENTER_PRICE_PRODUCT);
        BigDecimal priceNewProduct = Input.inBigDecimal.nextBigDecimal();

        System.out.println(UIConsoleString.ENTER_DISCOUNT_PRODUCT);
        BigDecimal discountNewProduct = Input.inBigDecimal.nextBigDecimal();

        Shop.productService.setProduct(new Product(nameNewProduct,
                categoryNewProduct,
                descriptionNewProduct,
                priceNewProduct,
                discountNewProduct));

        UIConsole.mainMenu();
    }
}
