package Dzien0330.whilee;

import java.util.Scanner;

public class ZadanieWhile {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int liczba = scanner.nextInt();
        int i = 1;
        int suma = 0;
        while (i <= liczba) {
            suma += i;
            i++;
        }
        System.out.println(suma);
    }
}
