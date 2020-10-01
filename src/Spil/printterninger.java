package Spil;

public class printterninger {
    static String findTerning(int vaerdi){

        String billede;

        if (vaerdi==1){
            billede=" ___________\n" +
                    "|           |\n" +
                    "|           |\n" +
                    "|     O     |\n" +
                    "|           |\n" +
                    "|___________|";


        }else if (vaerdi==2){
            billede=" ___________\n" +
                    "|           |\n" +
                    "|   O       |\n" +
                    "|           |\n" +
                    "|       O   |\n" +
                    "|___________|";
        }else if (vaerdi==3){
            billede=" ___________\n" +
                    "|           |\n" +
                    "|  O        |\n" +
                    "|     O     |\n" +
                    "|        O  |\n" +
                    "|___________|";
        }else if(vaerdi==4){
            billede="___________\n" +
                    "|           |\n" +
                    "|   O   O   |\n" +
                    "|           |\n" +
                    "|   O   O   |\n" +
                    "|___________|";
        }else if (vaerdi==5){
            billede=" ___________\n" +
                    "|           |\n" +
                    "|  O     O  |\n" +
                    "|     O     |\n" +
                    "|  O     O  |\n" +
                    "|___________|";
        }else if (vaerdi==6){
            billede=" ___________\n" +
                    "|           |\n" +
                    "|  O  O  O  |\n" +
                    "|           |\n" +
                    "|  O  O  O  |\n" +
                    "|___________|";

        }else{
            billede="Ukendt værdi";
        }

        return billede;
    }

}
