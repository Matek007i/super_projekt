package Dzien0330.whilee;

import java.util.Scanner;

public class SumUser {
    public static void main(String[] args) {
        int sum = sum();
        System.out.println(sum);
    }

    public static int sum() {
        Scanner scanner = new Scanner(System.in);
        int suma = 0;
        int pobranaLoczba;
        while ((pobranaLoczba = scanner.nextInt()) != 0) {
            suma += pobranaLoczba;
        }
        return suma;
    }

}
