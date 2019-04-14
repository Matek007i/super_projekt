package zaddom3103;

/*Stwórz funkcję `indicesOf` - która zadziała analogicznie do metody z zadania 5, z tymże zwróci w wyniku tablicę, zawierającą wszystkie indeksy,
        na których znajduje się zadany element w zadanej tablicy.
        Np. dla tablicy {5,4,2,2} i parametru drugiego =2 zwróci {3,4}*/

public class Zad0306 {
    public static void main(String[] args) {

    }
    public static int[] indicesOf(int tab[], int val){
        int [] result = new int[coutOf(tab, val)];
        int index = 0;
        for(int i = 0; i < tab.length; i++){
            if(tab[i] == val){
                result[index] = i;
                index++;
            }
        }
        return result;
    }

    public static int coutOf(int[] tab, int val){
        int counter = 0;
        for(int el : tab){
            if(el == val){
                counter++;
            }
        }
        return counter;
    }
}
