import java.util.Scanner;

public class PointSystem {
    private String spiller;
    Scanner scan = new Scanner(System.in);
    Raflebæger raflebæger = new Raflebæger();
    private int sidsteHaand;
    private boolean Vinder = false;
    private boolean tur = true;

    public PointSystem() {

    }

    public void play() {


        System.out.print("Indtast navn for spiller 1: ");
        Spiller s1 = new Spiller(scan.nextLine());
        spiller = s1.playerString();
        System.out.print("Indtast navn for spiller 2: ");
        Spiller s2 = new Spiller(scan.nextLine());


        while (Vinder == false) {
            while (tur == true) {
                String vent = scan.nextLine();
                System.out.println();
                raflebæger.roll();
                System.out.println(raflebæger.toString());
                //System.out.println(raflebæger.sum());
                s1.updateScore(raflebæger.sum());
                System.out.println(s1.score());
                //Mangler variable for at gemme point
                //mangler && (point variabel) >=40
                // System.out.println(raflebæger.terning1.getVaerdi());
                if (raflebæger.terning1.getVaerdi() == 0 * raflebæger.terning2.getVaerdi() && raflebæger.sum() != 2 && s1.score() >= 40) {

                    System.out.println(s1.playerString() + " vinder!");

                    Vinder = true;
                    break;

                } else if (raflebæger.terning1.getVaerdi() == raflebæger.terning2.getVaerdi()) {

                    System.out.println("Ekstra tur til " + s1.spillerStarter());


                    if (raflebæger.sum() == 2) {

                        //Dobbelt etter = mister alle sine point
                        s1.updateScore(0);
                        System.out.println(s1.playerString() + " mister sine point.");
                        //Mangler (point variabel) = 0
                    }


                    if (raflebæger.sum() == 12) {


                        //Dobbelt sekser igen og man vinder spillet
                        //If statement hvis man har slået 2 seksere i træk så vinder man
                        if (raflebæger.sum() == sidsteHaand) {

                            System.out.println("Du vinder");
                            Vinder = true;
                            break;
                        }
                        sidsteHaand = raflebæger.sum();

                        //Boolean til at være true for at man har slået to seksere, som så tjekkes
                        //i if statement

                    }
                } else {
                    System.out.println("wrtywty");
                    tur = false;
                    break;
                }


            }

            if (Vinder == true) {

                break;
            }

            while (tur == true) {
                String vent = scan.nextLine();
                System.out.println();
                raflebæger.roll();
                System.out.println(raflebæger.toString());
                //System.out.println(raflebæger.sum());
                s1.updateScore(raflebæger.sum());
                System.out.println(s1.score());
                //Mangler variable for at gemme point
                //mangler && (point variabel) >=40
                // System.out.println(raflebæger.terning1.getVaerdi());
                if (raflebæger.terning1.getVaerdi() == 0 * raflebæger.terning2.getVaerdi() && raflebæger.sum() != 2 && s1.score() >= 40) {

                    System.out.println(s1.playerString() + " vinder!");

                    Vinder = true;
                    break;

                } else if (raflebæger.terning1.getVaerdi() == raflebæger.terning2.getVaerdi()) {

                    System.out.println("Ekstra tur til " + s1.spillerStarter());


                    if (raflebæger.sum() == 2) {

                        //Dobbelt etter = mister alle sine point
                        s1.updateScore(0);
                        System.out.println(s1.playerString() + " mister sine point.");
                        //Mangler (point variabel) = 0
                    }


                    if (raflebæger.sum() == 12) {


                        //Dobbelt sekser igen og man vinder spillet
                        //If statement hvis man har slået 2 seksere i træk så vinder man
                        if (raflebæger.sum() == sidsteHaand) {

                            System.out.println("Du vinder");
                            Vinder = true;
                            break;
                        }
                        sidsteHaand = raflebæger.sum();

                        //Boolean til at være true for at man har slået to seksere, som så tjekkes
                        //i if statement

                    }
                } else {
                    System.out.println("wrtywty");
                    tur = false;
                    break;
                }
            }
        }
    }


    //Find andet navn end stst
    /*

     */
    public String Spiller() {

        return spiller;

    }
}

  //måske lav til sin egen class
      /* while (true) {

       //Find andet navn end stst
       while (true) {
           //Mangler variable for at gemme point
           //mangler && (point variabel) >=40
           if (raflebæger.terning1 == raflebæger.terning2 && raflebæger.sum() != 2 && s1.score() >= 40) {

               System.out.println(s1.playerString() + " vinder!");
               //Boolean vinder = true
               break;

           } else if (raflebæger.terning1 == raflebæger.terning2) {

               System.out.println("Ekstra tur til " + s1.spillerStarter());


               if (raflebæger.sum() == 2) {

                   //Dobbelt etter = mister alle sine point
                   System.out.println(s1.playerString() + " mister sine point.");
                   //Mangler (point variabel) = 0
               }
               if (raflebæger.sum() == 12) {


                   //Dobbelt sekser igen og man vinder spillet
                   //If statement hvis man har slået 2 seksere i træk så vinder man

                   //Boolean til at være true for at man har slået to seksere, som så tjekkes
                   //i if statement

               }

           }
       }
       //skift navn til andet end stst
       while(s1.tur()==false){



       }

   }*/

