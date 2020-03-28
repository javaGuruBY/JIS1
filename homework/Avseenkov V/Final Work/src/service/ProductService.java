package service;

import bean.Product;
import interfaces.ProductInterface;

import java.math.BigDecimal;
import java.util.List;

import static database.InMemoryDataBase.dataBase;

public class ProductService implements ProductInterface {
    @Override
    public void setItem(Product product) {
        dataBase.add(product);
    }

    @Override
    public void editItemPrice(Long id, BigDecimal newPrice) {
        dataBase.stream()
                .filter(i -> i.getId() == id)
                .forEach(i -> i.setPrice(newPrice));
    }

    @Override
    public void setItemDiscount(Long id, BigDecimal newDiscount) {
        dataBase.stream()
                .filter(i -> i.getId() == id)
                .forEach(i -> i.setDiscount(newDiscount));
    }

    @Override
    public void editItemDescription(Long id, String description) {
        dataBase.stream()
                .filter(i -> i.getId() == id)
                .forEach(i -> i.setDescription(description));
    }

    @Override
    public void removeItemById(Long id) {
        for (Product entry : dataBase) {
            if (entry.getId().compareTo(id) == 0) {
                dataBase.remove(entry);
            }
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
