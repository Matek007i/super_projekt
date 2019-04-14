package Dzien0330;

import java.util.Scanner;

public class Zad14 {
    public static void main(String[] args) {

        int sum = sum(5, 3);
        System.out.println(sum);

    }

    public static int sum(int k, int r) {
        int suma = 0;
        for (int i = 10; i < 100; i++) {
            if (i % k == r) {
                suma += i;
            }
        }
        return suma;

    }
}

