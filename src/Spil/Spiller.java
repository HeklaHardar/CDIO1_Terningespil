package Spil;

public class Spiller {

    //Sætter variabler

    private int min = 1;
    private int max = 3;
    private String Player;
    private int Spiller = (int) (Math.random() * (max - min) + min);
    private boolean spS;
    private int point;

    //Henter spillerens navn
    public Spiller(String s) {
        Player = s;
        point = 0;
    }

    //Vælger tilfældigt hvem der starter spillet
    public int spillerStarter() {
        return Spiller;
    }

    public String startString() {
        return Player + " Starter";
    }

    public String playerString() {
        return Player;
    }

    //opdaterer spillerens score
    public void opdaterScore(int terning) {

        point += terning;
        if (terning == 0) {
            point = 0;
        }
    }

    //returner spillerens nye score
    public int score() {

        return point;

    }
}
