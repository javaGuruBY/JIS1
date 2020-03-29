package interfaces;

import bean.Product;
import enums.Category;

import java.math.BigDecimal;
import java.util.List;

public interface InterfaceFromProduct {
    void setProduct(Product product);
    void removeProductDiscountById(Long id);
    void removeProductById(Long id);
    void changeDiscountEnumProducts(Category category, BigDecimal newDiscount);
    void changeProductPriceById(Long id, BigDecimal newPrice);
    void changeProductDiscountById(Long id, BigDecimal newDiscount);
    Product getProductById(Long id);
    List<Product> getListProducts();
    List<Product> getListEnumProducts(Enum category);
}
