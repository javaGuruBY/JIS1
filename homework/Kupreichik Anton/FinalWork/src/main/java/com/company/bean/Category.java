package com.company.bean;

import com.company.interfaces.MapInterface;
import com.company.menuString.MenuString;

import java.util.HashMap;
import java.util.Map;

public class Category implements MapInterface {
    static Map<String, String> categoryMap = new HashMap<>();

    public String chooseCategory(int a) {
        switch (a) {
            case 1:
                return "Grocery";
            case 2:
                return "Gastronomy";
            case 3:
                return "Baby food";
            case 4:
                return "Diet food";
            case 5:
                return "Frozen products";
            case 6:
                return "Confectionery";
            case 7:
                return "Cookery";
            case 8:
                return "Dairy";
            case 9:
                return "Meat, bird, egg";
            case 10:
                return "Soft Drinks";
            case 11:
                return "Fish, seafood";
            case 12:
                return "Sports nutrition";
            case 13:
                return "Fruits, vegetables, mushrooms";
            case 14:
                return "Bakery products";
            case 15:
                return "Tea, Coffee, Cocoa";
        }
        return "Other products";
    }

    public void removeProduct(String name) {
        categoryMap.remove(name);
    }

    public void showCategory() {
        System.out.println("Category: " + categoryMap.values());
    }

    public void addProduct(String name, String category) {
        categoryMap.put(name, category);
    }

    public void deleteCategory(String category) {
        if (categoryMap.containsValue(category)) {
            categoryMap.remove(categoryMap.values().equals(category));
        } else {
            System.out.println(MenuString.NO_SUCH_CATEGORY);
        }
    }

    public void showAllProduct() {
        System.out.println("Products: " + categoryMap.keySet());
    }

    @Override
    public int getMapSize() {
        return categoryMap.size();
    }
}
