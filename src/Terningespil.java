public class Terningespil {

    public static void main(String[] args) {

        TerningKast HentKommando = new TerningKast();

        System.out.println(HentKommando.VaerdiTerning1() + " " + HentKommando.VaerdiTerning2());

        System.out.println(HentKommando.Vaerdiafsum());
    }
}