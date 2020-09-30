
import java.util.Scanner;


public class PointSystem {
    private int sidsteHaand;
    private boolean vinder = false;
    private boolean Ekstratur = false;
    public int newscore;

    public PointSystem() {

    }
    public Boolean CheckExtraTurn(){
        return Ekstratur;
    }

    public int GetScore(){
        return newscore;
    }

    public boolean CheckVinder(){
        return vinder;
    }
    public void play(int terning1,int terning2, int sum, int score) {


        if (terning1 == terning2 && sum != 2 && score >= 40) {

            vinder = true;

        } if (sum == 2) {
            newscore = 0;
            Ekstratur = true;

        }
        else if (terning1 == terning2) {



            Ekstratur = true;
            newscore = sum + score;





            if (sum == 12) {
                newscore = score + sum;


                //Dobbelt sekser igen og man vinder spillet
                //If statement hvis man har slået 2 seksere i traek så vinder man
                if (sum == sidsteHaand) {


                    vinder = true;
                    newscore = score + sum;

                }
                sidsteHaand = sum;

                //Boolean til at vaere true for at man har slået to seksere, som så tjekkes
                //i if statement

            }

        }
        else{
            newscore = score +sum;
            Ekstratur = false;
        }
    }
}