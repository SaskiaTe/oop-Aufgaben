package com.example.auto;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

import java.io.File;

public class Auto {
    private int aktuelleGeschwindigkeit = 0;
    private int aktuellerGang;
    private boolean istMotorGeestartet;
    private String marke;
    private int ps;
    private int tankFuellstand;

    public Auto(String marke, int ps) {
        this.marke = marke;
        this.ps = ps;
    }


    public int getAktuelleGeschwindigkeit() {
        return aktuelleGeschwindigkeit;
    }

    public int getAktuellerGang() {
        return aktuellerGang;
    }

    public boolean isIstMotorGeestartet() {
        return istMotorGeestartet;
    }

    public String getMarke() {
        return marke;
    }

    public int getPs() {
        return ps;
    }

    public int getTankFuellstand() {
        return tankFuellstand;
    }

    public void auftanken(){
        while (tankFuellstand < 100) {
            String soundFile = "/Users/saskiatellenbach/Documents/BLJ/OOP/oop-Aufgaben/Auto/Sounds/stationary-petrol-gas-engines-70075.mp3";
            Media sound = new Media(new File(soundFile).toURI().toString());
            MediaPlayer mediaPlayer = new MediaPlayer(sound);
            mediaPlayer.play();
            tankFuellstand += 10;
        }

    }

    public void bremse(){
        if (aktuelleGeschwindigkeit >=10){
        aktuelleGeschwindigkeit -= 10;
        }
    }

    public void gibGas(){
        if (tankFuellstand > 0 && aktuelleGeschwindigkeit < 130) {
            System.out.println("Gas");
            aktuelleGeschwindigkeit += 10;
            tankFuellstand -= 5;
        }
        else {
            this.schalteMotorAus();
        }


    }

    public void hupe(){
        String soundFile = "/Users/saskiatellenbach/Documents/BLJ/OOP/oop-Aufgaben/Auto/Sounds/car-horn-6408.mp3";
        Media sound = new Media(new File(soundFile).toURI().toString());
        MediaPlayer mediaPlayer = new MediaPlayer(sound);
        mediaPlayer.play();
    }

    public void schalteMotorAus(){
        istMotorGeestartet = false;
    }

    public void starteMotor(){
        if (getTankFuellstand() > 0) {
            String soundFile = "/Users/saskiatellenbach/Documents/BLJ/OOP/oop-Aufgaben/Auto/Sounds/car-engine-starting-43705.mp3";
            Media sound = new Media(new File(soundFile).toURI().toString());
            MediaPlayer mediaPlayer = new MediaPlayer(sound);
            mediaPlayer.play();
            istMotorGeestartet = true;
        }


    }

    @Override
    public String toString() {
        return this.marke;
    }


}
