
import java.util.Scanner;

public class Terningespil {

    public static void main(String[] args) {

        String tur;
        boolean klar = false;


        Scanner scan = new Scanner(System.in);








        Raflebaeger raflebaeger = new Raflebaeger();


        System.out.print("Indtast navn for spiller 1: ");
        Spiller s1 = new Spiller(scan.nextLine());
        System.out.print("Indtast navn for spiller 2: ");
        Spiller s2 = new Spiller(scan.nextLine());
        //checker om spilleren er klar
        while (!klar) {

            System.out.print("Er i klar til at starte spillet? ja/nej: ");
            String klarString = scan.nextLine().toLowerCase();
            if (klarString.equals("ja")) {
                klar = true;
                break;

            } else if (klarString.equals("nej")) {
                //Noget om genstart hvis du vil spille
                System.out.println("blahblah");
            } else {

                System.out.println("ukendt input");

            }
        }

        //while game is still going

            if (s1.spillerStarter() == 1) {
                tur = "player1";
                }
                else{

                    tur = "player2";
                }
                boolean vinder = false;
        boolean ekstratur = false;
        int score1 = 0;
        int score2 = 0;
        PointSystem pointsystem = new PointSystem();
        while(vinder == false){
            int kast1;
            int kast2;
            int sumafkast;

                while (tur.equals("player1")) {
                    raflebaeger.roll();
                    kast1  = raflebaeger.terning1.getVaerdi();
                    kast2 = raflebaeger.terning2.getVaerdi();
                    sumafkast = raflebaeger.sum();
                    System.out.println("");
                    System.out.println("Det er " + s1.playerString()+"'s tur. Tryk enter for at tage dit kast");
                    System.out.println("slagene er: "+ kast1+"," +kast2);
                    System.out.println("summen af raflebægerne er: "+sumafkast);
                    pointsystem.play(kast1,kast2,sumafkast, score1);
                    ekstratur = pointsystem.CheckExtraTurn();
                    vinder = pointsystem.CheckVinder();
                    score1 = pointsystem.GetScore();
                    System.out.println("");
                    System.out.println(s1.playerString()+" har " +score1+" Points");
                    if (ekstratur == true) {
                        break;
                    }
                    tur = "player2";



                while (tur.equals("player2")) {
                    raflebaeger.roll();
                    kast1  = raflebaeger.terning1.getVaerdi();
                    kast2 = raflebaeger.terning2.getVaerdi();
                    sumafkast = raflebaeger.sum();
                    System.out.println("");
                    System.out.println("Det er " + s2.playerString()+"'s tur. Tryk enter for at tage dit kast");
                    System.out.println("slagene er: "+ kast1+"," +kast2);
                    System.out.println("summen af raflebægerne er: "+sumafkast);
                    pointsystem.play(kast1,kast2,sumafkast, score2);
                    ekstratur = pointsystem.CheckExtraTurn();
                    vinder = pointsystem.CheckVinder();
                    score2 = pointsystem.GetScore();
                    System.out.println("");
                    System.out.println(s2.playerString()+" har " +score2+" Points");
                    if (ekstratur == true) {
                        break;
                    }
                    tur = "player1";

                }



            }
        }
    }
        }

