import com.company.service.Category;
import com.company.service.Product;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CategoryTest {

    Product product[] = new Product[1];
    Category category = new Category();

    @BeforeEach
    void setUp() {
        product[0] = new Product("apple", new BigDecimal(12.4), new BigDecimal(0.3), "tasty apple");
        product[0].addProduct(0l, product[0].getName());
    }

    @Test
    void checkAddProduct(){
        category.addProduct(product[0].getName(), "FRUIT");
        int result= category.getMapSize();
        assertEquals(result, 1);
    }

}
