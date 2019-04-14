package zaddomdzien0324;

import java.util.Scanner;


public class zadswitchmsc9warunkiver2 {
    public static void main(String[] args) {

        System.out.println("Podaj liczbe od 1-12 by poznac nazwy miesiaca: ");
        Scanner scanner = new Scanner(System.in);
        int scanner1 = scanner.nextInt();
        switch (scanner1) {
            case 1:
                System.out.println("1 Styczen");
                break;
            case 2:
                System.out.println("2 Luty");
                break;
            case 3:
                System.out.println("3 Marzec");
                break;
            case 4:
                System.out.println("4 Kwiecien");
                break;
            case 5:
                System.out.println("5 Maj");
                break;
            case 6:
                System.out.println("6 Czerwiec");
                break;
            case 7:
                System.out.println("7 Lipiec");
                break;
            case 8:
                System.out.println("8 Sierpien");
                break;
            case 9:
                System.out.println("9 Wrzesien");
                break;
            case 10:
                System.out.println("10 Pazdziernik");
                break;
            case 11:
                System.out.println("11 Listopad");
                break;
            case 12:
                System.out.println("12 Grudzien");
                break;
            default:
                System.out.println("Od 1 - 12. Rok ma 12 mscy.");
        }
    }
}
