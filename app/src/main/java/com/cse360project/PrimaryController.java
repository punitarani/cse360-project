package com.cse360project;

import javafx.fxml.FXML;

public class PrimaryController {


    @FXML
    private void switchToSecondary() {
        App.setMainPane("loginPage");
    }
}
