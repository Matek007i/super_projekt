package Dzien0330;

import java.util.Scanner;

public class Zad6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();


        System.out.println(sumaCyfr(757));
        System.out.println(sumaCyfrR(i));
    }

    public static int sumaCyfr(int n) {
        int x = n % 10;  // reszta dzielenia z 10 - > najwieksza liczba 7
        int y = n / 10;


        int suma = 0;
        while (n != 0) {
            suma += n % 10;
            n /= 10;
        }
        return suma;
    }

    public static int sumaCyfrR(int n){
        if ( n == 0){
            return 0;
        }
        return n % 10 + sumaCyfrR(n/10);
    }


}




