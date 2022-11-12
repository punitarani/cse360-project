package com.cse360project;

import com.cse360project.order.Order;
import food.pizza.Pizza;
import food.pizza.PizzaCrust;
import food.pizza.PizzaSize;
import food.pizza.PizzaTopping;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

import java.util.ArrayList;

/**
 * Controller for pizzaBuilder.fxml
 */
public class PizzaBuilder {
    @FXML
    private ChoiceBox<String> sizeChoiceBox;
    @FXML
    private ChoiceBox<String> crustChoiceBox;
    @FXML
    private VBox toppingsVBox;
    @FXML
    private Button addPizzaButton;
    @FXML
    private Button placeOrderButton;
    @FXML
    private Label pizzaCost;
    @FXML
    private Label orderCost;

    private Pizza pizza;
    private Order order;

    /**
     * Initialize the Pizza Builder page
     */
    public void initialize() {
        // Initialize the choice boxes
        sizeChoiceBox.setItems(getSizes());
        crustChoiceBox.setItems(getCrusts());

        // Create the checkboxes for the toppings
        for (PizzaTopping topping : PizzaTopping.values()) {
            CheckBox toppingCheckBox = new CheckBox(topping.getTopping());

            // Set the action for the checkbox to update the pizza
            toppingCheckBox.setOnAction(event -> updatePizza());

            toppingsVBox.getChildren().add(toppingCheckBox);
        }

        // Set the default values
        sizeChoiceBox.setValue(getSizes().get(1));
        crustChoiceBox.setValue(getCrusts().get(1));

        // Initialize the pizza and order
        pizza = new Pizza();
        order = new Order();

        // Update the pizza
        updatePizza();
    }

    /**
     * Update the pizza object with the current values
     * Automatically updates the pizza cost label
     */
    private void updatePizza() {
        // Get the selected size and crust
        String size = sizeChoiceBox.getValue();
        String crust = crustChoiceBox.getValue();

        // Set the size and crust
        pizza.setSize(PizzaSize.getValue(size));
        pizza.setCrust(PizzaCrust.getValue(crust));

        // Set the toppings
        ArrayList<PizzaTopping> toppings = new ArrayList<>();
        // Get the selected toppings
        for (int i = 0; i < toppingsVBox.getChildren().size(); i++) {
            CheckBox toppingCheckBox = (CheckBox) toppingsVBox.getChildren().get(i);

            // Match the index to the Topping
            if (toppingCheckBox.isSelected()) {
                toppings.add(PizzaTopping.values()[i]);
            }
        }

        // Set the toppings
        pizza.setToppings(toppings.toArray(new PizzaTopping[0]));

        // Update the pizza cost
        pizzaCost.setText(String.format("$%.2f", pizza.getPrice()));
    }

    /**
     * Get the list of sizes
     * @return ObservableList of sizes
     */
    private ObservableList<String> getSizes() {
        ArrayList<String> sizes = new ArrayList<>();

        // Iterate through PizzaSize enum
        for (PizzaSize size : PizzaSize.values()) {
            sizes.add(size.getSize());
        }

        return FXCollections.observableArrayList(sizes);
    }

    /**
     * Get the Crust options
     * @return ObservableList of crust options
     */
    private ObservableList<String> getCrusts() {
        ArrayList<String> crusts = new ArrayList<>();

        // Iterate through PizzaCrust enum
        for (PizzaCrust crust : PizzaCrust.values()) {
            crusts.add(crust.getCrust());
        }

        return FXCollections.observableArrayList(crusts);
    }
}
