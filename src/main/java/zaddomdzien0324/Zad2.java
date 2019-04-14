package zaddomdzien0324;

import java.util.Scanner;

public class Zad2 {
    public static void main(String[] args) {

        double a;
        double b;           //deklarowanie dowch zmiennych typ double a i b

        System.out.println("Podaj liczbe do przeliczenia tj. Celcjusz - > Fahrenheit: ");
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextDouble();       // pobieranie od uzytkownika zmiennej a

        b = 1.8 * a + 32;        //
        System.out.println("Celcjusz - > Fahrenheit: " + b);


    }
}
