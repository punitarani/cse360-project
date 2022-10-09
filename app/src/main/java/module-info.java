module com.cse360project {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.cse360project to javafx.fxml;
    exports com.cse360project;
}
