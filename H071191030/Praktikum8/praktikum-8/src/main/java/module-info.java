module izzaa {
    requires javafx.controls;
    requires javafx.fxml;

    opens izzaa to javafx.fxml;
    exports izzaa;
}