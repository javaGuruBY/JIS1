package service.methods_service;

import bean.Product;
import console.UIConsole;
import database.Shop;
import stat.UIConsoleString;

public class CheckIdProduct {
    public static void checkId(Long idProduct) {
        for (Product entry: Shop.products) {
            if(entry.getIdProduct() == idProduct)
                return;
        }
        System.out.println(UIConsoleString.ERROR_INPUT_ID_PRODUCT);
        UIConsole.mainMenu();
    }
}
