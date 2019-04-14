package dzien1304;

import java.util.Scanner;


public class Zad03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj liczbe");
        int a = scanner.nextInt();
        int[] tab = new int [a];
        System.out.println(coutTime(tab));


    }

    public static long coutTime(int [] tab) {
        long start = System.nanoTime();
        int sum = 0;
        for(int i =0; i < 9000; i++){

        }
        long stop = System.nanoTime();
        System.out.println(stop - start);
        return sum;
    }
}