package user;

import order.Order;
import order.OrderStatus;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ChefTests {
    Chef chef = new Chef("1234567890");

    @Test
    void testInit() {
        assertEquals("1234567890", chef.getId());
        assertEquals(0, chef.getOrders().size());
    }

    @Test
    void testUpdateOrderStatus() {
        Order order = new Order();
        chef.addOrder(order);
        chef.updateOrderStatus(order, OrderStatus.READY);
        assertEquals(OrderStatus.READY, order.getStatus());
    }
}
