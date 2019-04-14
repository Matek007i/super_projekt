package zaddomdzien0324;

import java.util.Scanner;

public class PetleZad04 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int liczba1 = 1;
        int suma = 0;

        while (liczba1 != 0) {
            System.out.println("Podaj liczbe: ");
            liczba1 = scanner.nextInt();
            suma = suma + liczba1;
        }

        System.out.println("Suma liczba wynosi: " + suma);
        System.out.println("koniec");
    }

}
