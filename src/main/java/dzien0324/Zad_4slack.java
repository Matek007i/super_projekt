package dzien0324;

import java.util.Scanner;

public class Zad_4slack {
    public static void main(String[] args) {


        //scanner
        Scanner scanner = new Scanner(System.in);
        int przyprostokatna1 = scanner.nextInt();
        int przyprostokatna2 = scanner.nextInt();
        System.out.println(przeciwprostokatna(przyprostokatna1, przyprostokatna2));

        // pole kwadratu
        System.out.println(poleKwadratu(10));
        //pole prostokata
        System.out.println(poleProstokata(5, 6));
        //przeciwprostokatna
        System.out.println(przeciwprostokatna(3, 4));

    }

    public static int poleKwadratu(int a) {
        return a * a;                               //pole kwadratu

    }

    public static int poleProstokata(int a, int b) {

        return a * b;                               // pole prostokata
    }

    public static double przeciwprostokatna(int a, int b) {
        //c^2 = a^2 + b^2;
        return Math.sqrt(a * a + b * b);
    }
}
