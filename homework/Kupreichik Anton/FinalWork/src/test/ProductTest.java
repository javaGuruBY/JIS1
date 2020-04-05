import com.company.bean.Product;
import com.company.enums.Category;
import com.company.repository.EmbeddedProductDataBase;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProductTest {
    EmbeddedProductDataBase embeddedProductDataBase = new EmbeddedProductDataBase();
    Product[] product = new Product[1];

    @BeforeEach
    void setUp() {
        product[0] = new Product("apple", 0, new BigDecimal(12.4), new BigDecimal(0.3), "tasty apple", Category.CategoryList.Fruits);
    }

    @Test
    void checkAddProduct() {
        embeddedProductDataBase.addProduct(product[0].getId(), product[0].getName());
        int result = embeddedProductDataBase.getMapSize();
        assertEquals(result, 1);
    }


    @Test
    void checkRemoveProduct() {
        embeddedProductDataBase.addProduct(product[0].getId(), product[0].getName());
        embeddedProductDataBase.deleteProduct();
        int result = embeddedProductDataBase.getMapSize();
        assertEquals(result, 0);
    }

    @Test
    void checkGetMapSize() {
        embeddedProductDataBase.addProduct(product[0].getId(), product[0].getName());
        assertEquals(embeddedProductDataBase.getMapSize(), 1);
    }

}
