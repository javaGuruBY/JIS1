package service;

import bean.Product;
import stat.Messages;

import java.math.BigDecimal;
import java.util.List;

import static database.InMemoryDataBase.dataBase;

public class ValidationService {

    public static boolean checkForDuplicates(String name, List<Product> dataBase) {
        for (Product item : dataBase) {
            if (item.getName().compareTo(name) == 0) {
                System.err.println(Messages.DUPLICATE);
                return false;
            }
        }
        return true;
    }

    static boolean checkIfExistID(Long id, List<Product> dataBase) {
        if (dataBase.stream().anyMatch(entry -> entry.getId().compareTo(id) == 0)) {
            return true;
        } else {
            System.err.println(Messages.NO_ITEM);
            return false;
        }
    }

    static boolean checkCorrectUserInputProduct(Product product) {
        if (product.getName() == null || product.getName().length() < 1) {
            System.err.println(Messages.INCORRECT_NAME);
            return false;
        } else if (product.getPrice().compareTo(BigDecimal.valueOf(0)) < 1) {
            System.err.println(Messages.INCORRECT_PRICE);
            return false;
        } else {
            return true;
        }
    }
}
