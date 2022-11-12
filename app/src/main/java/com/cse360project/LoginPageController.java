package com.cse360project;

import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class LoginPageController {
    public TextField idField;
    public Button customerButton;
    public Button chefButton;

    public void initialize() {
        // Add event handlers
        customerButton.setOnAction(event -> customerButtonHandler());
        chefButton.setOnAction(event -> chefButtonHandler());
    }

    private void customerButtonHandler() {
        App.setMainPane("pizzaBuilder");
    }

    private void chefButtonHandler() {
        App.setMainPane("pizzaManager");
    }
}
