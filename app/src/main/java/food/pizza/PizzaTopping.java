package food.pizza;

public enum PizzaTopping {
    // Toppings sorted alphabetically
    BACON("Bacon", 1),
    CHICKEN("Chicken", 1),
    EXTRA_CHEESE("Extra Cheese", 1),
    GREEN_PEPPERS("Green Peppers", 1),
    JALAPENO("Jalapeno", 1),
    HAM("Ham", 1),
    MUSHROOMS("Mushrooms", 1),
    OLIVES("Olives", 1),
    ONIONS("Onions", 1),
    PEPPERONI("Pepperoni", 1),
    PINEAPPLE("Pineapple", 1),
    SAUSAGE("Sausage", 1);

    // Fields
    private final String topping;
    private final float price;

    /**
     * PizzaTopping constructor
     * @param topping Topping name
     * @param price Price of the topping
     */
    PizzaTopping(String topping, float price) {
        this.topping = topping;
        this.price = price;
    }

    /**
     * @return Topping name
     */
    public String getTopping() {
        return topping;
    }

    /**
     * @return Topping price
     */
    public float getPrice() {
        return price;
    }
}
