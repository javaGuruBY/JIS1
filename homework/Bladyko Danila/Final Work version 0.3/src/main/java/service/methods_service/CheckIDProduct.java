package service.methods_service;

import bean.Product;
import database.Shop;

public class CheckIDProduct {
    public static boolean checkID(Long idProduct) {
        for (Product entry: Shop.products) {
            if(entry.getIdProduct() == idProduct)
                return true;
        }
        return false;
    }
}
