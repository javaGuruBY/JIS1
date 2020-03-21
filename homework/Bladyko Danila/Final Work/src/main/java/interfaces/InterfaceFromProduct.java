package interfaces;

import bean.Product;

import java.math.BigDecimal;
import java.util.List;

public interface InterfaceFromProduct {
    void setProduct(Product product);
    void setDiscountEnumProducts(Enum category, BigDecimal newDiscount);
    void removeDiscount(Long id);
    void removeProductById(Long id);
    void editPrice(Long id, BigDecimal newPrice);
    void editDiscount(Long id, BigDecimal newDiscount);
    Product getProductById(Long id);
    List<Product> getListProducts();
    List<Product> getListEnumProducts(Enum category);
}
