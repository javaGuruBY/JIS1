package console_service.methods_console.product_section_service_methods;

import bean.Product;
import console.UIConsole;
import console_service.methods_console.product_section_service_methods.set_product_methods.SetProductMethods;
import database.Shop;
import enums.Category;
import java.math.BigDecimal;

public class SetProduct {
    public static void setProduct() {
        String nameNewProduct;
        String descriptionNewProduct;
        Category categoryNewProduct;
        BigDecimal priceNewProduct;
        BigDecimal discountNewProduct;

        nameNewProduct = SetProductMethods.setNameProduct();

        categoryNewProduct = SetProductMethods.setCategoryProduct();

        descriptionNewProduct = SetProductMethods.setDescriptionProduct();

        priceNewProduct = SetProductMethods.setPriceProduct();

        discountNewProduct = SetProductMethods.setDiscountProduct();

        Shop.productService.setProduct(new Product(nameNewProduct,
                categoryNewProduct,
                descriptionNewProduct,
                priceNewProduct,
                discountNewProduct));

        UIConsole.mainMenu();
    }
}
