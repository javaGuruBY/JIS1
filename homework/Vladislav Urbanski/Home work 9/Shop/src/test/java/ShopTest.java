import com.vladis1350.bean.Product;
import com.vladis1350.bean.Shop;

import java.math.BigDecimal;
import java.util.LinkedList;
import java.util.List;

import static java.math.BigDecimal.ROUND_CEILING;

public class ShopTest {

    public void testShouldFindProductByName() throws Exception {
        Shop shop = new Shop();

        Product expected = new Product("Milk", new BigDecimal(1.2).setScale(3, ROUND_CEILING));
        Product actual = shop.findProductByName("Milk");
        assertEqualObject(expected, actual, "testShouldFindProductByName");
    }

    public void testShouldFindAllProductInRangePrice() throws Exception {
        Shop shop = new Shop();

       Product productBred = new Product("Bred", new BigDecimal(17.62).setScale(3, ROUND_CEILING));
       Product productChips = new Product("Chips", new BigDecimal(9.4).setScale(3, ROUND_CEILING));
       Product productFat = new Product("Fat", new BigDecimal(11.12).setScale(3, ROUND_CEILING));
        List<Product> expectedList = new LinkedList<>();

        expectedList.add(productChips);
        expectedList.add(productFat);
        expectedList.add(productBred);

        List<Product> actualList = shop.findAllProductsInPriceRange(new BigDecimal(9.2), new BigDecimal(17.9));

        assertEqualList(expectedList, actualList, "testShouldFindAllProductInRangePrice");
    }

    private void assertEqualList(List<Product> expected, List<Product> actual, String description) throws Exception {
        if (!expected.equals(actual)) {
            throw new Exception(description + " has failed! \n" +
                    "Expected " + expected + " but was " + actual);
        } else {
            System.out.println(description + " has passed!");
        }
    }

    private void assertEqualObject(Product expected, Product actual, String description) throws Exception {
        if (!expected.equals(actual)) {
            throw new Exception(description + " has failed! \n" +
                    "Expected " + expected + " but was " + actual);
        } else {
            System.out.println(description + " has passed!");
        }
    }
}
