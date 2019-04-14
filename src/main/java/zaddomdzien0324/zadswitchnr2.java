package zaddomdzien0324;

import java.util.Scanner;

public class zadswitchnr2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj liczbe od 1-7 by poznac dni tygodnia.");

        int scanner1 = scanner.nextInt();
        switch (scanner1) {
            case 1:
                System.out.println("Poniedzialek");
                break;
            case 2:
                System.out.println("Wtorek");
                break;
            case 3:
                System.out.println("Sroda");
                break;
            case 4:
                System.out.println("Czwartek");
                break;
            case 5:
                System.out.println("Piatek");
                break;
            case 6:
                System.out.println("Sobota");
                break;
            case 7:
                System.out.println("Niedziela");
                break;
            default:
                System.out.println("Ziomus od 1-7. Jest tylko 7 dni tygodnia.");
        }
    }

}
