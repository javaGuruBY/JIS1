import bean.Product;
import service.Shop;

import java.math.BigDecimal;

public class App {

    public static void main(String[] args) {
        Shop shop = new Shop();
        Product product = new Product();
        shop.addProduct(new Product( "Пивчанский", new BigDecimal("3.99")));
        shop.addProduct(new Product( "Кальмарчик", new BigDecimal("6.66")));
        shop.addProduct(new Product( "Водка, что бы деньги не на ветер", new BigDecimal("7.77")));

        shop.findProduct("Пивчанский");
        shop.findProductByPrice(new BigDecimal("6"),new BigDecimal ("8"));

        shop.removeProduct("Пивчанский");

        System.out.println(shop.toString());
    }
}
