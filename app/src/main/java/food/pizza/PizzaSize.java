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

    /**
     * Get the Enum value from the String
     * @param size Size of the pizza
     * @return PizzaSize enum
     */
    public static PizzaSize getValue(String size) {
        // Loop through the values
        for (PizzaSize pizzaSize : PizzaSize.values()) {
            // Check if the size matches
            if (pizzaSize.getSize().equalsIgnoreCase(size)) {
                return pizzaSize;
            }
        }

        // Return first value by default (Should never happen)
        return PizzaSize.values()[0];
    }

    public String getSize() {
        return size;
    }

    public float getPrice() {
        return price;
    }
}
