package com.company.menuString;

public class MenuString {
    public static final String ADD_PRODUCT = "1.Add the product";
    public static final String REMOVE_PRODUCT = "2.Remove product";
    public static final String FIND_PRODUCT = "3.Find the product";
    public static final String SHOW_ALL_PRODUCT = "4.Display all products";
    public static final String CHANGE_PRODUCT = "5.Change product information";
    public static final String EXIT_MAIN = "8.Exit";
    public static final String FILTRATION = "7.Filtration";
    public static final String CHOOSE_TYPE_OF_FILTRATION = "What do you want to filter:\n1.Id(Ascending)\n2.Name(Ascending)\n3.Id(Descending)\n4.Name(Descending)\n5.Exit\n";
    public static final String YOU_CHOOSE = "Your choice?";
    public static final String ENTER_NAME = "Enter a name";
    public static final String ENTER_ID = "Enter ID";
    public static final String ENTER_PRICE = "Enter price";
    public static final String ENTER_DISCOUNT = "Enter a discount";
    public static final String ENTER_DESCRIPTION = "Enter a description";
    public static final String ENTER_CATEGORY = "Enter a category";
    public static final String YOU_PRODUCT = "You product:";
    public static final String PRODUCT_SUCCESSFULLY_ADDED = "Product successfully added";
    public static final String CHOOSE_TYPE_CHANGE = "What do you want to change:\n1.Name\n2.Price\n3.Discount\n4.Description";
    public static final String SUCCESSFULLY_CHANGES = "Successfully changes";
    public static final String SUCCESSFULLY_DELETED = "Successfully deleted";
    public static final String WORK_WITH_CATEGORIES = "6.Work with categories";
    public static final String ADD_PRODUCT_TO_CATEGORY = "1.Add product to category";
    public static final String REMOVE_PRODUCT_FROM_CATEGORY = "2.Delete product from category";
    public static final String DELETE_CATEGORY = "3.Delete category";
    public static final String SHOW_CATEGORY = "4.Show all category";
    public static final String RETURN_ALL_PRODUCTS_FROM_CATEGORY = "5.Show all products";
    public static final String EXIT_CATEGORY = "6.Exit";
    public static final String NO_SUCH_PRODUCT = "No such product";
    public static final String NO_SUCH_CATEGORY = "No such category";
    public static final String THIS_NOT_A_NUMBER = "This not a number";
    public static final String CHOOSE_CATEGORY_LIST = "1.Grocery\n" +
            "2.Gastronomy\n" +
            "3.Baby food\n" +
            "4.Diet food\n" +
            "5.Frozen products\n" +
            "6.Confectionery\n" +
            "7.Cookery\n" +
            "8.Dairy\n" +
            "9.Meat, bird, egg\n" +
            "10.Soft Drinks\n" +
            "11.Fish, seafood\n" +
            "12.Sports nutrition\n" +
            "13.Fruits, vegetables, mushrooms\n" +
            "14.Bakery products\n" +
            "15.Tea, Coffee, Cocoa";
     public static void Menu(){
        System.out.println(MenuString.ADD_PRODUCT + "\n" + MenuString.REMOVE_PRODUCT+ "\n" +FIND_PRODUCT + "\n" +SHOW_ALL_PRODUCT + "\n" +CHANGE_PRODUCT
                + "\n" +WORK_WITH_CATEGORIES + "\n" +FILTRATION + "\n" +EXIT_MAIN + "\n" + YOU_CHOOSE );
    }
    public static void categoryMenu(){
        System.out.println(MenuString.ADD_PRODUCT_TO_CATEGORY + "\n" +REMOVE_PRODUCT_FROM_CATEGORY + "\n" +DELETE_CATEGORY + "\n" +SHOW_CATEGORY
                + "\n" +RETURN_ALL_PRODUCTS_FROM_CATEGORY + "\n" +EXIT_CATEGORY);

    }
}
