package com.example.reisedauermond;

public class Mondreise {

    int distanz = 384400;
    double resultat = 0;
    double geschwindikeit;

    public double getTravelDurationHours(){
        resultat = distanz/geschwindikeit/24;
        return  resultat;
    }

    public double getTravelDurationDays() {
        resultat = distanz / geschwindikeit;
        return resultat;
    }
}
