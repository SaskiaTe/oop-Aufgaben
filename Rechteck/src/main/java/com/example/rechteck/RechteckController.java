package com.example.rechteck;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class RechteckController {

    @FXML
    TextField breiteTextfield;

    @FXML
    TextField höheTextfield;

    @FXML
    TextField AusgabeTextfield;

    @FXML
    protected void onBeendenButtonClick() {
        System.exit(0);
    }


    @FXML
    protected void onBerechnenButtonClick(){

        Rechteck r = new Rechteck();
        r.setHeight(Double.parseDouble(höheTextfield.getText()));
        r.setWidth(Double.parseDouble(breiteTextfield.getText()));

        String ausgabe = String.valueOf(r.getArea());
        AusgabeTextfield.setText(ausgabe);

    }
}