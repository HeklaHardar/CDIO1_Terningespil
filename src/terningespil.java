

import java.util.Scanner;

public class terningespil {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int a;
        int ScoreA = 0;
        int ScoreB = 0;
        int b;
        int n = 1;

        while (n <= 1000){
            (int) (Math.random(0 + 6)* 6);
        }
        do {
            a = input.nextInt();
            ScoreA = ScoreA + a;
            n = 1;
            System.out.println("Spiller1");
            while (n <= ScoreA) {
                System.out.print("█");
                n++;
            }

            System.out.print(" " + ScoreA);
            System.out.println(" ");

            b = input.nextInt();
            ScoreB = ScoreB + b;
            n = 1;
            System.out.println("Spiller 2");
            while (n <= ScoreB) {
                System.out.print("█");
                n++;
            }
            System.out.print(" " + ScoreB);
            System.out.println(" ");

            System.out.println("-------------------------");
        } while (true);






        /*do {
            while (n <= a) {

                System.out.print("█");
                ScoreA = ScoreA + a;
                n = n + 1;

            }
            System.out.println(" ");
            b = input.nextInt();
            n = 1;

            while (n <= b) {

                System.out.print("█");

                n = n + 1;
            }
            ScoreB = ScoreB + b;


            System.out.print(" " + ScoreB);

        }*/

    }
}




//skrrrt