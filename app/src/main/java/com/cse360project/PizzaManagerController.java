package com.cse360project;

import javafx.fxml.FXML;

import java.io.IOException;
import javafx.scene.control.ProgressBar;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.MenuButton;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;


public class PizzaManagerController {
    
    @FXML
    private ProgressBar currStatus;
    @FXML
    private Button revertButton;
    @FXML
    private Button nextStatButton;
    //double progress = 0;
    double[] progress;
    int custnum = 0;
    @FXML
    private TextArea contents;
    @FXML
    private TextArea orderStatusTextArea;
    private MenuButton leave;

    @FXML
    private Button Order1;
    @FXML
    private Button Order2;
    @FXML
    private Button Order3;
    @FXML
    private Button Order4;
    @FXML
    private Button Order5;
    @FXML
    private Button Order6;


    public void initialize() {
        progress = new double[6];
        for(int i =0; i< progress.length; i++) {
            progress[i] = 0;
        }
        currStatus.setStyle("-fx-accent: green");


    }

    @FXML
    private void switchToSecondary() throws IOException {
        App.setMainPane("primary");
    }
    

    public void Revert() throws IOException{
        if(progress[custnum] >= 1) {
            orderStatusTextArea.setText("Customer order status");
        }
        progress[custnum] -= 0.34;
        if(progress[custnum] < 0) {
            progress[custnum] = 0;
        }
        currStatus.setProgress(progress[custnum]);
    }
    
    public void NextStat() throws IOException{
        progress[custnum] += 0.34;
        if(progress[custnum] >= 1) {
            progress[custnum] =1;
            orderStatusTextArea.setText("Customer Order Complete!\nSending a notification to the\n customer.");
        }
        currStatus.setProgress(progress[custnum]);
    }
    
    public void Cust1() throws IOException{
        custnum = 0;
        contents.setText("Customer 1 pizza contents");
        if(progress[custnum] >= 1) {
            orderStatusTextArea.setText("Customer Order Complete!\nSending a notification to the\n customer.");
        }
        else {
            orderStatusTextArea.setText("Customer 1 order status");
        }
        currStatus.setProgress(progress[custnum]);
    }
    public void Cust2() throws IOException{
        custnum = 1;
        contents.setText("Customer 2 pizza contents");
        if(progress[custnum] >= 1) {
            orderStatusTextArea.setText("Customer Order Complete!\nSending a notification to the\n customer.");
        }
        else {
            orderStatusTextArea.setText("Customer 2 order status");
        }
        currStatus.setProgress(progress[custnum]);
    }
    public void Cust3() throws IOException{
        custnum = 2;
        contents.setText("Customer 3 pizza contents");
        if(progress[custnum] >= 1) {
            orderStatusTextArea.setText("Customer Order Complete!\nSending a notification to the\n customer.");
        }
        else {
            orderStatusTextArea.setText("Customer 3 order status");
        }
        currStatus.setProgress(progress[custnum]);
    }
    public void Cust4() throws IOException{
        custnum = 3;
        contents.setText("Customer 4 pizza contents");
        if(progress[custnum] >= 1) {
            orderStatusTextArea.setText("Customer Order Complete!\nSending a notification to the\n customer.");
        }
        else {
            orderStatusTextArea.setText("Customer 4 order status");
        }
        currStatus.setProgress(progress[custnum]);
    }
    public void Cust5() throws IOException{
        custnum = 4;
        contents.setText("Customer 5 pizza contents");
        if(progress[custnum] >= 1) {
            orderStatusTextArea.setText("Customer Order Complete!\nSending a notification to the\n customer.");
        }
        else {
            orderStatusTextArea.setText("Customer 5 order status");
        }
        currStatus.setProgress(progress[custnum]);
    }
    public void Cust6() throws IOException{
        custnum = 5;
        contents.setText("Customer 6 pizza contents");
        if(progress[custnum] >= 1) {
            orderStatusTextArea.setText("Customer Order Complete!\nSending a notification to the\n customer.");
        }
        else {
            orderStatusTextArea.setText("Customer 6 order status");
        }
        currStatus.setProgress(progress[custnum]);
    }

    public void ReturnLogin() throws IOException{
        App.setMainPane("primary");
    }

}