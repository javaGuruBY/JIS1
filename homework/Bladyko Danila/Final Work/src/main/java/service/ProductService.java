package service;

import bean.Product;
import console.UIConsole;
import database.Shop;
import interfaces.InterfaceFromProduct;

import java.math.BigDecimal;
import java.util.LinkedList;
import java.util.List;

public class ProductService implements InterfaceFromProduct {

    UIConsole uiConsole = new UIConsole();

    @Override
    public void removeDiscount(Long id) {
        Shop.products.stream().filter(i -> i.idProduct == id).forEach(i -> i.discount = null);
    }

    @Override
    public void setProduct(Product product) {
        Shop.products.add(product);
    }

    @Override
    public void setDiscountEnumProducts(Enum category, BigDecimal newDiscount) {
        Shop.products.stream().filter(i -> i.category.equals(category)).forEach(i -> i.discount = newDiscount);
    }

    @Override
    public Product getProductById(Long id) {
        for (Product entry: Shop.products) {
            if(entry.idProduct.compareTo(id) == 0) {
                return entry;
            }
        }
        return null;
    }

    @Override
    public void removeProductById(Long id) {
        for (Product entry: Shop.products) {
            if(entry.idProduct.compareTo(id) == 0) {
                Shop.products.remove(entry);
                return;
            }
        }
        uiConsole.productNotFound();
    }

    @Override
    public void editPrice(Long id, BigDecimal newPrice) {
        Shop.products.stream().filter(i -> i.idProduct == id).forEach(i -> i.price = newPrice);
    }

    @Override
    public void editDiscount(Long id, BigDecimal newDiscount) {
        Shop.products.stream().filter(i -> i.idProduct == id).forEach(i -> i.discount = newDiscount);
    }

    @Override
    public List<Product> getListProducts() {
        return Shop.products;
    }

    @Override
    public List<Product> getListEnumProducts(Enum category) {
        List<Product> getList = new LinkedList<>();
        for (Product entry: Shop.products) {
            if(entry.category.equals(category)) {
                getList.add(entry);
            }
        }
        return getList;
    }
}
