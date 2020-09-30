

import java.util.Scanner;

public class terningespil {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int terning1;
        int terning2;
        int sum;
        int a;
        int ScoreA = 0;
        int ScoreB = 0;
        int b;
        int n = 0;
        int combo = 0;

        while (n <= 1000) {
            terning1 = (int) (Math.random() * (7 - 1) + 1);
            terning2 = (int) (Math.random() * (7 - 1) + 1);
            sum = terning1 + terning2;
            n++;
            System.out.println("n = " + n + "        " + terning1+ "        " + terning2);
            System.out.println("Sum er: " + sum);
            System.out.println("-----------------------------");

            if (terning1 == terning2){
                combo++;
                System.out.println("2x comboer: " + combo);
                System.out.println(" ");
            }

        }
        System.out.println("2x comboer: " + combo);



       /* do {
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
*/

    }
}




//skrrrt