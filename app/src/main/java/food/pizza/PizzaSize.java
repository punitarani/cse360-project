package food.pizza;

public enum PizzaSize {
    SMALL("Small", 5),
    MEDIUM("Medium", 7),
    LARGE("Large", 9);

    private final String size;
    private final float price;

    /**
     * PizzaSize constructor
     * @param size Size of the pizza
     * @param price Price of the pizza
     */
    PizzaSize(String size, float price) {
        this.size = size;
        this.price = price;
    }

    public String getSize() {
        return size;
    }

    public float getPrice() {
        return price;
    }
}
