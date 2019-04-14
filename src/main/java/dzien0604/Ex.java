package dzien0604;




import java.util.Scanner;

public class Ex {
    public static void main(String[] args) {
        System.out.println(divide(10, 2));
        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj dzielnik");
        int i = scanner.nextInt();

        try {
            System.out.println(divide(10, i));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            i = scanner.nextInt();
            System.out.println(divide(10, i));
        }
    }

    public static int divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("dzielenie przez 0");
        }
        return a / b;
    }
}
