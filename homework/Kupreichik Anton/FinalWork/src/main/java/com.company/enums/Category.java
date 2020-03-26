package com.company.enums;

public class Category {
    public enum CategoryList {
        Grocery, Gastronomy, BabyFood,
        DietFood, FrozenProducts, Confectionery,
        Cookery, Dairy, Meat, Bird, Egg, SoftDrinks, Fish,
        Seafood, SportsNutrition, Fruits, Vegetables, Mushrooms,
        BakeryProducts, Tea, Coffee, Cocoa, OtherProducts
    }

    public static CategoryList chooseCategory(int a) {
        switch (a) {
            case 1:
                return CategoryList.Grocery;
            case 2:
                return CategoryList.Gastronomy;
            case 3:
                return CategoryList.BabyFood;
            case 4:
                return CategoryList.DietFood;
            case 5:
                return CategoryList.FrozenProducts;
            case 6:
                return CategoryList.Confectionery;
            case 7:
                return CategoryList.Cookery;
            case 8:
                return CategoryList.Dairy;
            case 9:
                return CategoryList.Meat;
            case 10:
                return CategoryList.Bird;
            case 11:
                return CategoryList.Egg;
            case 12:
                return CategoryList.SoftDrinks;
            case 13:
                return CategoryList.Fish;
            case 14:
                return CategoryList.Seafood;
            case 15:
                return CategoryList.SportsNutrition;
            case 16:
                return CategoryList.Fruits;
            case 17:
                return CategoryList.Vegetables;
            case 18:
                return CategoryList.Mushrooms;
            case 19:
                return CategoryList.BakeryProducts;
            case 20:
                return CategoryList.Tea;
            case 21:
                return CategoryList.Coffee;
            case 22:
                return CategoryList.Cocoa;
        }
        return CategoryList.OtherProducts;
    }
}
