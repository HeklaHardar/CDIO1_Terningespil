public class Spiller {

    public static void main(String[] args) {

        int min = 1;
        int max = 3;
        boolean spil = true;


        int Spiller = (int) (Math.random() * (max - min) + min);

        if (Spiller == 1) {
            System.out.println("Spiller 1 starter");
        } else {
            System.out.println("Spiller 2 starter");
        }

       /* while(spil){

            while(Spiller == 1) {


            }

            while(Spiller == 2){


            }



        }
*/

    }


}