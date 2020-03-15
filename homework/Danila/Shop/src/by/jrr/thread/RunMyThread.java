package by.jrr.thread;

import by.jrr.bean.Product;
import by.jrr.service.Shop;

import java.math.BigDecimal;

public class RunMyThread implements Runnable {
    @Override
    public void run() {
        Shop shop = new Shop();
        shop.setProduct(new Product("Chocolate", new BigDecimal(1.0)));

        System.out.println(shop.findProductByName("Chocolate"));
        
        shop.findProduct(new BigDecimal(1.1), new BigDecimal(3.25));
    }

}
