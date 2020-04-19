package service;

import bean.Category;
import bean.Product;
import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.LinkedList;
import java.util.List;

import static org.junit.Assert.*;

public class ValidationServiceTest {
    List<Product> testDataBase = new LinkedList<>();
    static String name = "Something";


    @Before
    public void init() {
        testDataBase.add(new Product(name, new BigDecimal(100), Category.OTHER));

    }

    @Test
    public void checkForDuplicatesShouldReturnTrue() {
//        String name = "Something";
        boolean[] actual = {ValidationService.checkForDuplicates(name),
                ValidationService.checkForDuplicates(name),
                ValidationService.checkForDuplicates("aaa")};
        for (boolean b : actual) {
            assertTrue("check for duplicates", b);
        }
    }

    @Test
    public void checkIfExistID() {

    }

    @Test
    public void checkCorrectUserInputProduct() {
    }
}
