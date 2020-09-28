import java.util.Scanner;

public class Terningespil {

    public static void main(String[] args) {

        boolean klar = false;
        Scanner scan = new Scanner(System.in);
        Raflebæger raflebæger = new Raflebæger();

        System.out.println(raflebæger.sum());

        System.out.println(raflebæger.roll().toString());

        System.out.println(raflebæger.sum());


        System.out.print("Indtast navn for spiller 1: ");
        Spiller s1 = new Spiller(scan.nextLine());
        System.out.print("Indtast navn for spiller 2: ");
        Spiller s2 = new Spiller(scan.nextLine());
        System.out.println(s1.spillerStarter());

        if (s1.spillerStarter() == 1) {
            System.out.println(s1.startString());
            s1.Starter(true);
        } else {
            System.out.println(s2.startString());
            s1.Starter(false);
        }

        System.out.println(s1.stst());

        String klarString = scan.nextLine();

        if (klarString.equals("ja")) {

            klar = true;

        } else {
            //Noget om genstart hvis du vil spille
            System.out.println("blahblah");

        }
/*
        while (klar) {

            //Find andet navn end stst
            while (s1.stst()) {
                //Mangler variable for at gemme point
                //mangler && (point variabel) >=40
                if (raflebæger.terning1 == raflebæger.terning2 && raflebæger.sum() != 1) {

                    System.out.println(s1.playerString() + " vinder!");
                    //Boolean vinder = true
                    //break;

                } else if (raflebæger.terning1 == raflebæger.terning2) {

                    System.out.println("Ekstra tur til " + s1.spillerStarter());


                    if (raflebæger.sum() == 2) {

                        //Dobbelt etter = mister alle sine point
                        System.out.println(s1.playerString() + " mister sine point.");
                        //Mangler (point variabel) = 0
                    }
                    if (raflebæger.sum() == 12) {


                        //Dobbelt sekser igen og man vinder spillet
                        //If statement hvis man har slået 2 seksere i træk så vinder man

                        //Boolean til at være true for at man har slået to seksere, som så tjekkes
                        //i if statement

                    }

                }
            }
            //skift navn til andet end stst
            while(s1.stst()==false){



            }

        }
*/

    }
}