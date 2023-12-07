module com.example.rechteck {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.rechteck to javafx.fxml;
    exports com.example.rechteck;
}