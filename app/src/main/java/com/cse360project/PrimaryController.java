package com.cse360project;

import javafx.fxml.FXML;

import java.io.IOException;

public class PrimaryController {


    @FXML
    private void switchToSecondary() throws IOException {
        App.setMainPane("PizzaManager");
    }
}
