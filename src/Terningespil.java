
import java.util.Scanner;

public class Terningespil {


    public static void main(String[] args) {

        String tur;
        boolean klar = false;


        Scanner scan = new Scanner(System.in);


        Raflebaeger raflebaeger = new Raflebaeger();
        /*System.out.println(raflebæger.sum());
        System.out.println(raflebæger.roll().toString());
        System.out.println(raflebæger.sum());

         */


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
        while(true){
                while (tur.equals("player1")) {
                    System.out.println("");
                    System.out.println("Det er " + s1.playerString()+"'s tur. Tryk enter for at tage dit kast");
                    String vent = scan.nextLine();
                    System.out.println("slagene er: "+raflebaeger.roll().toString());
                    System.out.println("summen af raflebægerne er: "+raflebaeger.sum());
                    s1.updateScore(raflebaeger.sum());



                    if (raflebaeger.sum() == 2) {
                        s1.updateScore(0);
                    }
                    System.out.println("");
                    System.out.println(s1.playerString()+" har " +s1.score()+" Points");
                    tur = "player2";


                }

                while (tur.equals("player2")) {
                    System.out.println("");
                    System.out.println("Det er " + s2.playerString()+"'s tur. Tryk enter for at tage dit kast");
                    String vent = scan.nextLine();

                    System.out.println("Slagene er: "+raflebaeger.roll().toString());
                    System.out.println("Summen er: "+raflebaeger.sum());
                    s2.updateScore(raflebaeger.sum());



                    if (raflebaeger.sum() == 2) {
                        s2.updateScore(0);
                    }
                    System.out.println("");
                    System.out.println(s2.playerString()+" har " +s2.score()+" Points");
                    tur = "player1";


                }



            }
        }

        }

