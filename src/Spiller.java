import java.util.Scanner;

public class Spiller {


    public static void SpillerNavn() {

        int min = 1;
        int max = 3;

        Scanner Navn = new Scanner(System.in);
        System.out.print("Indtast navn for spiller 1: ");
        String Spiller1Navn = Navn.nextLine();
        System.out.print("Indtast navn for spiller 2: ");
        String Spiller2Navn = Navn.nextLine();

        Navn.close();



        int Spiller = (int) (Math.random() * (max - min) + min);

        if (Spiller == 1) {
            System.out.println(Spiller1Navn + " starter");
        } else {
            System.out.println(Spiller2Navn + " starter");
        }


    }



    }
