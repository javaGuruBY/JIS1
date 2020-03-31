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
}
