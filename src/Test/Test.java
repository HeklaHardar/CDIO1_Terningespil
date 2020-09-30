package Test;
import Spil.Raflebaeger;
import Spil.Terning;

public class Test {


    public static void main(String[] args) {

        Raflebaeger raflebaeger = new Raflebaeger();
        Terning terning = new Terning(6);

        int to=0;
        int tre=0;
        int fire = 0;
        int fem = 0;
        int seks = 0;
        int syv = 0;
        int otte = 0;
        int ni = 0;
        int ti = 0;
        int elve = 0;
        int tolv = 0;
        int ens = 0;


        for(int i = 1000; i > 0; i--){

            raflebaeger.roll().sum();

            if (raflebaeger.terning1Vaerdi() == raflebaeger.terning2Vaerdi()){

                ens += 1;


            }

            switch(raflebaeger.sum()){
                case 2:
                    to +=1;
                    break;
                case 3:
                    tre +=1;
                    break;
                case 4:
                    fire +=1;
                    break;
                case 5:
                    fem +=1;
                    break;
                case 6:
                    seks +=1;
                    break;
                case 7:
                    syv +=1;
                    break;
                case 8:
                    otte +=1;
                    break;
                case 9:
                    ni +=1;
                    break;
                case 10:
                    ti +=1;
                    break;
                case 11:
                    elve +=1;
                    break;
                case 12:
                    tolv +=1;
                    break;
            }



        }

        System.out.println("Terningerne slog 2: " + to +  " gange");
        System.out.println("Terningerne slog 3: " + tre +  " gange");
        System.out.println("Terningerne slog 4: " + fire +  " gange");
        System.out.println("Terningerne slog 5: " + fem +  " gange");
        System.out.println("Terningerne slog 6: " + seks +  " gange");
        System.out.println("Terningerne slog 7: " + syv +  " gange");
        System.out.println("Terningerne slog 8: " + otte +  " gange");
        System.out.println("Terningerne slog 9: " + ni +  " gange");
        System.out.println("Terningerne slog 10: " + ti +  " gange");
        System.out.println("Terningerne slog 11: " + elve +  " gange");
        System.out.println("Terningerne slog 12: " + tolv +  " gange");
        System.out.println("Terningerne slog ens: " + ens + " gange");

    }

}
