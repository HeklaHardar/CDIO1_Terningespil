import java.awt.*;
import java.util.Scanner;

public class Terningespil {


    public static void main(String[] args) {

        boolean klar = false;


        Scanner scan = new Scanner(System.in);


        Raflebæger raflebæger = new Raflebæger();
        /*System.out.println(raflebæger.sum());
        System.out.println(raflebæger.roll().toString());
        System.out.println(raflebæger.sum());

         */


        System.out.print("Indtast navn for spiller 1: ");
        Spiller s1 = new Spiller(scan.nextLine());
        System.out.print("Indtast navn for spiller 2: ");
        Spiller s2 = new Spiller(scan.nextLine());
        //while game is still going
        while(true){

        if (s1.spillerStarter() == 1) {
            System.out.println(s1.startString());
            s1.Starter(true);
        } else {
            System.out.println(s2.startString());
            s1.Starter(false);
        }

        while (!klar) {

            System.out.print("Er i klar til at starte spillet? ja/nej: ");
            String klarString = scan.nextLine();
            klarString.toLowerCase();

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

        while (true) {


            System.out.println(raflebæger.roll().toString());
            System.out.println(raflebæger.sum());
            s1.updateScore(raflebæger.sum());


            if (raflebæger.sum() == 2) {
                s1.updateScore(0);
                System.out.println(s1.score());
            } else {
                System.out.println(s1.score());
            }

            String vent = scan.nextLine();

            System.out.println(s1.score());
        }
        }


        }
    }
