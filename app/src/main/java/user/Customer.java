package user;

import order.Order;
import order.OrderStatus;

public class Customer extends User{
    private Order order;

    /**
     * User constructor
     *
     * @param id User ID
     */
    protected Customer(String id) {
        super(id);
    }

    /**
     * Create a new Order for the Customer
     *
     * @return The new Order
     */
    public Order createOrder() {
        order = new Order();
        this.addOrder(order);
        return order;
    }

    /**
     * @return Customer's Order
     */
    public Order getOrder() {
        return order;
    }

    /**
     * Cancel the Customer's Order
     */
    public void cancelOrder() {
        this.removeOrder(order);
        order = null;
    }

    /**
     * Get the Order Status
     */
    public OrderStatus getOrderStatus() {
        if (order == null) {
            return null;
        }
        return order.getStatus();
    }
}
