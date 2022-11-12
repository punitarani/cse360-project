package order;

import food.pizza.Pizza;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class OrderTests {
    Order order = new Order();

    @Test
    void testOrderInit() {
        assertEquals(10, order.getId().length());
        assertEquals(0, order.getItems().size());
        assertEquals(0, order.getTotal());
        assertEquals(OrderStatus.PENDING, order.getStatus());
    }

    @Test
    void testOrderStatus() {
        order.setStatus(OrderStatus.PREPARING);
        assertEquals(OrderStatus.PREPARING, order.getStatus());
    }

    @Test
    void testAddItem() {
        Pizza pizza = new Pizza();
        order.addItem(pizza);
        assertEquals(1, order.getItems().size());
        assertEquals(pizza.getPrice(), order.getTotal());
        assertEquals(pizza, order.getItems().get(0));
    }

    @Test
    void testRemoveItem() {
        Pizza pizza = new Pizza();
        order.addItem(pizza);
        assertEquals(1, order.getItems().size());
        assertEquals(pizza.getPrice(), order.getTotal());
        order.addItem(pizza);
        assertEquals(2, order.getItems().size());
        assertEquals(pizza.getPrice() * 2, order.getTotal());
        order.removeItem(pizza);
        assertEquals(1, order.getItems().size());
        assertEquals(pizza.getPrice(), order.getTotal());
        order.removeItem(pizza);
        assertEquals(0, order.getItems().size());
        assertEquals(0, order.getTotal());
    }
}
