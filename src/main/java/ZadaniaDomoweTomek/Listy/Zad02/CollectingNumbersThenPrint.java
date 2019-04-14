package ZadaniaDomoweTomek.Listy.Zad02;

import java.util.ArrayList;
import java.util.Scanner;



public class CollectingNumbersThenPrint {
    public static void main(String[] args) {
        System.out.println(sum());
    }

    public static int sum() {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe: ");
        int suma = 0;
        int pobranaLiczba;
        ArrayList<Integer> list = new ArrayList<>(suma);
        System.out.println(list);
        while ((pobranaLiczba = scanner.nextInt()) != -1) {
            suma +=pobranaLiczba;
        }
        return suma;
    }
}
