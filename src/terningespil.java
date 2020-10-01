

import java.util.Scanner;

public class terningespil {
    public static void main(String[] args) {
        double TStart = System.currentTimeMillis();

        int terning1 = 0;
        int terning2 = 0;
        int sum = 0;
        int n = 0;
        int combo = 0;
        int iteration = 1000;
        double c1 = 0;
        double c2 = 0;
        double c3 = 0;
        double c4 = 0;
        double c5 = 0;
        double c6 = 0;
        double c7 = 0;
        double c8 = 0;
        double c9 = 0;
        double c10 = 0;
        double c11 = 0;
        double c12 = 0;
// Generates 2 dices and random values between 1 and 6
        while (n <= iteration) {
            terning1 = (int) (Math.random() * (7 - 1) + 1);
            terning2 = (int) (Math.random() * (7 - 1) + 1);
            sum = terning1 + terning2;
            n++;

// If the 2 dices have the same value add 1 to a "combo amount" int
            if (terning1 == terning2) {
                combo++;
            }
// Adds 1 to a specific kind of
            if (sum == 2){
                c2 = c2 + 1;
            } else if (sum == 3){
                c3 = c3 + 1;
            } else if (sum == 4){
                c4 = c4 + 1;
            } else if (sum == 5){
                c5 = c5 + 1;
            } else if (sum == 6){
                c6 = c6 + 1;
            } else if (sum == 7) {
                c7 = c7 + 1;
            } else if (sum == 8){
                c8 = c8 + 1;
            } else if (sum == 9){
                c9 = c9 + 1;
            } else if (sum == 10){
                c10 = c10 + 1;
            } else if (sum == 11){
                c11 = c11 + 1;
            } else if (sum == 12){
                c12 = c12 + 1;
            }



        }
        System.out.println("-----------------------------");
        System.out.println("n = " + (n - 1) + "        " + terning1 + "        " + terning2);
        System.out.println("Sum er: " + sum);
        System.out.println("-----------------------------");


        System.out.println("2x comboer: " + combo);
        System.out.println(" ");

        int i = 1;
        n = 1;
        if (iteration <= 100) {
            i = 1;
        } else if (iteration <= 5000) {
            i = 10;
        } else {
            i = 100;
        }


        while (n <= c2/i) {
            System.out.print("█");
            n++;
        }
        n = 1;
        System.out.print(" sum = 2 | " + c2/i + " * "+ i );
        System.out.println(" ");

        while (n <= c3/i) {
            System.out.print("█");
            n++;
        }
        n = 1;
        System.out.print(" sum = 3 | " + c3/i + " * "+ i);
        System.out.println(" ");

        while (n <= c4/i) {
            System.out.print("█");
            n++;
        }
        n = 1;
        System.out.print(" sum = 4 | " + c4/i + " * "+ i);
        System.out.println(" ");

        while (n <= c5/i) {
            System.out.print("█");
            n++;
        }
        n = 1;
        System.out.print(" sum = 5 | " + c5/i + " * "+ i);
        System.out.println(" ");

        while (n <= c6/i) {
            System.out.print("█");
            n++;
        }
        n = 1;
        System.out.print(" sum = 6 | " + c6/i + " * "+ i);
        System.out.println(" ");

        while (n <= c7/i) {
            System.out.print("█");
            n++;
        }
        n = 1;
        System.out.print(" sum = 7 | " + c7/i + " * "+ i);
        System.out.println(" ");

        while (n <= c8/i) {
            System.out.print("█");
            n++;
        }
        n = 1;
        System.out.print(" sum = 8 | " + c8/i + " * "+ i);
        System.out.println(" ");

        while (n <= c9/i) {
            System.out.print("█");
            n++;
        }
        n = 1;
        System.out.print(" sum = 9 | " + c9/i + " * "+ i);
        System.out.println(" ");

        while (n <= c10/i) {
            System.out.print("█");
            n++;
        }
        n = 1;
        System.out.print(" sum = 10 | " + c10/i + " * "+ i);
        System.out.println(" ");

        while (n <= c11/i) {
            System.out.print("█");
            n++;
        }
        n = 1;
        System.out.print(" sum = 11 | " + c11/i + " * "+ i);
        System.out.println(" ");
        while (n <= c12/i) {
            System.out.print("█");
            n++;
        }
        n = 1;
        System.out.print(" sum = 12 | " + c12/i + " * "+ i);

        System.out.println(" ");

        System.out.println(System.currentTimeMillis()-TStart + " ms to execute");

        }


    }



//skrrrt