package zadania;
import java.util.Scanner;
public class Zad1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj dzielnik");
        int dzielnik = scanner.nextInt();
        System.out.println("Podaj liczbe");
        int liczba = scanner.nextInt();

        for (int i = 1; i < liczba; i++) {
            if (i % dzielnik == 0) {
                System.out.println(i);

/*        for(int i = 1; i < liczba; i+= dzielnik){
            System.out.println(i);
            }
    }*/

            }
        }
    }
}

