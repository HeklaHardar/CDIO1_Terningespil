import java.util.Scanner;

public class Terningespil {

    public static void main(String[] args) {


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



/*
//Mangler variable for at gemme point

        if (HentKommando.VaerdiTerning1() == HentKommando.VaerdiTerning2() && HentKommando.VaerdiTerning1() != 1){

            System.out.println(s1.playerString() + " vinder!");
            //break;

        }
        else if (HentKommando.VaerdiTerning1() == HentKommando.VaerdiTerning2()){

            System.out.println("Ekstra tur til " + s1.spillerStarter());
            if(HentKommando.Vaerdiafsum()==2){

                //Dobbelt etter = mister alle sine point
                System.out.println(s1.playerString() + " mister sine point.");

            }
            if(HentKommando.Vaerdiafsum()==12){


                //Dobbelt sekser igen og man vinder spillet
                //

            }

        }
        else if (){

        }
*/
    }
}