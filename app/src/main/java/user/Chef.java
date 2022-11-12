package user;

import order.Order;
import order.OrderStatus;

public class Chef extends User{

    /**
     * User constructor
     *
     * @param id User ID
     */
    protected Chef(String id) {
        super(id);
    }

    /**
     * Update the Order Status
     *
     * @param order Order to update
     * @param status New Order Status
     */
    public void updateOrderStatus(Order order, OrderStatus status) {
        order.setStatus(status);
    }
}
