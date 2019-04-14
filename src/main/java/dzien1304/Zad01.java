package dzien1304;
import java.util.Random;
import java.util.Scanner;

public class Zad01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe: ");
        int a = scanner.nextInt();
        int[] tab = new int[a];
        {
            Random r = new Random();
            for (int i = 0; i < tab.length; i++) {
                tab[i] = r.nextInt();
                System.out.println(tab[i]);
            }
        }
    }
}
