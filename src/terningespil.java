

import java.util.Scanner;

public class terningespil {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int terning1 = 0;
        int terning2 = 0;
        int sum = 0;
        int n = 0;
        int combo = 0;
        int iteration = 100;
        double c1 = 0;
        double c2 = 0;
        double c3 = 0;
        double c4 = 0;
        double c5 = 0;
        double c6 = 0;


        while (n <= iteration) {
            terning1 = (int) (Math.random() * (7 - 1) + 1);
            terning2 = (int) (Math.random() * (7 - 1) + 1);
            sum = terning1 + terning2;
            n++;


            if (terning1 == terning2) {
                combo++;
            }

            if (sum == 2){
                c1 = c1 + 1;
            } else if (sum == 4){
                c2 = c2 + 1;
            } else if (sum == 6){
                c3 = c3 + 3;
            } else if (sum == 8){
                c4 = c4 + 1;
            } else if (sum == 10){
                c5 = c5 + 1;
            } else if (sum == 12) {
                c6 = c6 + 1;
            }


        }
        System.out.println("-----------------------------");
        System.out.println("n = " + n + "        " + terning1 + "        " + terning2);
        System.out.println("Sum er: " + sum);
        System.out.println("-----------------------------");

        int i = 1;
        System.out.println("2x comboer: " + combo);
        System.out.println(" ");


        n = 1;
        if (iteration <= 100) {
            i = 1;
        } else if (iteration <= 5000) {
            i = 10;
        } else {
            i = 100;
        }


        while (n <= c1/i) {
            System.out.print("█");
            n++;
        }
        n = 1;
        System.out.print(" sum = 2 | " + c1/i + " * "+ i );
        System.out.println(" ");
        while (n <= c2/i) {
            System.out.print("█");
            n++;
        }
        n = 1;
        System.out.print(" sum = 4 | " + c2/i + " * "+ i);
        System.out.println(" ");
        while (n <= c3/i) {
            System.out.print("█");
            n++;
        }
        n = 1;
        System.out.print(" sum = 6 | " + c3/i + " * "+ i);
        System.out.println(" ");
        while (n <= c4/i) {
            System.out.print("█");
            n++;
        }
        n = 1;
        System.out.print(" sum = 8 | " + c4/i + " * "+ i);
        System.out.println(" ");
        while (n <= c5/i) {
            System.out.print("█");
            n++;
        }
        n = 1;
        System.out.print(" sum = 10 | " + c5/i + " * "+ i);
        System.out.println(" ");
        while (n <= c6/i) {
            System.out.print("█");
            n++;
        }
        System.out.print(" sum = 12 | " + c6/i + " * "+ i);

        }
    }



//skrrrt