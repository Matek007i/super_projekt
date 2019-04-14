package Dzien0330;
import java.util.Scanner;
public class Sum {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
       System.out.println(sum(a,b));
        System.out.println(sum(15, 15, 5));

        System.out.println(sumV(10,15,20,30,40,50));
        System.out.println(maxV(10));
    }
    public static int sum(int a, int b){
        return a + b;
    }
    //przeciazenie(OVERLOAD)
    public static int sum(int a, int b, int c){
        return a + b+ c;
    }
    //public static int sim(int a, int b, double c){
    // int a + b +(int)c;

    public static int sum(int a, int b, int c, int ... d){
        int suma = 0;
        for(int el : d){
            suma += el;
        }
        return a + b + c + suma;
    }
    public static int sumV(int ... a){
        int suma = 0;
        for(int i = 0; i < a.length; i++){
            suma += a[i];
        }
        return suma;
    }
    public static int maxV(int f, int... tab){
        int max = 10;
        for(int i = 0; i < tab.length; i++){
            if(max < tab[i]){
                max = tab[i];
            }
        }
        return max;
    }
}
