package zaddomdzien0324;

import java.util.Scanner;

public class WarunkiZad03 {
    public static void main(String[] args){

        System.out.println("Program obliczy za ciebie podatek dochodowy");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj swoje dochody");

        double dochod = scanner.nextDouble();

        if (dochod<= 85528)  // jesli dochod jest mniejszy rowny 85.528 wykonaj
        {
            double podatek = (dochod*0.18) -556.02;
            System.out.println("Twoj podatek wynosi: " + podatek);
        }
        if (dochod>85528) // jesli dochod jest wiekszy od 85k~
        {
            double podatek1 = 14839.02+((dochod-85528)*0.32);
            System.out.println("TWoj podatek wynosi: " +podatek1);


        }
    }
}
