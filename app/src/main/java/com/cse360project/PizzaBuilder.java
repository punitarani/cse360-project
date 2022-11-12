package com.cse360project;

import food.pizza.PizzaSize;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;

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
        for (food.pizza.PizzaCrust crust : food.pizza.PizzaCrust.values()) {
            crusts.add(crust.toString());
        }

        return FXCollections.observableArrayList(crusts);
    }
}
