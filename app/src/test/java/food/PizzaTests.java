package food;


import food.pizza.Pizza;
import food.pizza.PizzaCrust;
import food.pizza.PizzaSize;
import food.pizza.PizzaTopping;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PizzaTests {

    private final Pizza pizza = new Pizza();

    @Test
    void testPizzaInit() {
        // Default constructor
        assertEquals("Medium", pizza.getSize());
        assertEquals("Regular", pizza.getCrust());
        assertEquals(7, pizza.getPrice());
        assertEquals(0, pizza.getToppings().length);
        assertEquals("Medium Pizza (Regular)", pizza.getName());
        assertEquals(1, pizza.getQuantity());

        // Constructor with parameters
        // Create toppings
        PizzaTopping[] toppings = new PizzaTopping[]{
                PizzaTopping.BACON,
                PizzaTopping.CHICKEN,
                PizzaTopping.EXTRA_CHEESE,
                PizzaTopping.JALAPENO,
                PizzaTopping.MUSHROOMS,
                PizzaTopping.ONIONS,
                PizzaTopping.PEPPERONI,
                PizzaTopping.SAUSAGE,
        };
        Pizza pizza_supreme = new Pizza(PizzaSize.LARGE, PizzaCrust.THICK, toppings);
        assertEquals("Large", pizza_supreme.getSize());
        assertEquals("Thick", pizza_supreme.getCrust());
        assertEquals(17, pizza_supreme.getPrice());
        assertEquals(8, pizza_supreme.getToppings().length);
        assertEquals(
                "Large Pizza (Thick) with Bacon, Chicken, Extra Cheese, Jalapeno, Mushrooms, Onions, Pepperoni, and Sausage",
                pizza_supreme.getName()
        );
    }

    @Test
    void testPizzaToString() {
        assertEquals("Pizza{name='Medium Pizza (Regular)', price=7.0, quantity=1}", pizza.toString());
    }

    @Test
    void testSetters() {
        Pizza pizza = this.pizza;

        // Set size
        pizza.setSize(PizzaSize.SMALL);
        assertEquals("Small", pizza.getSize());
        assertEquals(5, pizza.getPrice());
        assertEquals("Small Pizza (Regular)", pizza.getName());

        // Set crust
        pizza.setCrust(PizzaCrust.CHEESE);
        assertEquals("Cheese", pizza.getCrust());
        assertEquals(7, pizza.getPrice());
        assertEquals("Small Pizza (Cheese)", pizza.getName());

        // Set quantity
        pizza.setQuantity(2);
        assertEquals(2, pizza.getQuantity());

        // Set toppings
        PizzaTopping[] toppings = new PizzaTopping[]{
                PizzaTopping.GREEN_PEPPERS,
                PizzaTopping.HAM,
                PizzaTopping.OLIVES,
                PizzaTopping.PINEAPPLE,
        };
        pizza.setToppings(toppings);
        assertEquals(4, pizza.getToppings().length);
        assertEquals(11, pizza.getPrice());
        assertEquals(
                "Small Pizza (Cheese) with Green Peppers, Ham, Olives, and Pineapple",
                pizza.getName()
        );
    }
}
