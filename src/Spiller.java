public class Spiller {


    //Sætter variabler

    private int min = 1;
    private int max = 3;
    private String Player;
    private int Spiller = (int) (Math.random() * (max - min) + min);
    private boolean spS;


    public Spiller(String s) {

        Player = s;

    }

    public void Starter(boolean b) {

        spS = b;

    }

    public boolean stst(){

        return spS;

    }


    public int spillerStarter() {

        return Spiller;

    }

    public String startString() {

        return Player + " Starter";

    }
    public String playerString(){

        return Player;

    }

/*
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
*/

}
