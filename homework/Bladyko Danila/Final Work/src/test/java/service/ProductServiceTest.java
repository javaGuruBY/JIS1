package service;

import bean.Product;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProductServiceTest {
    private ProductService victim;

    @BeforeEach
    public void setUp() {
        victim = new ProductService();
    }

    @Test
    public void shouldReturnSizeListFromProducts() {
        victim.setProduct(new Product(Product.Category.Pizza, "Piz", new BigDecimal(12.5)));
        Product expected = new Product(Product.Category.Pizza, "Piz", new BigDecimal(12.5));
        expected.lessId();

        assertEquals(1, victim.getListProducts().size());
    }

    @Test
    public void shouldReturnBooleanFromProducts() {
        victim.setProduct(new Product(Product.Category.Pizza, "Piz", new BigDecimal(12.5)));
        Product product = new Product(Product.Category.Pizza, "Piz", new BigDecimal(12.5));
        product.lessId();

        boolean actual = (victim.getProductById(0l).equals(product));
        boolean expected = true;

        assertEquals(expected, actual);
    }
}
