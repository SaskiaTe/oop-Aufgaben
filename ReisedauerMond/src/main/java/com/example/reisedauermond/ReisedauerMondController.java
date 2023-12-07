package com.example.reisedauermond;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;

public class ReisedauerMondController {


    @FXML
    TextField Geschwindigkeitstext;

    @FXML
    TextField Ausgabetext;

    @FXML
    RadioButton radioButtonDays;
    @FXML
    RadioButton radioButtonHours;



    @FXML
    protected void onBerechnenButtonClick(){
        Mondreise m = new Mondreise();
        m.geschwindikeit = Double.parseDouble(Geschwindigkeitstext.getText());

        if (radioButtonHours.isSelected() == true) {
            m.getTravelDurationHours();
            String ausgabe = String.valueOf(m.resultat);
            Ausgabetext.setText(ausgabe);
        }

        else if (radioButtonDays.isSelected() == true) {
            m.getTravelDurationDays();
            String ausgabe = String.valueOf(m.resultat);
            Ausgabetext.setText(ausgabe);
        }

        else
            System.out.print("Hallo");



    }
}