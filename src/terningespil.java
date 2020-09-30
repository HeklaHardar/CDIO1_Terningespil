import java.util.Scanner;

public class terningespil {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int ScoreA = 0;
        int ScoreB = 0;
        int b;
        ScoreA = ScoreA + a;
        int n = 1;
        while (n <= ScoreA){
            System.out.print("█");
            n++;
        }

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