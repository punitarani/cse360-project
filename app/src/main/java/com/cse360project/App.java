package com.cse360project;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * JavaFX App
 */
public class App extends Application {

    public static Pane mainPane;
    public static Pane headerPane;
    private static Scene scene;

    /**
     * Load the components of the app
     */
    public static void loadComponents() {
        mainPane = (Pane) scene.lookup("#mainPane");
        headerPane = (Pane) scene.lookup("#headerPane");
    }

    /**
     * Set the main pane (#mainPane in app.fxml)
     * @param fxml The fxml file to load
     * @throws IOException If the fxml file is not found
     */
    static void setMainPane(String fxml) {
        mainPane.getChildren().clear();

        try {
            mainPane.getChildren().add(loadFXML(fxml));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Set the header pane (#headerPane in app.fxml)
     * @param fxml The fxml file to load
     * @throws IOException If the fxml file is not found
     */
    static void setHeaderPane(String fxml) throws IOException {
        headerPane.getChildren().clear();
        headerPane.getChildren().add(loadFXML(fxml));
    }

    /**
     * Load the FXML file
     *
     * @param fxml FXML file to load (relative to app\src\main\resources\com.cse360project\ and without .fxml extension)
     * @return Parent object
     *
     * @throws IOException if the file cannot be found
     */
    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }

    public static void main(String[] args) {
        launch();
    }

    /**
     * Starts the application
     *
     * @param stage the primary stage for this application, onto which the application scene can be set.
     * Applications may create other stages, if needed, but they will not be primary stages.
     *
     * @throws IOException if any of the FXML files cannot be loaded.
     */
    @Override
    public void start(Stage stage) throws IOException {
        scene = new Scene(loadFXML("app"), 640, 480);
        scene.setFill(Color.TRANSPARENT);

        loadComponents();
        setMainPane("loginPage");
        setHeaderPane("components/header");

        stage.setTitle("ASU Group 48 Pizza Kitchen");
        stage.setScene(scene);
        stage.show();
    }

}
