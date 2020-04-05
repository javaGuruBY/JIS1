package service;

import bean.Product;
import database.Shop;
import enums.Category;
import interfaces.InterfaceFromProduct;
import service.methods_service.CheckCategory;
import service.methods_service.CheckIdProduct;
import service.methods_service.GetCategoryOfProduct;

import java.math.BigDecimal;
import java.util.LinkedList;
import java.util.List;

public class ProductService implements InterfaceFromProduct {

    @Override
    public void removeProductDiscountById(Long idProduct) {
        CheckIdProduct.checkId(idProduct);
        Shop.products.stream().filter(i -> i.getIdProduct() == idProduct).forEach(i -> i.setDiscount(null));
    }

    @Override
    public void setProduct(Product product) {
        Shop.products.add(product);
    }

    @Override
    public void changeDiscountEnumProducts(String category, BigDecimal newDiscount) {
        Category categoryOfProduct = GetCategoryOfProduct.getCategoryOfProduct(category);
        Shop.products.stream()
                .filter(i -> i.getCategory().equals(categoryOfProduct))
                .forEach(i -> i.setDiscount(newDiscount));
    }

    @Override
    public Product getProductById(Long idProduct) {
        CheckIdProduct.checkId(idProduct);
        for (Product entry : Shop.products) {
            if (entry.getIdProduct().compareTo(idProduct) == 0) {
                return entry;
            }
        }
        return null;
    }

    @Override
    public void removeProductById(Long idProduct) {
        CheckIdProduct.checkId(idProduct);
        for (Product entry : Shop.products) {
            if (entry.getIdProduct().compareTo(idProduct) == 0) {
                Shop.products.remove(entry);
                return;
            }
        }
    }

    @Override
    public void changeProductPriceById(Long idProduct, BigDecimal newPrice) {
        CheckIdProduct.checkId(idProduct);
        Shop.products.stream()
                .filter(i -> i.getIdProduct() == idProduct)
                .forEach(i -> i.setPrice(newPrice));
    }

    @Override
    public void changeProductDiscountById(Long idProduct, BigDecimal newDiscount) {
        CheckIdProduct.checkId(idProduct);
        Shop.products.stream()
                .filter(i -> i.getIdProduct() == idProduct)
                .forEach(i -> i.setDiscount(newDiscount));
    }

    @Override
    public List<Product> getListProducts() {
        return Shop.products;
    }

    @Override
    public List<Product> getListByEnumProducts(String category) {
        List<Product> getList = new LinkedList<>();
        for (Product entry : Shop.products) {
            CheckCategory.checkCategoryAndSetInGetList(category, entry, getList);
        }
        return getList;
    }
}