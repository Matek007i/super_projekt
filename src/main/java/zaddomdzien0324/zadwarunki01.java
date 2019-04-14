package zaddomdzien0324;

import java.util.Scanner;


public class zadwarunki01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj pierwsza liczbe: ");
        int liczba = scanner.nextInt();
        System.out.println("Podaj druga liczbe: ");
        int liczba1 = scanner.nextInt();
        System.out.println("Podaj trzecia liczbe: ");
        int liczba2 = scanner.nextInt();

        System.out.println("Najmniejsza liczba to " + najmniejsza(liczba, liczba1, liczba2));
        System.out.println("Najwieksza liczba to " + najwieksza(liczba, liczba1, liczba2));

    }

    public static int najwieksza(int liczba, int liczba1, int liczba2) {    // deklarowanie warunku liczba, liczba1, liczba2
        if (liczba >= liczba1 && liczba >= liczba2)                       // jesli liczba1 wieksza rowna liczba2, i liczba wieksza rowna licbza2
            return liczba;  // zwroc liczba
        else if (liczba1 >= liczba && liczba1 >= liczba2)  // jezeli liczba1 wieksza rowna liczba i liczba1 wieksza rowna liczba 2
            return liczba1; // zwroc liczba1
        else // w przeciwnym wypadku zwroc liczba2
            return liczba2;
    }

    public static int najmniejsza(int liczba, int liczba1, int liczba2) {
        if (liczba <= liczba1 && liczba <= liczba2)
            return liczba;
        else if (liczba1 <= liczba && liczba1 <= liczba2)
            return liczba1;
        else
            return liczba2;
    }

}
