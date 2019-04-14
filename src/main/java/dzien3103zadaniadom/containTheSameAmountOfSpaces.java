package dzien3103zadaniadom;


import java.util.Scanner;
public class containTheSameAmountOfSpaces {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj pierwszy ciag znakow");
        String lancuch1 = scanner.nextLine();
        System.out.println("podaj drugi ciag znakow");
        String lancuch2 = scanner.nextLine();


    }
    public static int coutChar(String lancuch1, String lancuch2, char ch){
        int couter = 0;
        for(char c : lancuch1.toCharArray() ){
            if ( c == ch){
                return couter++;
            }
        }
        return couter;
    }
}
