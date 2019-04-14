package dzien0704.wyjatki;

import java.util.Scanner;

public class DiceRunner {
    public static void main(String[] args) {
        Dice dice = new Dice();
        Scanner scanner = new Scanner(System.in);

        int i = scanner.nextInt();
        boolean wynik = false;

        try{
            wynik = dice.sprwadzLiczbe(i);
        } catch (BadNumberException e){
            System.out.println("ups");
        }
        while(!wynik){
            System.out.println("Sproboj ponownie");
            i = scanner.nextInt();
            try{
                wynik = dice.sprwadzLiczbe(i);
                //jezeli metoda rzuci wyjatkiem
            } catch (BadNumberException e){
                System.out.println("podales liczbe poza zakresem");
            }
        }
    }
}
