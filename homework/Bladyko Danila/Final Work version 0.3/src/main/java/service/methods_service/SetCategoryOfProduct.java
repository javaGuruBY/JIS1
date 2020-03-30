package service.methods_service;

import enums.Category;
import input.Input;
import stat.UIConsoleString;

public class SetCategoryOfProduct {
    public static void setCategoryOfProduct(String category, Category categoryOfProduct) {
        switch (category) {
            case "Pizza" : categoryOfProduct = Category.PIZZA; break;
            case "Ice" : categoryOfProduct = Category.ICE; break;
            case "Bottle" : categoryOfProduct = Category.BOTTLE; break;
            default:
                System.out.println(UIConsoleString.ERROR_INPUT_CATEGORY);
                setCategoryOfProduct(Input.inString.nextLine(), categoryOfProduct);
        }
    }
}
