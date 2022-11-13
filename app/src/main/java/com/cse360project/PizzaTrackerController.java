package com.cse360project;

import com.cse360project.orderlist.OrderList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;

import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import order.Order;
import order.OrderStatus;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;


public class PizzaTrackerController implements Initializable {
    @FXML
    private Label studentID;
    @FXML
    private ImageView orderReceipt;
    @FXML
    private ImageView prep;
    @FXML
    private ImageView bake;
    @FXML
    private ImageView check;
    @FXML
    private ImageView done;
    @FXML
    private ScrollPane receipt;
    @FXML
    private Label total;
    private Order order;
    private OrderList orderlist;

    public void initialize(URL url, ResourceBundle resourceBundle) {

        int n = 0;
        order = orderlist.order;
        OrderStatus process = order.getStatus();
        if (process.toString().compareTo("PENDING") == 0) {
            n = 1;
        }
        if (process.toString().compareTo("SUBMITTED") == 0) {
            n = 2;
        }
        if (process.toString().compareTo("PREPARING") == 0) {
            n = 3;
        }
        if (process.toString().compareTo("READY") == 0) {
            n = 4;
        }
        if (process.toString().compareTo("DELIVERED") == 0) {
            n = 5;
        }
        process(n);

    }

    public int process(int x) {
        orderReceipt.setVisible(true);
        if (x == 1) {
            prep.setVisible(false);
            bake.setVisible(false);
            check.setVisible(false);
            done.setVisible(false);
        }
        if (x == 2) {
            prep.setVisible(true);
            bake.setVisible(false);
            check.setVisible(false);
            done.setVisible(false);
        }
        if (x == 3) {
            prep.setVisible(true);
            bake.setVisible(true);
            check.setVisible(false);
            done.setVisible(false);
        }
        if (x == 4) {
            prep.setVisible(true);
            bake.setVisible(true);
            check.setVisible(true);
            done.setVisible(false);
        }
        if (x == 5) {
            prep.setVisible(true);
            bake.setVisible(true);
            check.setVisible(true);
            done.setVisible(true);
        }
        return x;
    }
}
