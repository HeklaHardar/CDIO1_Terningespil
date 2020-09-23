public class Terningespil {

    public static void main(String[] args) {
        // TerningKast.Kast();

        TerningKast HentKommando = new TerningKast();

        int sumafterninger = HentKommando.VaerdiTerning1() + HentKommando.VaerdiTerning2();

        System.out.println(HentKommando.VaerdiTerning1() + " " + HentKommando.VaerdiTerning2());

        System.out.println(sumafterninger);
    }
}