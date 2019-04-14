package zaddom3103;

/*
Stwórz funkcję `getSumSign` - która policzy sumę elementów przekazanej jako parametr tablicy intów. Następnie zwróci informację,
        czy znak tej sumy jest ujemny (wtedy zwróci -1), czy suma jest równa 0 (wtedy zwracamy 0), czy jest dodatnia (wtedy zwracamy 1)
*/

public class Zad0304 {
    public static void main(String[] args) {

    }

    public static int getSumSign(int[] tab){
        int suma = 0;
        for(int i = 0; i < tab.length; i++){
            suma += tab[i];
        }
        if(suma < 0){
            return -1;
        }
        else if(suma <0){
            return 1;
        }
        else{
            return 0;
        }
    }
}
