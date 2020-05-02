package service;

import bean.Category;
import bean.Product;
import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.LinkedList;
import java.util.List;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ValidationServiceTest {
    List<Product> testDataBase = new LinkedList<>();
    String name = "Something";

    @Before
    public void init() {
        testDataBase.add(new Product(name, new BigDecimal(100), Category.OTHER));
    }

    @Test
    public void checkForDuplicatesShouldReturnTrue() {
        boolean[] actual = {ValidationService.checkForDuplicates("", testDataBase),
                ValidationService.checkForDuplicates(" ", testDataBase),
                ValidationService.checkForDuplicates("aaa", testDataBase)};
        for (boolean b : actual) {
            assertTrue("check for duplicates, should return true", b);
        }
    }

    @Test
    public void checkForDuplicatesShouldReturnFalse() {
        boolean[] actual = {ValidationService.checkForDuplicates(name, testDataBase)};
        for (boolean b : actual) {
            assertFalse("check for duplicates, should return false", b);
        }
    }

    @Test
    public void checkIfExistIdShouldReturnTrue() {
        boolean actual = ValidationService.checkIfExistID(testDataBase.get(0).getId(), testDataBase);
        assertTrue("Check if exist ID, should return true", actual);
    }

    @Test
    public void checkIfExistIdShouldReturnFalse() {
        boolean actual = ValidationService.checkIfExistID(0L, testDataBase);
        assertFalse("Check if exist ID, should return false", actual);
    }

    @Test
    public void checkCorrectUserInputProductShouldReturnTrue() {
        Product[] product = {new Product(("Not null name"), new BigDecimal(1), Category.OTHER),
                new Product("abcdefgh", new BigDecimal(1000000000), Category.OTHER)};
        for (Product value : product) {
            assertTrue("Check for correct user input, should return true",
                    ValidationService.checkCorrectUserInputProduct(value));
        }
    }

    @Test
    public void checkCorrectUserInputProductShouldReturnFalse() {
        Product[] product = {new Product(null, new BigDecimal(-1), Category.OTHER),
                new Product("abcdefgh", new BigDecimal(0), Category.OTHER),
                new Product(null, new BigDecimal(10), Category.OTHER),
                new Product("", new BigDecimal("0.1"), Category.OTHER)};
        for (Product value : product) {
            assertFalse("Check for correct user input, should return false",
                    ValidationService.checkCorrectUserInputProduct(value));
        }
    }
}
