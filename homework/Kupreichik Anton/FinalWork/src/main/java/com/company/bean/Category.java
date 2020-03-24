package com.company.bean;

import com.company.interfaces.MapInterface;
import com.company.menuString.MenuString;

import java.util.HashMap;
import java.util.Map;

public class Category implements MapInterface {
    static Map<String, String> categoryMap = new HashMap<>();

    public String chooseCategory(int a) {
        if (a == 1) {
            return "Grocery";
        }
        if (a == 2) {
            return "Gastronomy";
        }
        if (a == 3) {
            return "Baby food";
        }
        if (a == 4) {
            return "Diet food";
        }
        if (a == 5) {
            return "Frozen products";
        }
        if (a == 6) {
            return "Confectionery";
        }
        if (a == 7) {
            return "Cookery";
        }
        if (a == 8) {
            return "Dairy";
        }
        if (a == 9) {
            return "Meat, bird, egg";
        }
        if (a == 10) {
            return "Soft Drinks";
        }
        if (a == 11) {
            return "Fish, seafood";
        }
        if (a == 12) {
            return "Sports nutrition";
        }
        if (a == 13) {
            return "Fruits, vegetables, mushrooms";
        }
        if (a == 14) {
            return "Bakery products";
        }
        if (a == 15) {
            return "Tea, Coffee, Cocoa";
        } else return "null";
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
