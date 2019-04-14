package dzien0704.wyjatki;


import java.util.Random;

public class Dice {

    public boolean sprwadzLiczbe(int liczba)
    throws BadNumberException{
        Random random = new Random();
        int i = random.nextInt(6)+1;

        if(i == liczba){
            System.out.println("udalo sie");
            return true;
        } else if (liczba < 1 || liczba > 6){
            throw new BadNumberException("Ups");
        }else{
            System.out.println("Bledna odpowiedz");
            return false;
        }

    }
}
