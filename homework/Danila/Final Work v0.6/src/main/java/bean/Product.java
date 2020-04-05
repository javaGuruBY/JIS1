package bean;

import enums.Category;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Objects;

public class Product implements Serializable {
    private static Long id = 0l;
    private Long idProduct;
    private String nameProduct;
    private Category category;
    private String description;
    private BigDecimal price;
    private BigDecimal discount;

    public Product() {
    }

    public Product(Category category, String name, BigDecimal price) {
        this.category = category;
        this.nameProduct = name;
        this.price = price;
        idProduct = id++;
    }

    public Product(String nameProduct, Category category, String description, BigDecimal price, BigDecimal discount) {
        this.nameProduct = nameProduct;
        this.category = category;
        this.description = description;
        this.price = price;
        this.discount = discount;
        idProduct = id++;
    }

    public Long getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(Long idProduct) {
        this.idProduct = idProduct;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getDiscount() {
        return discount;
    }

    public void setDiscount(BigDecimal discount) {
        this.discount = discount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(idProduct, product.idProduct) &&
                category == product.category &&
                Objects.equals(nameProduct, product.nameProduct) &&
                Objects.equals(description, product.description) &&
                Objects.equals(price, product.price) &&
                Objects.equals(discount, product.discount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idProduct, category, nameProduct, description, price, discount);
    }

    @Override
    public String toString() {
        return "Product information:" +
                "\nId = " + idProduct +
                "\nName = " + nameProduct +
                "\nDescription = " + description +
                "\nPrice = " + price +
                "\nDiscount = " + discount + "\n";
    }
}
