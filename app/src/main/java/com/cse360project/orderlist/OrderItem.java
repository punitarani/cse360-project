package com.cse360project.orderlist;

import food.Item;
import javafx.scene.control.Label;
import javafx.scene.control.TitledPane;
import javafx.scene.layout.VBox;

/**
 * Order Item GUI class
 */
public class OrderItem {
    public static VBox itemBox;
    private static Label nameLabel;
    private static TitledPane contentsPane;
    private static Label contentsLabel;
    private static Label priceLabel;

    private Item item;

    /**
     * Constructor
     * @param item Order item
     */
    public OrderItem(Item item) {
        this.item = item;

        // Create base item VBox
        itemBox = new VBox();
        itemBox.setPadding(new javafx.geometry.Insets(10));
        itemBox.setSpacing(5);
        itemBox.setStyle("-fx-border-color: transparent transparent black transparent; -fx-border-width: 3px;");

        // Create item name label
        nameLabel = new Label();
        itemBox.getChildren().add(nameLabel);

        // Create contents pane
        contentsPane = new TitledPane();
        contentsPane.setText("Contents");
        contentsPane.setCollapsible(true);
        contentsPane.setExpanded(false);
        contentsPane.setAnimated(true);
        contentsPane.setPadding(new javafx.geometry.Insets(0, 15, 0, 10));
        itemBox.getChildren().add(contentsPane);

        // Create contents label
        contentsLabel = new Label();
        contentsLabel.setStyle("-fx-alignment: center-right;");
        contentsPane.setContent(contentsLabel);

        // Create price label
        priceLabel = new Label();
        priceLabel.setStyle("-fx-font-weight: bold; -fx-alignment: center-right;");
        itemBox.getChildren().add(priceLabel);

        // Update labels
        update();
    }


    /**
     * Update the orderItem labels
     */
    public void update() {
        nameLabel.setText(item.getName());
        contentsLabel.setText(item.getContents());
        priceLabel.setText(String.format("$%.2f", item.getPrice()));
    }
}
