package zaddom3103;

/*Stwórz funkcję `indexOf` - która przyjmie dwa parametry - tablicę intów, oraz int, a która zwróci odpowiedź na pytanie,
        na którym (pierwszym w kolejności) indeksie znajduje zadany element w zadanej tablicy, lub -1 gdy nie znaleziono elementu*/

public class Zad0305 {
    public static void main(String[] args) {

    }
    public static int indexOf(int [] tab, int a){
        for(int i =0; i < tab.length; i++){
            if(tab[i] == a){
                return i;
            }
        }
        return -1;
    }
}
