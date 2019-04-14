package dzien0324;

import java.util.Random;

public class Zad1_Slack {
    public static void main(String[] args) {
        Random random = new Random();

        int tab[] = new int[10];
        for (int i = 0; i < tab.length; i++) {
            tab[i] = random.nextInt(21) - 10;    // tworzenie tabeli z 10 roznymi elementami w przedziale -10 / 10

        }
        for (int i = 0; i < tab.length; i++) {
            System.out.print(tab[i] + " ");
        }
        double avg = 0.0;
        for (int i = 0; i < tab.length; i++) {
            avg += tab[i];
        }
        avg = avg / tab.length;
        System.out.println();
        System.out.println("Srednia: " + avg);
        int lessThanAvg = 0;
        int moreThanAvg = 0;
        for (int element : tab) {                   // ilosc elementow wiekszych/mniejszych od sredniej
            if (element < avg) {
                lessThanAvg++;
            } else if (element > avg) {
                moreThanAvg++;
            }
        }
        System.out.println("Mn: " + lessThanAvg);
        System.out.println("W: " + moreThanAvg);

        for (int i = tab.length - 1; i >= 0; i--) {   // odwrocenie kolejnosci
            System.out.print(tab[i] + " ");
        }
        int maxi = tab[0];
        for (int i = 1; i < tab.length; i++) {            // max element w tabeli
            if (maxi < tab[i]) {
                maxi = tab[i];
            }
        }
        int min = tab[0];
        for (int i = 1; i < tab.length; i++) {                // najmniej element w tabeli
            if (min > tab[i]) {
                min = tab[i];
            }
        }
        System.out.println();
        System.out.println("Max: " + maxi);
        System.out.println("Min: " + min);
    }
}
