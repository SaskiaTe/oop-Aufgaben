module com.example.tanne {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.tanne to javafx.fxml;
    exports com.example.tanne;
}