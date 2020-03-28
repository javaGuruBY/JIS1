package interfaces;

import bean.Product;

import java.math.BigDecimal;
import java.util.List;

public interface ProductInterface {
    void setItem(Product product);
    void editItemPrice(Long id, BigDecimal newPrice);
    void setItemDiscount(Long id, BigDecimal newDiscount);
    void editItemDescription(Long id, String description);
    void removeItemById(Long id);
    Product getProductById(Long id);
    List<Product> getListOfProducts();
}
