package food.pizza;

public enum PizzaCrust {
    THIN("Thin", 0),
    REGULAR("Regular", 0),
    THICK("Thick", 0),
    CHEESE("Cheese", 2);

    private final String crust;
    private final float price;

    /**
     * PizzaCrust constructor
     * @param crust Crust type
     * @param price Additional price for the crust
     */
    PizzaCrust(String crust, float price) {
        this.crust = crust;
        this.price = price;
    }

    /**
     * Get the Enum value from the String
     * @param crust Crust type
     * @return PizzaCrust enum
     */
    public static PizzaCrust getValue(String crust) {
        // Loop through the values
        for (PizzaCrust pizzaCrust : PizzaCrust.values()) {
            // Check if the crust matches
            if (pizzaCrust.getCrust().equalsIgnoreCase(crust)) {
                return pizzaCrust;
            }
        }

        // Return first value by default (Should never happen)
        return PizzaCrust.values()[0];
    }

    public String getCrust() {
        return crust;
    }

    public float getPrice() {
        return price;
    }
}
