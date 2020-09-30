import java.util.Scanner;

public class PointSystem {
    private String spiller;
    Scanner scan = new Scanner(System.in);
    Raflebaeger raflebaeger = new Raflebaeger();
    private int sidsteHaand;
    private boolean Vinder = false;
    private boolean tur = true;

    public PointSystem() {

    }

    public void play() {


        System.out.print("Indtast navn for spiller 1: ");
        Spiller s1 = new Spiller(scan.nextLine());
        spiller = s1.playerString();
        System.out.print("Indtast navn for spiller 2: ");
        Spiller s2 = new Spiller(scan.nextLine());

        if (s1.spillerStarter() == 1) {
            System.out.println(s1.startString());

        } else {
            System.out.println(s2.startString());
            tur = false;
        }

        while (Vinder == false) {
            while (tur == true) {
                //String vent = scan.nextLine();
                System.out.println("Spiller: " + s1.playerString());
                raflebaeger.roll();
                System.out.println(raflebaeger.toString());
                //System.out.println(raflebaeger.sum());
                //Mangler variable for at gemme point
                //mangler && (point variabel) >=40
                // System.out.println(raflebaeger.terning1.getVaerdi());
                if (raflebaeger.terning1.getVaerdi() == raflebaeger.terning2.getVaerdi() && raflebaeger.sum() != 2 && s1.score() >= 40) {

                    System.out.println(s1.playerString() + " vinder med " + s1.score() + " point!");

                    Vinder = true;
                    break;

                } else if (raflebaeger.terning1.getVaerdi() == raflebaeger.terning2.getVaerdi()) {

                    System.out.println("Ekstra tur til " + s1.playerString());


                    if (raflebaeger.sum() == 2) {

                        //Dobbelt etter = mister alle sine point
                        s1.updateScore(0);
                        System.out.println(s1.playerString() + " mister sine point.");
                        //Mangler (point variabel) = 0
                    }


                    if (raflebaeger.sum() == 12) {


                        //Dobbelt sekser igen og man vinder spillet
                        //If statement hvis man har slået 2 seksere i traek så vinder man
                        if (raflebaeger.sum() == sidsteHaand) {

                            System.out.println("Du vinder med " + s1.score() + " point");
                            Vinder = true;
                            break;
                        }
                        sidsteHaand = raflebaeger.sum();

                        //Boolean til at vaere true for at man har slået to seksere, som så tjekkes
                        //i if statement

                    }
                } else {
                    System.out.println("Skifter tur til: " + s2.playerString());
                    tur = false;
                }
                s1.updateScore(raflebaeger.sum());
                System.out.println(s1.playerString() + " har: " + s1.score() + " point");
            }
            if (Vinder == true) {

                break;
            }
            while (tur == false) {
                System.out.println("Spiller: " + s2.playerString() + "'s tur.");

                System.out.println();
                raflebaeger.roll();
                System.out.println(raflebaeger.toString());
                //System.out.println(raflebaeger.sum());

                //Mangler variable for at gemme point
                //mangler && (point variabel) >=40
                // System.out.println(raflebaeger.terning1.getVaerdi());
                if (raflebaeger.terning1.getVaerdi() == raflebaeger.terning2.getVaerdi() && raflebaeger.sum() != 2 && s2.score() >= 40) {

                    System.out.println(s2.playerString() + " vinder med " + s2.score() + " point!");

                    Vinder = true;
                    break;

                } else if (raflebaeger.terning1.getVaerdi() == raflebaeger.terning2.getVaerdi()) {

                    System.out.println("Ekstra tur til " + s2.playerString());


                    if (raflebaeger.sum() == 2) {

                        //Dobbelt etter = mister alle sine point
                        s2.updateScore(0);
                        System.out.println(s2.playerString() + " mister sine point.");
                        //Mangler (point variabel) = 0
                    }

                    if (raflebaeger.sum() == 12) {

                        //Dobbelt sekser igen og man vinder spillet
                        //If statement hvis man har slået 2 seksere i traek så vinder man
                        if (raflebaeger.sum() == sidsteHaand) {

                            System.out.println("Du vinder med " + s2.score() + " point");
                            Vinder = true;
                            break;
                        }
                        sidsteHaand = raflebaeger.sum();

                        //Boolean til at vaere true for at man har slået to seksere, som så tjekkes
                        //i if statement
                    }
                } else {
                    System.out.println("Skifter tur til: " + s1.playerString());
                    tur = true;
                }
                s2.updateScore(raflebaeger.sum());
                System.out.println(s2.playerString() + " har: " + s2.score() + " point");
            }
        }
    }
    //Find andet navn end stst
    /*

     */
    public String Spiller() {

        return spiller;

    }
}