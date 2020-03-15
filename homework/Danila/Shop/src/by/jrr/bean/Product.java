package by.jrr.bean;

import java.math.BigDecimal;
import java.util.Objects;

public class Product {
    private String nameProduct;
    private BigDecimal bigDecimal;

    public Product(String nameProduct, BigDecimal bigDecimal) {
        this.nameProduct = nameProduct;
        this.bigDecimal = bigDecimal;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public BigDecimal getBigDecimal() {
        return bigDecimal;
    }

    public void setBigDecimal(BigDecimal bigDecimal) {
        this.bigDecimal = bigDecimal;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(nameProduct, product.nameProduct) &&
                Objects.equals(bigDecimal, product.bigDecimal);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameProduct, bigDecimal);
    }

    @Override
    public String toString() {
        return "Product{" +
                "nameProduct='" + nameProduct + '\'' +
                ", bigDecimal=" + bigDecimal +
                '}';
    }
}
