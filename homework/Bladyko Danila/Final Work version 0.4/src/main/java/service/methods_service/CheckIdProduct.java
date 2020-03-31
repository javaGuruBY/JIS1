package service.methods_service;

import bean.Product;
import database.Shop;

public class CheckIdProduct {
    public static boolean checkId(Long idProduct) {
        for (Product entry: Shop.products) {
            if(entry.getIdProduct() == idProduct)
                return true;
        }
        return false;
    }
}
