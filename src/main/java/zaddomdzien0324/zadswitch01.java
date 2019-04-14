package zaddomdzien0324;

import java.util.Scanner;

public class zadswitch01 {
    public static void main(String[] args) {

        System.out.println("Podaj numer miesiaca aby poznac ile ma dni: ");
        Scanner scanner = new Scanner(System.in);
        int scanner1 = scanner.nextInt();
        switch (scanner1) {
            case 1:
                System.out.println("Styczen ma 31 dni");
                break;
            case 2:
                System.out.println("Luty ma 28 dni");
                break;
            case 3:
                System.out.println("Marzec ma 31 dni");
                break;
            case 4:
                System.out.println("Kwiecien ma 30 dni");
                break;
            case 5:
                System.out.println("Maj ma 31 dni");
                break;
            case 6:
                System.out.println("Czerwiec ma 30 dni");
                break;
            case 7:
                System.out.println("Lipiec ma 31 dni");
                break;
            case 8:
                System.out.println("Sierpien ma 31 dni");
                break;
            case 9:
                System.out.println("Wrzesien ma 30 dni");
                break;
            case 10:
                System.out.println("Pazdziernik ma 31 dni");
                break;
            case 11:
                System.out.println("Listopad ma 30 dni");
                break;
            case 12:
                System.out.println("Grudzien ma 31 dni");
                break;
            default:
                System.out.println("Od 1 - 12. Rok ma 12 mscy.");
        }

    }
}

