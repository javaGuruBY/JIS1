package database;

import bean.Product;
import service.ProductService;

import java.util.LinkedList;
import java.util.List;

public class Shop {
    public static List<Product> products = new LinkedList<>();
    public static ProductService productService = new ProductService();
}
