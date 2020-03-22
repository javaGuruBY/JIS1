package bean;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Objects;

public class Product implements Serializable {
    static Long id = Long.valueOf(0);
    public Long idProduct;
    public Category category;
    protected String name;
    protected String description;
    public BigDecimal price;
    public BigDecimal discount;

    public Product() {
    }

    public Product(Category category, String name, BigDecimal price) {
        this.category = category;
        this.name = name;
        this.price = price;
        this.idProduct = id++;
    }

    public enum Category {
        PIZZA("Pizza"),
        ICE("Ice");

        private final String newCategory;

        Category(String newCategory) {
            this.newCategory = newCategory;
        }

        public String getNewCategory() {
            return newCategory;
        }
    }

    public void lessId() {
        this.idProduct--;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
                Objects.equals(name, product.name) &&
                Objects.equals(description, product.description) &&
                Objects.equals(price, product.price) &&
                Objects.equals(discount, product.discount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idProduct, category, name, description, price, discount);
    }

    @Override
    public String toString() {
        return "Product information:" +
                "\nId = " + idProduct +
                "\nName = " + name +
                "\nDescription = " + description +
                "\nPrice = " + price +
                "\nDiscount = " + discount + "\n";
    }
}
