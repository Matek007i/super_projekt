package Dzien0330.whilee;

import java.util.Scanner;

public class ZadWhileSilnia {
    public static void main(String[] args) {

/*
        System.out.println(silniaIt(5));
*/      int x = silniaRek(3);
        System.out.println(silniaRek(3));
    }

    public static int silniaIt(int n) {
        int iloczyn = 1;
        while (n > 0) {
            iloczyn *= n;
            n--;
        }
        return iloczyn;

    }

    public static int silniaRek(int n) {
        if(n == 1){

            return 1;
        }
        return n * silniaIt(n-1);
    }
}
