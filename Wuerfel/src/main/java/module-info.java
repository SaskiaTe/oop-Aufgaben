module com.example.wuerfel {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.wuerfel to javafx.fxml;
    exports com.example.wuerfel;
}