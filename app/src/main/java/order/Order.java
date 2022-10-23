package order;

import food.Item;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Order {
    private final String id;
    private final ArrayList<Item> items;

    // Create a random number generator
    Random rand = new Random();

    /**
     * Order Constructor
     */
    public Order() {
        this.id = generateID();
        this.items = new ArrayList<>();
    }

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
}
