package zaddomdzien0324;

import java.util.Scanner;


public class PetleZad02 {
    public static void main(String[] args) {

        System.out.println("Podaj pierwsza liczbe: ");
        int liczba;
        Scanner scanner = new Scanner(System.in);
        liczba = scanner.nextInt();

        int liczba1 = 0;
        do {                              // warunek wykona sie przynajmniej raz
            System.out.println("Podaj druga liczbe, musi byc wieksza od pierwszej liczby");

            Scanner scanner1 = new Scanner(System.in);
            liczba1 = scanner1.nextInt();  // zapamietuje liczbe wprowadzona przez uzytkownika
        }
        while (liczba > liczba1);  // jesli liczba jest wieksza od liczba 1 wykonuje daej
        int suma = 0; // suma zaczyna lczyc od 0
        for (;liczba <= liczba1;) {
            suma = suma + liczba;
            liczba++;
        }

        System.out.println(suma);
    }
}
