package service;

import bean.Product;
import interfaces.ProductInterface;
import stat.Messages;

import java.math.BigDecimal;
import java.util.List;

import static database.InMemoryDataBase.dataBase;

public class ProductService implements ProductInterface {
    @Override
    public void setItem(Product product) {
        if (product.getName() == null) {
            System.out.println(Messages.INCORRECT_NAME);
        } else {
            dataBase.add(product);
        }
    }

    @Override
    public void editItemPrice(Long id, BigDecimal newPrice) {
        dataBase.stream()
                .filter(i -> i.getId().equals(id))
                .forEach(i -> i.setPrice(newPrice));
    }

    @Override
    public void setItemDiscount(Long id, BigDecimal newDiscount) {
        dataBase.stream()
                .filter(i -> i.getId().equals(id))
                .forEach(i -> i.setDiscount(newDiscount));
    }

    @Override
    public void editItemDescription(Long id, String description) {
        dataBase.stream()
                .filter(i -> i.getId().equals(id))
                .forEach(i -> i.setDescription(description));
    }

    @Override
    public void removeItemById(Long id) {
        dataBase.removeIf(entry -> entry.getId().compareTo(id) == 0);
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
