package enums;

public enum Category {
    PIZZA("Pizza"),
    ICE("Ice"),
    BOTTLE("Bottle");

    private final String newCategory;

    Category(String newCategory) {
        this.newCategory = newCategory;
    }

    public String getNewCategory() {
        return newCategory;
    }
}
