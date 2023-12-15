package com.example.warenkorb;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.image.ImageView;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class WarenkorbController {

    @FXML
    ComboBox<Product> comboBoxProducts;

    @FXML
    Spinner<Integer> spinnerAnzahl;

    @FXML
    private TextField WarenkorbAnzahl;

    @FXML
    ImageView imageViewWagen;

    @FXML
    protected void onBeendenButtonClick() {
        System.exit(0);
    }

    @FXML
    protected void onAddButtonClick() {

    }

    public WarenkorbController() {

    }

    @FXML
    private void initialize(){
        fillComboBox();
    }

    @FXML
    private void fillComboBox() {
        String connectionString = "jdbc:sqlserver://mssql1.webland.ch;encrypt=true;databaseName=d041e_blj;user=d041e_blj;password=BljDbPw_01";

        try (Connection connection = DriverManager.getConnection(connectionString)) {
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery("SELECT product_name, price FROM products");

            while (rs.next()) {
                String productName = rs.getString("product_name");
                int productPrice = rs.getInt("price");

                Product product = new Product();
                product.setName(productName);
                product.setPrice(productPrice);

                comboBoxProducts.getItems().add(product);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}

