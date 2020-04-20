package service;

import bean.Product;
import interfaces.ProductInterface;
import stat.Messages;

import static service.UserInput.*;

import java.math.BigDecimal;
import java.util.List;

import static database.InMemoryDataBase.dataBase;
import static service.ValidationService.*;

public class ProductService implements ProductInterface {
    @Override
    public void setItem() {
        Product product = new Product(userInputName(), userInputBigDecimalPrice(), userInputEnum());
        if (checkCorrectUserInputProduct(product) && checkForDuplicates(product.getName(), dataBase)) {
            dataBase.add(product);
            System.out.println("\n" + Messages.PRODUCT_ADDED);
        }
    }

    @Override
    public void editItemPrice(Long id, BigDecimal newPrice) {
        if (checkIfExistID(id, dataBase) && newPrice.compareTo((BigDecimal.valueOf(0))) > -1) {
            dataBase.stream()
                    .filter(i -> i.getId().equals(id))
                    .forEach(i -> i.setPrice(newPrice));
        }
    }

    @Override
    public void setItemDiscount(Long id, BigDecimal newDiscount) {
        if (checkIfExistID(id, dataBase) && newDiscount.compareTo(BigDecimal.valueOf(0)) > -1) {
            dataBase.stream()
                    .filter(i -> i.getId().equals(id))
                    .forEach(i -> i.setDiscount(newDiscount));
        }
    }

    @Override
    public void editItemDescription(Long id, String description) {
        if (checkIfExistID(id, dataBase)) {
            dataBase.stream()
                    .filter(i -> i.getId().equals(id))
                    .forEach(i -> i.setDescription(description));
        }
    }

    @Override
    public void removeItemById(Long id) {
        if (checkIfExistID(id, dataBase)) {
            dataBase.removeIf(entry -> entry.getId().compareTo(id) == 0);
            System.out.println(Messages.SUCCESSFULLY_REMOVED);
        }
    }

    @Override
    public Product getProductById(Long id) {
        for (Product item : dataBase) {
            if (item.getId().compareTo(id) == 0) {
                return item;
            }
        }
        return null;
    }

    @Override
    public List<Product> getListOfProducts() {
        return dataBase;
    }
}

