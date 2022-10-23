package food;

public abstract class Item {
    // Fields
    private String name;    // name of the item
    private float price;      // price of the item
    private int quantity;   // quantity of the item

    /**
     * Item constructor
     * @param name Name of the item
     * @param price Price of the item
     * @param quantity Quantity of the item
     */
    protected Item(String name, int price, int quantity) {
        this.name     = name;
        this.price    = price;
        this.quantity = quantity;
    }

    /**
     * Item constructor
     * @see Item#Item(String, int, int)
     * Item("", 0, 0)
     */
    protected Item() {
        this("", 0, 0);
    }

    /**
     * @return String representation of the item
     */
    @java.lang.Override
    public java.lang.String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }

    // region Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    // endregion Getters and Setters
}
