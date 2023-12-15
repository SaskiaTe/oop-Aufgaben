package com.example.auto;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

import java.io.File;

public class AutoController {

    @FXML
    ComboBox<Auto> ComboBoxAuto;

    @FXML
    private Label LabelPs;

    @FXML
    private TextArea TextFieldGeschwindigkeit;
    @FXML
    private TextField TextFieldBenzin;
    @FXML
    protected void onBeendenButtonClick() {
        System.exit(0);
    }

    Auto currentCar;

    @FXML
    private void initialize() {
        ObservableList<Auto> autos = FXCollections.observableArrayList();
        autos.add(new Auto("Porsche", 250));
        autos.add(new Auto("Opel", 90));
        autos.add(new Auto("Ferrari", 370));
        ComboBoxAuto.setItems(autos);
    }

    @FXML
    private void onComboBoxAutosSelectionChanged() {
        currentCar = ComboBoxAuto.getValue();
        LabelPs.setText(String.valueOf(currentCar.getPs()));
        updateCockpitInstruments();
    }

    @FXML
    public void onHornButtonClick(){
        System.out.println("Hupe");
        currentCar.hupe();
    }


    @FXML
    public void onKeyButtonClick(){
        System.out.println("Key");
        currentCar.starteMotor();
    }

    @FXML
    public void onFuelButtonClick(){
        System.out.println("Tanken");
        currentCar.auftanken();
        updateCockpitInstruments();
    }

    @FXML
    public void onGasButtonPressed(){
        System.out.println("Gas");
        currentCar.gibGas();
        updateCockpitInstruments();
    }

    @FXML
    public void onBreakButtonPressed(){
        System.out.println("Bremsen");
        currentCar.bremse();
        updateCockpitInstruments();
    }

    private void updateCockpitInstruments() {
        TextFieldGeschwindigkeit.setText(String.valueOf(currentCar.getAktuelleGeschwindigkeit()));
        TextFieldBenzin.setText(String.valueOf(currentCar.getTankFuellstand()));
    }
}