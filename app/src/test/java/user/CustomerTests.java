package user;

import order.Order;
import order.OrderStatus;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class CustomerTests {
    Customer customer = new Customer("1234567890");

    @Test
    void testInit() {
        assertEquals("1234567890", customer.getId());
        assertEquals(0, customer.getOrders().size());
    }

    @Test
    void testCreateOrder() {
        Order order = customer.createOrder();
        assertEquals(1, customer.getOrders().size());
        assertEquals(order, customer.getOrder());
        assertEquals(OrderStatus.PENDING, customer.getOrderStatus());
    }

    @Test
    void testCancelOrder() {
        customer.cancelOrder();
        assertNull(customer.getOrder());
        assertEquals(0, customer.getOrders().size());
        assertNull(customer.getOrderStatus());
    }
}
