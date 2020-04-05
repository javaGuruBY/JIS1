package service.methods_service;

import bean.Product;
import enums.Category;

import java.util.List;

public class CheckCategory {
    public static void checkCategoryAndSetInGetList(String category, Product product, List<Product> getList) {
        switch (category.toLowerCase()) {
            case "pizza" :
                if(product.getCategory() == Category.PIZZA) {
                    getList.add(product);
                }
                break;
            case "ice" :
                if(product.getCategory() == Category.ICE) {
                    getList.add(product);
                }
                break;
            case "bottle" :
                if(product.getCategory() == Category.BOTTLE) {
                    getList.add(product);
                }
                break;
        }
    }
}
