module com.example.reisedauermond {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.reisedauermond to javafx.fxml;
    exports com.example.reisedauermond;
}