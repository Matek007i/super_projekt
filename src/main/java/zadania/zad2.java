package zadania;

import java.util.Scanner;


public class zad2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int wynik = 1;
        for (int i = 0; i < m; i++) {
            wynik = wynik * n;
        }
        System.out.println(wynik);


    }
}


