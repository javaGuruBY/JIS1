package console_service.methods_console.product_section_service_methods.set_product_methods;

import bean.Product;
import database.Shop;
import enums.Category;
import input.Input;
import stat.UIConsoleString;

import java.math.BigDecimal;

public class SetProductMethods {
    public static String setNameProduct() {
        System.out.println(UIConsoleString.ENTER_NAME_PRODUCT);
        String nameNewProduct = Input.inString.nextLine();

        checkNameForLength(nameNewProduct);
        checkProductNameForUniqueness(nameNewProduct);

        return nameNewProduct;
    }

    private static void checkNameForLength(String nameNewProduct) {
        if(nameNewProduct.length() < 3 || nameNewProduct.length() > 32) {
            System.out.println(UIConsoleString.ERROR_INPUT_NAME_LENGTH);
            setNameProduct();
        }
    }

    private static void checkProductNameForUniqueness(String nameNewProduct) {
        for (Product entry: Shop.products) {
            if(entry.getNameProduct().equals(nameNewProduct)) {
                System.out.println(UIConsoleString.ERROR_NAME_UNIQUENESS);
                setNameProduct();
            }
        }
    }

    public static Category setCategoryProduct() {
        System.out.println(UIConsoleString.ENTER_CATEGORY_PRODUCT);
        String categoryStringNewProduct = Input.inString.nextLine();

        Category categoryNewProduct = getCategory(categoryStringNewProduct);

        return categoryNewProduct;
    }

    private static Category getCategory(String categoryStringNewProduct) {
        switch (categoryStringNewProduct.toLowerCase()) {
            case "pizza" : return Category.PIZZA;
            case "ice" : return Category.ICE;
            case "bottle" : return Category.BOTTLE;
        }
        System.out.println(UIConsoleString.ERROR_INPUT_CATEGORY);
        setCategoryProduct();
        return null;
    }

    public static String setDescriptionProduct() {
        System.out.println(UIConsoleString.ENTER_DESCRIPTION_PRODUCT);
        String descriptionNewProduct = Input.inString.nextLine();

        checkLengthDescription(descriptionNewProduct);

        return descriptionNewProduct;
    }

    private static void checkLengthDescription(String descriptionNewProduct) {
        if(descriptionNewProduct.length() == 0) {
            System.out.println(UIConsoleString.ERROR_INPUT_LENGTH_DESCRIPTION);
            setDescriptionProduct();
        }
    }

    public static BigDecimal setPriceProduct() {
        System.out.println(UIConsoleString.ENTER_PRICE_PRODUCT);
        BigDecimal priceNewProduct = Input.inBigDecimal.nextBigDecimal();

        checkPrice(priceNewProduct);

        return priceNewProduct;
    }

    private static void checkPrice(BigDecimal priceNewProduct) {
        if(priceNewProduct.compareTo(new BigDecimal(0)) == -1) {
            System.out.println(UIConsoleString.ERROR_INPUT_PRICE);
            setPriceProduct();
        }
    }

    public static BigDecimal setDiscountProduct() {
        System.out.println(UIConsoleString.ENTER_DISCOUNT_PRODUCT);
        BigDecimal discountNewProduct = Input.inBigDecimal.nextBigDecimal();

        checkDiscount(discountNewProduct);

        return discountNewProduct;
    }

    private static void checkDiscount(BigDecimal priceNewProduct) {
        if(priceNewProduct.compareTo(new BigDecimal(100)) == 1 || priceNewProduct.compareTo(new BigDecimal(1)) == -1) {
            System.out.println(UIConsoleString.ERROR_INPUT_DISCOUNT);
            setDiscountProduct();
        }
    }
}
