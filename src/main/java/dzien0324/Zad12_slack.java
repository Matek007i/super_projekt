package dzien0324;

//przekazujesz jeden parametr i zwracana jest informacja czy liczba jest większa (bądź równa) od 20 Czyli dla 6 zwróci false , a dla 22 zwróci true//
import java.util.Scanner;

public class Zad12_slack {
    public static void main(String[] args) {

        System.out.println(isHigherThan20(22));  //true
        System.out.println(isHigherThan20(6)); // false

    }

    public static boolean isHigherThan20(int a) {
        return a > 20;

/*    public static boolean isHigherThan20(int a) {
        if (a > 20) {
            return true;
        } else {
            return false;
        }*/
    }
}
