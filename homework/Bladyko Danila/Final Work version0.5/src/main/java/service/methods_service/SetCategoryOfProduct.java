package service.methods_service;

import enums.Category;
import input.Input;
import stat.UIConsoleString;

public class SetCategoryOfProduct {
    public static Category setCategoryOfProduct(String category) {
        switch (category.toLowerCase()) {
            case "pizza" : return Category.PIZZA;
            case "ice" : return Category.ICE;
            case "bottle" : return Category.BOTTLE;
            default:
                System.out.println(UIConsoleString.ERROR_INPUT_CATEGORY);
                setCategoryOfProduct(Input.inString.nextLine());
        }
        return null;
    }
}
