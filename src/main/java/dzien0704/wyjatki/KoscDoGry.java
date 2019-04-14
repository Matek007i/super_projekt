//package dzien0704.wyjatki;
//
//import java.util.Random;
//import java.util.Scanner;
//
//public class KoscDoGry {
//    public static void main(String[] args) {
//        Random random = new Random();
//        Scanner scanner = new Scanner(System.in);
//        int liczbaWylosowana = random.nextInt(7) - 1;
//
//        for (; ; ) {
//            System.out.println("Wprowadz liczbe: ");
//            int i = scanner.nextInt();
//            if (i > liczbaWylosowana) {
//                System.out.println("bledna odpowiedz, sproboj ponownie");
//            } else if (i < liczbaWylosowana) {
//                System.out.println("bledna odpowiedz, sproboj ponownie");
//            } else {
//                System.out.println("UDalo sie :)");
//                break;
//            try {
//
//            }catch (IndexOutOfBoundsException e) {
//                System.out.println(e.getMessage());
//                System.out.println("Bledna odpowiedz, sproboj ponownie");
//
//                }
//            }
//        }
//    }
//}
//
//
