package food.pizza;

import food.Item;

public class Pizza extends Item {
    // Fields
    private PizzaSize size;    // size of the pizza
    private PizzaCrust crust;   // crust of the pizza
    private PizzaTopping[] toppings; // toppings of the pizza

    /**
     * Pizza constructor
     * @param size size of the pizza
     * @param crust crust of the pizza
     */
    public Pizza(PizzaSize size, PizzaCrust crust, PizzaTopping[] toppings) {
        super();

        // Set the fields
        this.size = size;
        this.crust = crust;
        this.toppings = toppings;

        // Update the name and price
        this.updateItem();

        // Set the quantity to 1
        this.setQuantity(1);
    }

    /**
     * Pizza constructor
     * @see Pizza#Pizza(PizzaSize, PizzaCrust, PizzaTopping[])
     * Pizza(PizzaSize.MEDIUM, PizzaCrust.REGULAR, new PizzaTopping[]{})
     */
    public Pizza() {
        this(PizzaSize.MEDIUM, PizzaCrust.REGULAR, new PizzaTopping[]{});
    }

    /**
     * @return String representation of the Pizza
     */
    @java.lang.Override
    public java.lang.String toString() {
        return "Pizza{" +
                "name='" + getName() + '\'' +
                ", price=" + getPrice() +
                ", quantity=" + getQuantity() +
                '}';
    }

    public String getContents() {
        // Create a string builder
        StringBuilder contents = new StringBuilder();

        // Add the size
        contents.append("Size: ").append(size.getSize()).append("\n");

        // Add the crust
        contents.append("Crust: ").append(crust.getCrust()).append("\n");

        // Add the toppings
        contents.append("Toppings: ").append("\n");
        if (toppings.length > 0) {
            for (PizzaTopping topping : toppings) {
                contents.append("\t").append(topping.getTopping()).append("\n");
            }
        } else {
            contents.append("\t").append("None").append("\n");
        }

        // Return the contents
        return contents.toString();
    }

    private float calculatePrice() {
        float price = size.getPrice() + crust.getPrice();

        // Add the price of the toppings
        for (PizzaTopping topping : toppings) {
            price += topping.getPrice();
        }

        return price;
    }

    private void updatePrice() {
        float price = this.calculatePrice();
        this.setPrice(price);
    }

    private void updateName() {
        StringBuilder name = new StringBuilder();

        // Add the size
        name.append(this.size.getSize()).append(" Pizza");

        // Add the crust
        name.append(" (").append(this.crust.getCrust()).append(")");

        // Add the toppings
        if (this.toppings.length > 0) {
            name.append(" with ");

            for (PizzaTopping topping: this.toppings) {
                name.append(topping.getTopping()).append(", ");
            }

            // Remove the last ", "
            name.delete(name.length() - 2, name.length());

            // Replace the last ", " with ", and " if there are more than 1 Topping
            if (this.toppings.length > 1) {
                name.replace(name.lastIndexOf(", "), name.lastIndexOf(", ") + 2, ", and ");
            }
        }

        // Set the name
        this.setName(name.toString());
    }

    // region Getters and Setters
    public String getSize() {
        return size.getSize();
    }

    public void setSize(PizzaSize size) {
        this.size = size;
        this.updateItem();
    }

    public String getCrust() {
        return crust.getCrust();
    }

    public void setCrust(PizzaCrust crust) {
        this.crust = crust;
        this.updateItem();
    }

    public PizzaTopping[] getToppings() {
        return toppings;
    }

    public void setToppings(PizzaTopping[] toppings) {
        this.toppings = toppings;
        this.updateItem();
    }

    // endregion Getters and Setters

    // region Methods

    /**
     * Update the Name and Price of the Pizza
     */
    public void updateItem() {
        this.updateName();
        this.updatePrice();
    }

    // endregion Methods
}
