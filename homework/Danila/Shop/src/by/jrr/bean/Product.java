package by.jrr.bean;

import java.math.BigDecimal;
import java.util.Objects;

public class Product {
    private String nameProduct;
    private BigDecimal priceOfProduct;

    public Product(String nameProduct, BigDecimal priceOfProduct) {
        this.nameProduct = nameProduct;
        this.priceOfProduct = priceOfProduct;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public BigDecimal getPriceOfProduct() {
        return priceOfProduct;
    }

    public void setPriceOfProduct(BigDecimal priceOfProduct) {
        this.priceOfProduct = priceOfProduct;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(nameProduct, product.nameProduct) &&
                Objects.equals(priceOfProduct, product.priceOfProduct);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameProduct, priceOfProduct);
    }

    @Override
    public String toString() {
        return "Product{" +
                "nameProduct='" + nameProduct + '\'' +
                ", priceOfProduct=" + priceOfProduct +
                '}';
    }
}
