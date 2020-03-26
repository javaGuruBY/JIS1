package com.company.repository;

import com.company.bean.Product;
import com.company.enums.Category;
import com.company.interfaces.MapInterface;
import com.company.menuString.MenuString;
import com.company.service.MenuService;

import java.math.BigDecimal;
import java.math.MathContext;
import java.util.HashMap;
import java.util.Map;

import static com.company.service.MenuService.returnDiscount;
import static com.company.service.MenuService.returnInt;

public class EmbeddedProductDataBase extends HashMap<Long, Product> implements MapInterface {

    Product[] product = new Product[10];
    static private int productNumber, number = 0;
    static BigDecimal discount = new BigDecimal("0");
    static Long productCountLong = 0l;

    @Override
    public int getMapSize() {
        return productMap.size();
    }

    @Override
    public void addProduct(Long id, String name) {
        productMap.put(id, name);
    }

    @Override
    public void updateProduct() {
        while (true) {
            System.out.println(MenuString.CHOOSE_TYPE_CHANGE + "\n" + "5.Exit\n");
            switch (returnInt()) {
                case 1:
                    changeName();
                    break;
                case 2:
                    changePrice();
                    break;
                case 3:
                    changeDiscount();
                    break;
                case 4:
                    changeDescription();
                    break;
                case 5:
                    return;

            }
        }
    }

    @Override
    public void readProduct() {
        System.out.println("Product's id" + productMap.keySet());
        System.out.println("Product's name" + productMap.values());
    }

    @Override
    public void deleteProduct() {
        System.out.println(MenuString.ENTER_ID);
        productMap.remove(MenuService.returnId());
        System.out.println(MenuString.SUCCESSFULLY_DELETED);
    }

    @Override
    public void checkProduct() {
        System.out.println(MenuString.ENTER_NAME);
        productMap.get(MenuService.returnName());
    }

    @Override
    public void findProduct() {
        System.out.println(MenuString.ENTER_ID);
        int productNumberToReturnProduct = Math.toIntExact(MenuService.returnId());
        takeProduct(productNumberToReturnProduct);
    }

    public void takeProduct(int num){
        BigDecimal actualPrice;
        MathContext mc = new MathContext(2);
        BigDecimal discountAmount = new BigDecimal(String.valueOf(product[num].getPrice()
                .multiply(product[num].getDiscount(), mc)));
        actualPrice = new BigDecimal(String.valueOf(product[num].getPrice().subtract(discountAmount)));
        System.out.println("Name: " + product[num].getName());
        System.out.println("ID: " + product[num].getId());
        System.out.println("Price: " + product[num].getPrice());
        System.out.println("Discount: " + product[num].getDiscount());
        System.out.println("Description: " + product[num].getDescription());
        System.out.println("Actual price: " + actualPrice);
        System.out.println("Category: " + product[num].getCategoryList() + "\n");
    }

    public void enterProduct() {
        product[productNumber] = new Product();
        System.out.println(MenuString.ENTER_NAME);
        product[productNumber].setName(MenuService.returnName());
        product[productNumber].setId(productNumber);
        System.out.println(MenuString.ENTER_PRICE);
        product[productNumber].setPrice(MenuService.returnPrice());
        System.out.println(MenuString.ENTER_DISCOUNT);
        product[productNumber].setDiscount(MenuService.returnDiscount());
        System.out.println(MenuString.ENTER_DESCRIPTION);
        product[productNumber].setDescription(MenuService.returnDescription());
        System.out.println(MenuString.ENTER_CATEGORY);
        System.out.println(MenuString.CHOOSE_CATEGORY_LIST);
        product[productNumber].setCategoryList(Category.chooseCategory(returnInt()));
        addProduct(productCountLong, product[productNumber].getName());
        productNumber++;
        productCountLong++;
        System.out.println(MenuString.PRODUCT_SUCCESSFULLY_ADDED);
    }

    public void filtration(int typeOfFiltration) {
        switch (typeOfFiltration) {
            case 1:
                System.out.println("Id|Name");
                productMap.entrySet().stream()
                        .sorted(Map.Entry.<Long, String>comparingByKey())
                        .forEach(System.out::println);
                break;
            case 2:
                System.out.println("Id|Name");
                productMap.entrySet().stream()
                        .sorted(Map.Entry.<Long, String>comparingByValue())
                        .forEach(System.out::println);
                break;
            case 3:
                System.out.println("Id|Name");
                productMap.entrySet().stream()
                        .sorted(Map.Entry.<Long, String>comparingByKey().reversed())
                        .forEach(System.out::println);
                break;
            case 4:
                System.out.println("Id|Name");
                productMap.entrySet().stream()
                        .sorted(Map.Entry.<Long, String>comparingByValue().reversed())
                        .forEach(System.out::println);
                break;
            case 5:
                return;
            default:
                System.out.println("Choose number between 1-4");
                break;
        }
    }

    public void changeName() {
        System.out.println(MenuString.ENTER_ID);
        number = returnInt();
        System.out.println(MenuString.ENTER_NAME);
        product[number].setName(MenuService.returnName());
        productMap.replace((long) number, product[number].getName());
        System.out.println(MenuString.SUCCESSFULLY_CHANGES);
    }

    public void changePrice() {
        System.out.println(MenuString.ENTER_ID);
        number = returnInt();
        System.out.println(MenuString.ENTER_PRICE);
        product[number].setPrice(MenuService.returnPrice());
        System.out.println(MenuString.SUCCESSFULLY_CHANGES);

    }

    public void changeDiscount() {
        System.out.println(MenuString.ENTER_ID);
        number = returnInt();
        System.out.println(MenuString.ENTER_DISCOUNT);
        product[number].setPrice(MenuService.returnDiscount());
        System.out.println(MenuString.SUCCESSFULLY_CHANGES);

    }

    public void changeDescription() {
        System.out.println(MenuString.ENTER_ID);
        number = returnInt();
        System.out.println(MenuString.ENTER_DESCRIPTION);
        product[number].setDescription(MenuService.returnDescription());
        System.out.println(MenuString.SUCCESSFULLY_CHANGES);
    }

    public void findProductByCategory(){
        System.out.println(MenuString.ENTER_CATEGORY);
        System.out.println(MenuString.CHOOSE_CATEGORY_LIST);
        number = returnInt();
        for (int i = 0; i <productMap.size() ; i++) {
            if(product[i].getCategoryList().equals(Category.chooseCategory(number))){
            takeProduct(i);
            }
        }
    }

    public void setDiscountToCategory(){
        System.out.println(MenuString.ENTER_CATEGORY);
        System.out.println(MenuString.CHOOSE_CATEGORY_LIST);
        number = returnInt();
        System.out.println(MenuString.ENTER_DISCOUNT);
        discount = returnDiscount();
        for (int i = 0; i <productMap.size() ; i++) {
            if(product[i].getCategoryList().equals(Category.chooseCategory(number))){
                product[i].setDiscount(discount);
            }
        }
        System.out.println(MenuString.SUCCESSFULLY_CHANGES);
    }
}
