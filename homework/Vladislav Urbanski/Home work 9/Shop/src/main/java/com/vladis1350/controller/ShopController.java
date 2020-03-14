package com.vladis1350.controller;

import com.vladis1350.bean.Product;
import com.vladis1350.bean.Shop;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.List;

import static java.math.BigDecimal.ROUND_CEILING;

@RestController
@RequestMapping("/")
public class ShopController {
    private Shop myShop = new Shop();

    @GetMapping("/add")
    public String addingGoods(@RequestParam(name = "name") String name, Double price) {
        BigDecimal decimal = new BigDecimal(price);
        Product product = new Product(name, decimal);
        myShop.addProduct(product);
        return "Product: " + product.getName() + ", Price: " + product.getPrice().setScale(3, ROUND_CEILING) + " added!";
    }

    @GetMapping("/remove")
    public String remove(@RequestParam(name = "name") String name) {
        myShop.removeProduct(name);
        return "Product: " + name + " removed!";
    }

    @GetMapping("/search")
    public Product search(@RequestParam(name = "name") String name) {
        return myShop.findProductByName(name);
    }

    @GetMapping("/range")
    public List<Product> searchInRangePrice(@RequestParam(name = "range") String range) {
        String[] rangeList = range.split("-");
        double minPriceRange = Double.parseDouble(rangeList[0]);
        double maxPriceRange = Double.parseDouble(rangeList[1]);
        BigDecimal minDecimal = new BigDecimal(minPriceRange);
        BigDecimal maxecimal = new BigDecimal(maxPriceRange);
        if (minPriceRange > maxPriceRange) {
            return myShop.findAllProductsInPriceRange(maxecimal, minDecimal);
        } else {
            return myShop.findAllProductsInPriceRange(minDecimal, maxecimal);
        }
    }

    @GetMapping
    public List<Product> getAllProducts() {
        return myShop.getProductList();
    }
}
