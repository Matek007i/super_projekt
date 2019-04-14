package zaddomdzien0324;

import java.util.Scanner;


public class PetleZad01 {
    public static void main(String[] args){

        int liczba;           /// zmienna int nazwa - > liczba
        Scanner scanner = new Scanner(System.in); // skaner pobiera info od uzytkownika

        System.out.println("Podaj liczbe: ");   /// printowanie na ekranie "podaj ~
        liczba = scanner.nextInt(); // wprowadzona liczba zapisuje sie w pamieci programu jako "liczba"

        for(int i = 1; i <= liczba; i += 2) // petla wyrazenie poczatkowe zaczynamy liczyc od 1, warunek i jest mniejsze rowne liczbie, liczba +2
            System.out.print(i + " ");  // wyswietlenie

// for(int i = 1; i <= liczba; i++){
        // if(i % 2 == 1)
        //System.out.println(i);

    }
}
