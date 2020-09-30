public class Spiller {


    //Sætter variabler

    private int min = 1;
    private int max = 3;
    private String Player;
    private int Spiller = (int) (Math.random() * (max - min) + min);
    private boolean spS;
    private int point;


    public Spiller(String s) {

        Player = s;
        point = 0;

    }



    public int spillerStarter() {

        return Spiller;

    }

    public String startString() {

        return Player + " Starter";

    }

    public String playerString() {

        return Player;

    }

    public String pointString(String point){
        return Player + "har" + point + "points";
    }

    public void updateScore(int terning) {

        point += terning;
        if (terning == 0) {
            point = 0;
        }

    }

    public int score() {

        return point;


    }

}
