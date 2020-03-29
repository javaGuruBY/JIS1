package service;

import bean.Product;
import console.ProductSection;
import database.Shop;
import enums.Category;
import interfaces.InterfaceFromProduct;
import service.methods_service.CheckIDProduct;
import stat.UIConsoleString;

import java.math.BigDecimal;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class ProductService implements InterfaceFromProduct {

    @Override
    public void removeProductDiscountById(Long idProduct) {
        checkId(idProduct);
        Shop.products.stream().filter(i -> i.getIdProduct() == idProduct).forEach(i -> i.setDiscount(null));
    }

    @Override
    public void setProduct(Product product) {
        Shop.products.add(product);
    }

    @Override
    public void changeDiscountEnumProducts(Category category, BigDecimal newDiscount) {
        Shop.products.stream()
                .filter(i -> i.getCategory().equals(category))
                .forEach(i -> i.setDiscount(newDiscount));
    }

    @Override
    public Product getProductById(Long idProduct) {
        checkId(idProduct);
        for (Product entry : Shop.products) {
            if (entry.getIdProduct().compareTo(idProduct) == 0) {
                return entry;
            }
        }
        return null;
    }

    @Override
    public void removeProductById(Long idProduct) {
        checkId(idProduct);
        for (Product entry : Shop.products) {
            if (entry.getIdProduct().compareTo(idProduct) == 0) {
                Shop.products.remove(entry);
                return;
            }
        }
    }

    @Override
    public void changeProductPriceById(Long idProduct, BigDecimal newPrice) {
        checkId(idProduct);
        Shop.products.stream()
                .filter(i -> i.getIdProduct() == idProduct)
                .forEach(i -> i.setPrice(newPrice));
    }

    @Override
    public void changeProductDiscountById(Long idProduct, BigDecimal newDiscount) {
        checkId(idProduct);
        Shop.products.stream()
                .filter(i -> i.getIdProduct() == idProduct)
                .forEach(i -> i.setDiscount(newDiscount));
    }

    @Override
    public List<Product> getListProducts() {
        return Shop.products;
    }

    @Override
    public List<Product> getListEnumProducts(Enum category) {
        List<Product> getList = new LinkedList<>();
        for (Product entry : Shop.products) {
            if (entry.getCategory().equals(category)) {
                getList.add(entry);
            }
        }
        return getList;
    }

    private void checkId(Long idProduct) {
        if(!CheckIDProduct.checkID(idProduct)) {
            System.out.println(UIConsoleString.ERROR_ID_PRODUCT);
            ProductSection.productSection();
        }
    }
}
