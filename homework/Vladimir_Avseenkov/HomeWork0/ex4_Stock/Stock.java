package Vladimir_Avseenkov.HomeWork0.ex4_Stock;

public class Stock {
    String name;
    double actualPrice;
    double minPrice;
    double maxPrice;

    public Stock(String name, double actualPrice) {
        this.name = name;
        this.actualPrice = actualPrice;
        this.minPrice = this.actualPrice;
        this.maxPrice = this.actualPrice;
    }

    public void updatePrice(double input) {
        this.actualPrice = input;
        if (this.actualPrice > this.maxPrice) {
            this.maxPrice = this.actualPrice;
        } else if (this.actualPrice < this.minPrice) {
            this.minPrice = this.actualPrice;
        }
    }

    public void printInformation() {
        System.out.print("Company " + this.name + ". Actual price: " + this.actualPrice);
        System.out.println(". Min | Max Price is: " + this.minPrice + " | " + this.maxPrice);
        }
}
