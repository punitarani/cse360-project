package com.cse360project;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LoginPageController {
    //public TextField idField;
    public Button customerButton;
    public Button chefButton;

    public Label errorMessage;
    public PasswordField idField;
    private String asurite;
    public void initialize() {
        // Add event handlers
        customerButton.setOnAction(event -> customerButtonHandler());
        chefButton.setOnAction(event -> chefButtonHandler());
    }

    private void customerButtonHandler() {
        asurite = idField.getText();
        if(!asurite.isBlank()) {
            if (asurite.charAt(0) == '1' && asurite.length() == 10) {
                App.setMainPane("pizzaBuilder");
            } else {
                //Throw error message
                errorMessage.setText("Error: ASURITE NOT VALID");
            }
        }
    }

    private void chefButtonHandler() {

        asurite = idField.getText();
        if(!asurite.isBlank()) {
            if (asurite.charAt(0) == '1' && asurite.length() == 10) {
                App.setMainPane("pizzaManager");
            } else {
                //Throw error message
                errorMessage.setText("Error: ASURITE NOT VALID");
            }
        }
    }

    public String getAsurite(){
        return asurite;
    }

}
