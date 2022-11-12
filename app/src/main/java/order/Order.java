package order;

import food.Item;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Order {
    private final String id;
    private final ArrayList<Item> items;
    private OrderStatus status;

    // Create a random number generator
    Random rand = new Random();

    /**
     * Order Constructor
     */
    public Order() {
        this.id = generateID();
        this.items = new ArrayList<>();
        this.status = OrderStatus.PENDING;
    }

    // region Getters and Setters

    /**
     * @return Order ID
     */
    public String getId() {
        return id;
    }

    /**
     * @return Order Items
     */
    public List<Item> getItems() {
        return items;
    }

    /**
     * @return Order Status
     */
    public OrderStatus getStatus() {
        return status;
    }

    /**
     * Set Order Status
     * @param status Order Status
     */
    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    // endregion Getters and Setters

    // region Public Methods

    /**
     * @param item Add item to order
     */
    public void addItem(Item item) {
        items.add(item);
    }

    /**
     * @param item Remove item from order
     */
    public void removeItem(Item item) {
        items.remove(item);
    }

    /**
     * Get the total price of the order
     * @return Order total
     */
    public float getTotal() {
        float cost = 0;

        for (Item item : items) {
            cost += item.getPrice();
        }

        return cost;
    }

    // endregion Public Methods

    // region Helper Methods

    /**
     * @return Randomly generated Order ID
     */
    private String generateID() {
        int len = 10;
        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";

        StringBuilder sb = new StringBuilder();

        // Generate random ID
        for (int i = 0; i < len; i++) {
            int index = rand.nextInt(chars.length());
            sb.append(chars.charAt(index));
        }

        return sb.toString();
    }

    // endregion Helper Methods
}
