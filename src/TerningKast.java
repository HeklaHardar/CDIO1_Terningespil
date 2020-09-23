import java.lang.Math;

public class TerningKast {
    static void Kast() {


        int max = 7;
        int min = 1;


        int Terning1 = (int) (Math.random() * (max - min) + min);

        // System.out.println(Terning1);

        int Terning2 = (int) (Math.random() * (max - min) + min);

        // System.out.println("        " + Terning2);

        int sumafterninger = Terning1 + Terning2;

        System.out.println("Den første terning viser: " + Terning1 +
                " og den anden terning viser: " + Terning2);
        System.out.println("Tilsammen har de værdien: " + sumafterninger);

    }
}