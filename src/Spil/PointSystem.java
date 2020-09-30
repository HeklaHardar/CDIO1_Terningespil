package Spil;

import java.util.Scanner;

public class PointSystem {
    private String spiller;
    Scanner scan = new Scanner(System.in);
    Raflebaeger raflebaeger = new Raflebaeger();
   // private int sidsteHaand;
    private boolean Vinder = false;
    private boolean tur = true;
    private int Sekser1;
    private int Sekser2;

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

        while (!Vinder) {
            while (tur) {



                System.out.println("\nSpiller: " + s1.playerString() + "'s tur.");
                if(s1.score()>0){

                    System.out.println(s1.playerString() + " har: " + s1.score() + " point");

                }
                System.out.println("Tryk enter for at slå med terningen");

                String vent = scan.nextLine();
                raflebaeger.roll();
                System.out.println(raflebaeger.toString());

                if(Sekser1 > 0){

                    Sekser1 -= 1;

                }

                if (raflebaeger.terning1.getVaerdi() == raflebaeger.terning2.getVaerdi() && raflebaeger.sum() != 2 && s1.score() >= 40) {

                    System.out.println(s1.playerString() + " vinder med " + s1.score() + " point!");

                    Vinder = true;
                    break;

                } else if (raflebaeger.terning1.getVaerdi() == raflebaeger.terning2.getVaerdi()) {


                    s1.updateScore(raflebaeger.sum());


                    if (raflebaeger.sum() == 2) {

                        s1.updateScore(0);
                        System.out.println(s1.playerString() + " mister sine point.");
                        break;

                    }


                    if (raflebaeger.sum() == 12) {


                        if (Sekser1 > 0) {

                            System.out.println(s1.playerString() + " vinder med " + s1.score() + " point");
                            Vinder = true;
                            break;
                        }
                        //sidsteHaand = raflebaeger.sum();
                        Sekser1 = 3;


                    }
                    System.out.println("Ekstra tur til " + s1.playerString());
                    break;
                } else {

                    tur = false;
                }
                s1.updateScore(raflebaeger.sum());
                System.out.println(s1.playerString() + " har nu: " + s1.score() + " point");

                if (!tur){

                    System.out.println("Skifter tur til: " + s2.playerString());

                }
            }
            if (Vinder) {

                break;
            }
            while (!tur) {
                System.out.println("\nSpiller: " + s2.playerString() + "'s tur.");

                if(s2.score()>0){

                    System.out.println(s2.playerString() + " har: " + s2.score() + " point");

                }

                System.out.println("Tryk enter for at slå med terningen");
                String vent = scan.nextLine();
                raflebaeger.roll();
                System.out.println(raflebaeger.toString());

                if(Sekser2 > 0){

                    Sekser2 -= 1;

                }

                if (raflebaeger.terning1.getVaerdi() == raflebaeger.terning2.getVaerdi() && raflebaeger.sum() != 2 && s2.score() >= 40) {

                    System.out.println(s2.playerString() + " vinder med " + s2.score() + " point!");

                    Vinder = true;
                    break;

                } else if (raflebaeger.terning1.getVaerdi() == raflebaeger.terning2.getVaerdi()) {

                    System.out.println("Ekstra tur til " + s2.playerString());


                    if (raflebaeger.sum() == 2) {


                        s2.updateScore(0);
                        System.out.println(s2.playerString() + " mister sine point.");
                        break;

                    }

                    if (raflebaeger.sum() == 12) {


                        if (Sekser2>0) {

                            System.out.println(s2.playerString() + " vinder med " + s2.score() + " point");
                            Vinder = true;
                            break;
                        }
                        Sekser2 = 3;
                      //  sidsteHaand = raflebaeger.sum();


                    }
                } else {
                    tur = true;
                }
                s2.updateScore(raflebaeger.sum());
                System.out.println(s2.playerString() + " har nu: " + s2.score() + " point");

                if(tur){

                    System.out.println("Skifter tur til: " + s1.playerString());

                }
            }
        }
    }



    public String Spiller() {

        return spiller;

    }
}