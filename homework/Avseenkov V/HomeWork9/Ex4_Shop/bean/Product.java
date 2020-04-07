package bean;

import java.io.Serializable;
import java.math.BigDecimal;

public class Product implements Serializable {

    private String name;
    private BigDecimal price;

    public String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    private void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Product(String name, BigDecimal price) {
        this.name = name;
        this.price = price;
    }

    public Product() {
    }
}

