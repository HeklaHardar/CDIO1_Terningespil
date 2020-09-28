public class Terningespil {

    public static void main(String[] args) {
        Raflebæger raflebæger = new Raflebæger();

        System.out.println(raflebæger.sum());

        System.out.println(raflebæger.roll().toString());

        System.out.println(raflebæger.sum());
    }
}