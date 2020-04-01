package com.vladis1350.bean;

public class Stok {

    private String nameCompany;
    private double currentPrice;
    private double minPrice;
    private double maxPrice;

    public Stok(String nameCompany, double currentPrice) {
        this.nameCompany = nameCompany;
        this.currentPrice = currentPrice;
        this.minPrice = currentPrice;
        this.maxPrice = currentPrice;
    }

    public void updatePrice(double price) {
        if (price > getMaxPrice()) {
            setMaxPrice(price);
            setCurrentPrice(price);
        } else if (price < getMinPrice()) {
            setMinPrice(price);
            setCurrentPrice(price);
        } else {
            setCurrentPrice(price);
        }
    }

    public String printInformation() {
        return "Company = '" + getNameCompany() + "' Current Price = " + getCurrentPrice() + ", Min Price = " +
        getMinPrice() + ", Max Price = " + getMaxPrice();
    }

    public String getNameCompany() {
        return nameCompany;
    }

    public double getCurrentPrice() {
        return currentPrice;
    }

    public double getMinPrice() {
        return minPrice;
    }

    public double getMaxPrice() {
        return maxPrice;
    }

    public void setCurrentPrice(double currentPrice) {
        this.currentPrice = currentPrice;
    }

    public void setMinPrice(double minPrice) {
        this.minPrice = minPrice;
    }

    public void setMaxPrice(double maxPrice) {
        this.maxPrice = maxPrice;
    }
}
