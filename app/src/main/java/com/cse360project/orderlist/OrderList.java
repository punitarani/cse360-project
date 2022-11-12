package com.cse360project.orderlist;

import food.Item;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Priority;
import javafx.scene.layout.RowConstraints;
import order.Order;

import java.util.ArrayList;

/**
 * OrderList displays a grid of OrderItems
 */
public class OrderList {
    public GridPane orderListPane;

    public Order order;
    private ArrayList<OrderItem> orderItems;

    /**
     * Constructor for OrderList
     * @param order The order to display
     */
    public OrderList(Order order) {
        this.order = order;
        orderItems = new ArrayList<>();

        ColumnConstraints columnConstraints = new ColumnConstraints();
        columnConstraints.setHgrow(Priority.NEVER);
        columnConstraints.setPercentWidth(100.00);

        RowConstraints rowConstraints = new RowConstraints();
        rowConstraints.setVgrow(Priority.NEVER);

        orderListPane = new GridPane();
        orderListPane.getRowConstraints().add(rowConstraints);
        orderListPane.getColumnConstraints().add(columnConstraints);
        orderListPane.setHgap(10);
        orderListPane.setVgap(10);

        // Parse all the order items
        for (Item item : order.getItems()) {
            addItem(item);
        }
    }

    /**
     * Add an item to the order list
     * @param item The item to add
     */
    public void addItem(Item item) {
        order.addItem(item);

        // Create OrderItem GUI element
        OrderItem orderItem = new OrderItem(item);

        // Create a new row in the grid pane and add the orderItem
        OrderItem.itemBox.prefWidthProperty().bind(orderListPane.widthProperty().subtract(10));
        orderListPane.add(OrderItem.itemBox, 0, orderItems.size());

        orderItems.add(orderItem);
    }
}
