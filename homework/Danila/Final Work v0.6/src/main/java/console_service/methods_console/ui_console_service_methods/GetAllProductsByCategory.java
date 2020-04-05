package console_service.methods_console.ui_console_service_methods;

import bean.Product;
import console.UIConsole;
import database.Shop;
import enums.Category;
import input.Input;
import stat.UIConsoleString;

public class GetAllProductsByCategory {
    public static void getAllProductsByCategory() {
        System.out.println(UIConsoleString.ENTER_CATEGORY);

        String requestedCategory = Input.inString.nextLine();
        checkRequestedCategory(creatCategory(requestedCategory));

        System.out.println(Shop.productService.getListByEnumProducts(requestedCategory).toString());

        UIConsole.mainMenu();
    }

    private static void checkRequestedCategory(Category requestedEnum) {
        for (Product entry : Shop.products) {
            if(entry.getCategory().equals(requestedEnum)) {
                return;
            }
        }
        System.out.println(UIConsoleString.ERROR_INPUT_CATEGORY);
        UIConsole.mainMenu();
    }


    private static Category creatCategory(String requestedEnum) {
        switch (requestedEnum.toLowerCase()) {
            case "pizza" : return Category.PIZZA;
            case "ice" : return Category.ICE;
            case "bottle" : return Category.BOTTLE;
            default:
                System.out.println(UIConsoleString.ERROR_INPUT_CATEGORY);
                getAllProductsByCategory();
        }
        return null;
    }
}
