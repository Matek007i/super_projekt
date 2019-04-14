package zadania;

import java.util.Random;

public class Zad3 {
    public static void main(String[] args) {
        Random random = new Random();

        int tab[] = new int[10];
        for (int i = 0; i < tab.length; i++) {
            tab[i] = random.nextInt(21) - 10;
            System.out.println(tab[i] + " ");

        }

        double suma = 0.0;
        for (int i = 0; i < tab.length; i++) {
            suma = tab[i] + suma;

        }

        double avg = suma / 10;

        int najW = tab[0];
        int najM = tab[0];

        for (int i = 0; i < tab.length; i++) {
            if (tab[i] > najW) {
                najW = tab[i];
            }
        }

        for (int i = 0; i < tab.length; i++) {
            if (tab[i] < najM) {
                najM = tab[i];
            }

        }

        int mniejSR = 0;
        int wiekszSR = 0;

        for (int i = 0; i < tab.length; i++) {
            if (tab[i] < avg) {
                mniejSR++;
            }
            else wiekszSR++;

        }

        int odwrocenie;
        for (int i = 0; i < tab.length / 2; i++) {
            odwrocenie = tab[i];
            tab[i] = tab[tab.length - 1 - i];
            tab[tab.length - 1 - i] = odwrocenie;
        }
        System.out.println("Po odwroceniu: ");
        for (int i : tab) System.out.println(i + " ");
        System.out.println();
        System.out.println("Wynik sumowania: " + suma);
        System.out.println("Srednia artymetyczna: " + avg);
        System.out.println("Ilosc liczb mniejszych od sredniej: " + mniejSR);
        System.out.println("Ilosc liczb wiekszych od sredniej: " + wiekszSR);
        System.out.println("Najwieksza liczba to: " + najW);
        System.out.println("Najmniejsza liczba to: " + najM);
    }


}


