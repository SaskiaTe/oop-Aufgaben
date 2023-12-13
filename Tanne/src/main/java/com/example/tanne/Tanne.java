package com.example.tanne;

public class Tanne {
    String Zeichnung;

    public void setStammbreite(int Stammbreite) {
    }

    public void setStammhoehe(int Stammhoehe) {
    }

    public void setKronenhoehe(int Kronenhoehe) {
    }

    public void zeichne(int Stammbreite, int Stammhoehe, int Kronenhoehe) {
        StringBuilder BaumBauen = new StringBuilder();

        for (int i = 1; i <= Kronenhoehe; i++) {
            for (int j = 1; j <= ((Kronenhoehe + Kronenhoehe - 1) - (i + i - 1)) / 2; j++) {
                BaumBauen.append(" ");
            }
            for (int k = 1; k <= i + (i - 1); k++) {
                BaumBauen.append("*");
            }
            BaumBauen = BaumBauen.append("\n");
        }

        for (int i = 1; i <= Stammhoehe; i++) {
            for (int j = 1; j <= (Kronenhoehe + Kronenhoehe - 1 - Stammbreite) / 2; j++) {
                BaumBauen.append(" ");
            }
            for (int k = 1; k <= Stammbreite; k++) {
                BaumBauen.append("#");
            }
            BaumBauen = BaumBauen.append("\n");
        }
        Zeichnung = BaumBauen.toString();
    }
    public String getZeichnung() {
        return Zeichnung;

    }
}
