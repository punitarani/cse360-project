package user;

import order.Order;

import java.util.ArrayList;
import java.util.List;

public abstract class User {
    private final String id;
    private final ArrayList<Order> orders;

    /**
     * User constructor
     *
     * @param id User ID
     */
    protected User(String id) {
        this.id = id;
        orders = new ArrayList<>();
    }

    /**
     * @return User ID
     */
    public String getId() {
        return id;
    }

    /**
     * @return User's Orders
     */
    public List<Order> getOrders() {
        return orders;
    }

    /**
     * Add an Order to the User's list of Orders
     */
    public void addOrder(Order order) {
        orders.add(order);
    }

    /**
     * Remove an Order from the User's orders
     */
    public void removeOrder(Order order) {
        orders.remove(order);
    }
}
