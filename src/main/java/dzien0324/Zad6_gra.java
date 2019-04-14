package dzien0324;

import java.util.Random;
import java.util.Scanner;


public class Zad6_gra {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int liczbaWylosowana = random.nextInt(101);
        int iloscProb = 0;
        for (;;) {
            System.out.println("Wprowadz liczbe: ");
            int liczbaGracza = scanner.nextInt();
            iloscProb++;
            if(liczbaGracza > liczbaWylosowana){
                System.out.println("Za duzo!");
            } else if (liczbaGracza < liczbaWylosowana){
                System.out.println("Za malo!");
            } else {
                System.out.println("Trafiles)" + " ZA " +iloscProb);
                break;
            }


        }

    }
}
