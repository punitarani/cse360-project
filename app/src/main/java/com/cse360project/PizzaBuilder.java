package com.cse360project;

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

    /**
     * Initialize the Pizza Builder page
     */
    public void initialize() {
        // Initialize the choice boxes
        sizeChoiceBox.setItems(getSizes());
        crustChoiceBox.setItems(getCrusts());

        // Create the checkboxes for the toppings
        for (PizzaTopping topping : PizzaTopping.values()) {
            CheckBox toppingCheckBox = new CheckBox(topping.toString());
            toppingsVBox.getChildren().add(toppingCheckBox);
        }

        // Set the default values
        sizeChoiceBox.setValue(getSizes().get(1));
        crustChoiceBox.setValue(getCrusts().get(1));
    }

    /**
     * Get the list of sizes
     * @return ObservableList of sizes
     */
    private ObservableList<String> getSizes() {
        ArrayList<String> sizes = new ArrayList<>();

        // Iterate through PizzaSize enum
        for (PizzaSize size : PizzaSize.values()) {
            sizes.add(size.toString());
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
            crusts.add(crust.toString());
        }

        return FXCollections.observableArrayList(crusts);
    }
}
