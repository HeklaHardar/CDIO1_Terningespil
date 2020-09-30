

import java.util.Scanner;

public class terningespil {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int terning1;
        int terning2;
        int sum;
        int n = 0;
        int combo = 0;
        int iteration = 999;
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
            System.out.println("n = " + n + "        " + terning1 + "        " + terning2);
            System.out.println("Sum er: " + sum);
            System.out.println("-----------------------------");

            if (terning1 == terning2) {
                combo++;
                System.out.println("2x comboer: " + combo);
                System.out.println(" ");
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
        int i = 1;
        System.out.println("2x comboer: " + combo);
        System.out.println(" ");


        n = 1;
        if (iteration >= 99) {
            i = 10;
        }else if (999 >= iteration){
            i = 100;
        } else if (iteration <= 99) {
            i = 1;
        }


        while (n <= c1/i) {
            System.out.print("█");
            n++;
        }
        n = 1;
        System.out.print(c1/i + " * "+ i );
        System.out.println(" ");
        while (n <= c2/i) {
            System.out.print("█");
            n++;
        }
        n = 1;
        System.out.print(c2/i + " * "+ i);
        System.out.println(" ");
        while (n <= c3/i) {
            System.out.print("█");
            n++;
        }
        n = 1;
        System.out.print(c3/i + " * "+ i);
        System.out.println(" ");
        while (n <= c4/i) {
            System.out.print("█");
            n++;
        }
        n = 1;
        System.out.print(c4/i + " * "+ i);
        System.out.println(" ");
        while (n <= c5/i) {
            System.out.print("█");
            n++;
        }
        n = 1;
        System.out.print(c5/i + " * "+ i);
        System.out.println(" ");
        while (n <= c6/i) {
            System.out.print("█");
            n++;
        }
        System.out.print(c6/i + " * "+ i);

        }
    }



//skrrrt