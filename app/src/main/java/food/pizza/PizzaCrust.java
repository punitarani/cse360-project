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

    public String getCrust() {
        return crust;
    }

    public float getPrice() {
        return price;
    }
}
