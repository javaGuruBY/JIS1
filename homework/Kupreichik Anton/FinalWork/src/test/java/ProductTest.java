import com.company.service.Product;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProductTest {
    Product product[] = new Product[1];

    @BeforeEach
    void setUp() {
        product[0] = new Product("apple", new BigDecimal(12.4), new BigDecimal(0.3), "tasty apple");
    }

    @Test
    void checkAddProduct() {
        product[0].addProduct(0l, product[0].getName());
        int result = product[0].getMapSize();
        assertEquals(result, 1);
    }

    @Test
    void checkAvailabilityOfProduct() {
        product[0].addProduct(0l, product[0].getName());
        boolean result = product[0].checkProduct("apple");
        assertEquals(result, true);
    }

    @Test
    void checkRemoveProduct() {
        product[0].addProduct(0l, product[0].getName());
        product[0].removeProductById(0l);
        int result = product[0].getMapSize();
        assertEquals(result, 0);
    }

    @Test
    void checkGetMapSize() {
        product[0].addProduct(0l, product[0].getName());
        assertEquals(product[0].getMapSize(), 1);
    }
}
