package zaddomdzien0324;

import java.util.Scanner;

public class zadwarunki10 {
    public static void main(String[] args) {

        System.out.println("Podaj godzine aby poznac plan zajec: ");
        Scanner scanner = new Scanner(System.in);
        int scanner1 = scanner.nextInt();
        switch (scanner1) {
            case 8:
                System.out.println("8:00 Matematyka");
            case 9:
                System.out.println("9:00 Matematyka");
            case 10:
                System.out.println("10:00 Matematyka");
            case 11:
                System.out.println("11:00 Prawo");
            case 12:
                System.out.println("12:00 Prawo");
            case 13:
                System.out.println("13:00 Przerwa");
            case 14:
                System.out.println("14:00 Labortorium");
            case 15:
                System.out.println("15:00 Laboratorium");
            case 16:
                System.out.println("16:00 Systemy");
            case 17:
                System.out.println("17:00 Systemy");
            case 18:
                System.out.println("18:00 Systemy");
            default:
                System.out.println("Zajecia odbywaja sie w godzinach 8 - 18.");
        }

    }
}
