package com.cse360project;

import javafx.fxml.FXML;

public class SecondaryController {

    @FXML
    private void switchToPrimary() {
        App.setMainPane("primary");
    }
}
