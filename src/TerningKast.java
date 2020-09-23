import java.lang.Math;

public class TerningKast {
    int max = 7;
    int min = 1;


    int Terning1 = (int) (Math.random() * (max - min) + min);

    int Terning2 = (int) (Math.random() * (max - min) + min);

    int Sumafterninger = Terning1 + Terning2;

    public int VaerdiTerning1() {
        return Terning1;
    }

    public int VaerdiTerning2() {
        return Terning2;
    }

    public int Vaerdiafsum() {
        return Sumafterninger;
    }
/* Gammel metode, ikke i brug
    static void Kast() {

        TerningKast terning1 = new TerningKast();
        TerningKast terning2 = new TerningKast();

        // System.out.println("        " + Terning2);

        //System.out.println("Den første terning viser: " + terning1 +
        //                  " og den anden terning viser: " + terning2);
        //System.out.println("Tilsammen har de værdien: " + sumafterninger);
    }
*/
}
