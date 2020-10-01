package Spil;

import java.util.Scanner;

public class SpilMester {

    //Definerer variabler
    private String spiller;
    Scanner scan = new Scanner(System.in);
    Raflebaeger raflebaeger = new Raflebaeger();
    private boolean Vinder = false;
    private boolean tur = true;
    private int Sekser1;
    private int Sekser2;
    private boolean klar = false;

    //Starter hele spillet
    public void play() {

        System.out.println(" _____               _                             _ _ _      _   \n" +
                "|_   _|             (_)                           (_) | |    | |  \n" +
                "  | | ___ _ __ _ __  _ _ __   __ _  ___  ___ _ __  _| | | ___| |_ \n" +
                "  | |/ _ \\ '__| '_ \\| | '_ \\ / _` |/ _ \\/ __| '_ \\| | | |/ _ \\ __|\n" +
                "  | |  __/ |  | | | | | | | | (_| |  __/\\__ \\ |_) | | | |  __/ |_ \n" +
                "  \\_/\\___|_|  |_| |_|_|_| |_|\\__, |\\___||___/ .__/|_|_|_|\\___|\\__|\n" +
                "                              __/ |         | |                   \n" +
                "                             |___/          |_|                 ");

        //Sætter spiller navne og definerer spiller objekter
        System.out.print("Indtast navn for spiller 1: ");
        Spiller s1 = new Spiller(scan.nextLine());
        spiller = s1.playerString();
        System.out.print("Indtast navn for spiller 2: ");
        Spiller s2 = new Spiller(scan.nextLine());


        //Sikrer at spillerne er klar
        while (!klar) {
            System.out.print("Er i klar til at starte spillet? ja/nej: ");

            String klarString = scan.nextLine();
            String klarStringLower = klarString.toLowerCase();

            if (klarStringLower.equals("ja")) {
                klar = true;
                break;
            } else if (klarStringLower.equals("nej")) {
                System.out.println("Skriv ja når du er klar");
            } else {
                System.out.println("ukendt input");
            }
        }

        //Vælger hvilken spiller der starter og printer spillerens navn
        if (s1.spillerStarter() == 1) {
            System.out.println("\n" + s1.startString());
        } else {
            System.out.println("\n" + s2.startString());
            tur = false;
        }

        System.out.println("Du kan til enhver tid skrive 'exit' for at afslutte spillet");

        //Terninge spillet kører
        while (!Vinder) {
            //Kører tur for spiller 1
            while (tur && !Vinder) {

                System.out.println("\nDet er " + s1.playerString() + "'s tur.");
                System.out.println("Tryk enter for at kaste terningerne");

                //Venter for spillerens input for at slå
                String vent = scan.nextLine();

                //Hvis spilleren skriver exit, slutter spillet
                if (vent.toLowerCase().equals("exit")) {
                    System.exit(0);
                }

                //Ruller raflebægeret og printer værdierne
                raflebaeger.roll();
                System.out.println("Slagene er: ");
                System.out.println(printterninger.findTerning(raflebaeger.terning1.getVaerdi()));
                System.out.println(printterninger.findTerning(raflebaeger.terning2.getVaerdi()));


                if (Sekser1 > 0) {
                    Sekser1 -= 1;
                }

                //Tjekker om man vinder spillet
                if (raflebaeger.terning1.getVaerdi() == raflebaeger.terning2.getVaerdi() && raflebaeger.sum() != 2 && s1.score() >= 40) {

                    System.out.println("\uD83C\uDFC6" + s1.playerString() + " vinder med " + s1.score() + " point!\uD83C\uDFC6");
                    Vinder = true;
                    break;

                    //Tjekker om man har slået to ens
                } else if (raflebaeger.terning1.getVaerdi() == raflebaeger.terning2.getVaerdi()) {

                    s1.opdaterScore(raflebaeger.sum());

                    //Tjekker om man har slået to ettere
                    if (raflebaeger.sum() == 2) {

                        s1.opdaterScore(0);
                        System.out.println(s1.playerString() + " mister sine point.");
                        break;
                    }

                    //Tjekker om man har slået to seksere
                    if (raflebaeger.sum() == 12) {

                        //Tjekker om man slog to seksere i sidste slag
                        if (Sekser1 > 0) {

                            System.out.println("\uD83C\uDFC6" + s1.playerString() + " vinder med " + s1.score() + " point \uD83C\uDFC6");
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
                //Opdaterer spillerens score
                s1.opdaterScore(raflebaeger.sum());
                System.out.println(s1.playerString() + " har nu: " + s1.score() + " point");
            }

            //Kører tur for spiller 2
            while (!tur && !Vinder) {

                System.out.println("\nDet er " + s2.playerString() + "'s tur.");

                System.out.println("Tryk enter for at kaste terningerne");

                //Venter for spillerens input for at slå
                String vent = scan.nextLine();

                //Hvis spilleren skriver exit, slutter spillet
                if (vent.toLowerCase().equals("exit")) {
                    System.exit(0);
                }

                //Ruller raflebægeret og printer værdierne
                raflebaeger.roll();
                System.out.println("Slagene er: ");
                System.out.println(printterninger.findTerning(raflebaeger.terning1.getVaerdi()));
                System.out.println(printterninger.findTerning(raflebaeger.terning2.getVaerdi()));

                if (Sekser2 > 0) {

                    Sekser2 -= 1;

                }

                //Tjekker om man vinder spillet
                if (raflebaeger.terning1.getVaerdi() == raflebaeger.terning2.getVaerdi() && raflebaeger.sum() != 2 && s2.score() >= 40) {

                    System.out.println("\uD83C\uDFC6" + s2.playerString() + " vinder med " + s2.score() + " point!\uD83C\uDFC6");

                    Vinder = true;
                    break;

                    //Tjekker om man har slået to ens
                } else if (raflebaeger.terning1.getVaerdi() == raflebaeger.terning2.getVaerdi()) {

                    System.out.println("Ekstra tur til " + s2.playerString());

                    //Tjekker om man har slået to ettere
                    if (raflebaeger.sum() == 2) {

                        s2.opdaterScore(0);
                        System.out.println(s2.playerString() + " mister sine point.");
                        break;

                    }

                    //Tjekker om man har slået to seksere
                    if (raflebaeger.sum() == 12) {

                        //Tjekker om man slog to seksere i sidste slag
                        if (Sekser2 > 0) {
                            s2.opdaterScore(raflebaeger.sum());
                            System.out.println("\uD83C\uDFC6" + s2.playerString() + " vinder med " + s2.score() + " point\uD83C\uDFC6");
                            Vinder = true;
                            break;
                        }
                        Sekser2 = 2;

                    }
                } else {
                    tur = true;
                }
                //Odaterer spillerens score
                s2.opdaterScore(raflebaeger.sum());
                System.out.println(s2.playerString() + " har nu: " + s2.score() + " point");

            }

            //Genstarter eller slutter spillet
            if (Vinder) {
                while (Vinder) {
                    System.out.println("Vil i genstarte spillet? ja/nej");
                    String genstart = scan.nextLine();

                    if (genstart.toLowerCase().equals("ja")) {
                        s1.opdaterScore(0);
                        s2.opdaterScore(0);
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