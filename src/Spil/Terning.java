package Spil;

import java.lang.Math;

public class Terning {
    private int max;
    private int min = 1;

    private int Vaerdi; //parametre

    public Terning(int maximum) { // Konstruktor
        max = maximum + 1;
        roll();
    }

    public int getVaerdi() { //metode
        return Vaerdi;
    }

    public int roll() {
        Vaerdi = (int) (Math.random() * (max - min) + min);
        return Vaerdi;
    }
}