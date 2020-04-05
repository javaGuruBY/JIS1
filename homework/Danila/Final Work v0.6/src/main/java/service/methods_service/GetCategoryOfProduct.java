package service.methods_service;

import enums.Category;
import input.Input;
import stat.UIConsoleString;

public class GetCategoryOfProduct {
    public static Category getCategoryOfProduct(String category) {
        switch (category.toLowerCase()) {
            case "pizza" : return Category.PIZZA;
            case "ice" : return Category.ICE;
            case "bottle" : return Category.BOTTLE;
            default:
                System.out.println(UIConsoleString.ERROR_INPUT_CATEGORY);
                getCategoryOfProduct(Input.inString.nextLine());
        }
        return null;
    }
}
