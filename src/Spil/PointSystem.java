package Spil;

import java.util.Scanner;

public class PointSystem {
    private String spiller;
    Scanner scan = new Scanner(System.in);
    Raflebaeger raflebaeger = new Raflebaeger();
    private boolean Vinder = false;
    private boolean tur = true;
    private int Sekser1;
    private int Sekser2;
    private boolean klar = false;


    public void play() {


        System.out.print("Indtast navn for spiller 1: ");
        Spiller s1 = new Spiller(scan.nextLine());
        spiller = s1.playerString();
        System.out.print("Indtast navn for spiller 2: ");
        Spiller s2 = new Spiller(scan.nextLine());


        if (s1.spillerStarter() == 1) {
            System.out.println("\n" + s1.startString());
        } else {
            System.out.println("\n" + s2.startString());
            tur = false;
        }

        while (!klar) {

            System.out.print("Er i klar til at starte spillet? ja/nej: ");

            String klarString = scan.nextLine();
            String klarStringLower = klarString.toLowerCase();

            if (klarStringLower.equals("ja")) {
                klar = true;
                break;

            } else if (klarStringLower.equals("nej")) {
                //Noget om genstart hvis du vil spille
                System.out.println("Skriv ja når du er klar");
            } else {

                System.out.println("ukendt input");

            }

        }

        System.out.println("Skriv 'exit' til enhver tid, for at slutte spillet.");

        while (!Vinder) {
            while (tur&&!Vinder) {

                System.out.println("\nDet er " + s1.playerString() + "'s tur.");
                if (s1.score() > 0) {
                    System.out.println(s1.playerString() + " har: " + s1.score() + " point");
                }
                System.out.println("Tryk enter for at tage dit kast");
                String vent = scan.nextLine();
                if (vent.toLowerCase().equals("exit")) {

                    System.exit(0);

                }
                raflebaeger.roll();
                System.out.println("Slagene er: " + raflebaeger.terning1.getVaerdi() + " og " + raflebaeger.terning2.getVaerdi());
                System.out.println("Summen af raflebægeret er: " + raflebaeger.sum());

                if (Sekser1 > 0) {
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
                        Sekser1 = 2;
                    }

                    System.out.println("Ekstra tur til " + s1.playerString());
                    break;

                } else {
                    tur = false;
                }

                s1.updateScore(raflebaeger.sum());
                System.out.println(s1.playerString() + " har nu: " + s1.score() + " point");

                if (!tur) {

                    System.out.println("\nSkifter tur til: " + s2.playerString());

                }
            }

            while (!tur&&!Vinder) {

                System.out.println("\nDet er " + s2.playerString() + "'s tur.");

                if (s2.score() > 0) {

                    System.out.println(s2.playerString() + " har: " + s2.score() + " point");

                }
                System.out.println("Tryk enter for at tage dit kast");
                String vent = scan.nextLine();
                if (vent.toLowerCase().equals("exit")) {

                    System.exit(0);

                }
                raflebaeger.roll();
                System.out.println("Slagene er: " + raflebaeger.terning1.getVaerdi() + " og " + raflebaeger.terning2.getVaerdi());
                System.out.println("Summen af raflebægeret er: " + raflebaeger.sum());

                if (Sekser2 > 0) {

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

                        if (Sekser2 > 0) {
                            s2.updateScore(raflebaeger.sum());
                            System.out.println(s2.playerString() + " vinder med " + s2.score() + " point");
                            Vinder = true;
                            break;
                        }
                        Sekser2 = 2;

                    }
                } else {
                    tur = true;
                }
                s2.updateScore(raflebaeger.sum());
                System.out.println(s2.playerString() + " har nu: " + s2.score() + " point");

                if (tur) {

                    System.out.println("\nSkifter tur til: " + s1.playerString());

                }
            }

            if(Vinder) {


                while(Vinder) {
                    System.out.println("Vil i genstarte spillet? ja/nej");
                    String genstart = scan.nextLine();
                    if (genstart.toLowerCase().equals("ja")) {

                        s1.updateScore(0);
                        s2.updateScore(0);
                        Vinder = false;
                    } else if (genstart.toLowerCase().equals("nej")) {
                        System.out.println("Tak for spillet");
                        break;
                    } else {

                        System.out.println("Ukendt input");
                    }
                }
            }


        }

    }
}