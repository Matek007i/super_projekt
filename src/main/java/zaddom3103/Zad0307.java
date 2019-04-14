package zaddom3103;

/*Napisz funkcje `isPerfectNum` która odpowie na pytanie, czy liczba zadana jako parametr jest doskonała.
        \Liczba doskonała to taka która jest równie sumie swoich dzielników tj.
        6 = 1+2+3*/

public class Zad0307 {
    public static void main(String[] args) {

    }

    public static boolean isPerfectNum(int n){
        return getSumOfDivide(n) == n;
    }
    public static int getSumOfDivide(int n){
        int suma = 0;
        for(int i = 1; i <= n/2; i++){
            if(n % i == 0){
                suma += i;
            }
        }
        return suma;
    }
}
