package com.example.tanne;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class TanneController {
    @FXML
    TextField Stammbreite;

    @FXML
    TextField Stammhoehe;

    @FXML
    TextField Kronenhoehe;

    @FXML
    private TextArea Result;


    @FXML
    protected void onBeendenButtonClick() {
        System.exit(0);
    }

    @FXML
    protected void onZeichnenButtonClick() {
        Tanne t = new Tanne();
        t.setStammbreite(Integer.parseInt(Stammbreite.getText()));
        t.setStammhoehe(Integer.parseInt(Stammhoehe.getText()));
        t.setKronenhoehe(Integer.parseInt(Kronenhoehe.getText()));
        t.zeichne(Integer.parseInt(Stammbreite.getText()), Integer.parseInt(Stammhoehe.getText()), Integer.parseInt(Kronenhoehe.getText())); // zeichnet die Tanne und stellt das Resultat bereit
        Result.setText(t.getZeichnung()); // Zeichnung abholen und in eine TextArea abfüllen

    }
}