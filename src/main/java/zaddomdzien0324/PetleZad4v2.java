package zaddomdzien0324;
import java.util.Scanner;

public class PetleZad4v2 {
    public static void main(String[] args) {
        int sum = sum();
        System.out.println(sum);
    }

    public static int sum (){
        Scanner scanner = new Scanner(System.in);
        int suma = 0;
        for(; ; ){
            System.out.println("podaj liczbe: " );
            int wczytanaLoczba = scanner.nextInt();
            if(wczytanaLoczba == 0){
            break;
            }
            suma += wczytanaLoczba;
        }
        return suma;
    }
}
