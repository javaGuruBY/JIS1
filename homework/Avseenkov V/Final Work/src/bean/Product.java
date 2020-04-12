package bean;

import stat.Messages;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicLong;

public class Product implements Serializable {
    private String name;
    private Long id; //todo use atomic long
    private static AtomicLong globalID = new AtomicLong(0);
    private BigDecimal price;
    private Enum category;
    private BigDecimal discount;
    private BigDecimal actualPrice;
    private String description;

    public Product() {
    }

    public Product(String name, BigDecimal price, Enum category) {
        this.id = globalID.incrementAndGet();
        this.name = name;
        this.price = price;
        this.category = category;
        this.description = Messages.NO_DESCRIPTION;
        this.discount = new BigDecimal(0);
        this.actualPrice = this.price;
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
        this.actualPrice = this.price.subtract(discount.multiply(this.price).movePointLeft(2));
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
                ", category=" + category +
                ", regular price=" + price +
                ", discount=" + discount +
                ", actual price=" + actualPrice +
                ", description=" + description;
    }
}
