package com.example.wuerfel;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class WuerfelController {

    Wuerfel w = new Wuerfel();

    @FXML
    TextField AusgabeTextfield;

    @FXML
    TextField LetzteTextfield;
    @FXML
    protected void onWuerfelButtonClick() {

        String randomZahl = String.valueOf(w.werfen());
        String letzteZahl = String.valueOf(w.getLetzerWurf());
        AusgabeTextfield.setText(randomZahl);
        LetzteTextfield.setText(letzteZahl);
    }
}