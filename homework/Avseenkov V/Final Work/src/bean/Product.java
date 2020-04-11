package bean;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Objects;

public class Product implements Serializable {
    private String name;
    private Long id; //todo use atomic long
    private static long nextId = 0;
    private BigDecimal price;
    private Enum category;
    private BigDecimal discount;
    private String description;

    public Product() {
    }

    public Product(String name, BigDecimal price, Enum category) {
        this.id = nextId;
        nextId++;
        this.name = name;
        this.price = price;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public Long getId() {
        return id;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public Enum getCategory() {
        return category;
    }

    public BigDecimal getDiscount() {
        return discount;
    }

    public String getDescription() {
        return description;
    }

    private void setName(String name) {
        this.name = name;
    }

    private void setId(Long id) {
        this.id = id;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    private void setCategory(Enum category) {
        this.category = category;
    }

    public void setDiscount(BigDecimal discount) {
        this.discount = discount;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return name.equals(product.name) &&
                price.equals(product.price) &&
                category.equals(product.category) &&
                Objects.equals(discount, product.discount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price, category, discount);
    }

    @Override
    public String toString() {
        return "Product " +
                "id=" + id +
                ", name=" + name + '\'' +
                ", price=" + price +
                ", category=" + category +
                ", discount=" + discount +
                ", description=" + description;
    }
}
