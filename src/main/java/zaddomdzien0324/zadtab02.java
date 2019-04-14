package zaddomdzien0324;

import java.util.Random;


public class zadtab02 {
    public static void main(String[] args) {

        Random losliczba = new Random();
        int liczba = 0;
        int tab[] = new int[20];
        for (int i = 0; i < tab.length; i++) {
            tab[i] = losliczba.nextInt(10) + 1;

            System.out.print(tab[i] + " ");
        }
        for(int i = 1; i < 11; i++){                    // petla sprawdza 1-10 < 11 i pozwala uruchomic kolejna petle
            for(int j = 0; j < tab.length; j++){     // petal sprawdza index tabeli 1-20
                if(i == tab[j]){        // porownuje czy liczba i = liczbie z komurki
                    liczba++; // jezeli warunek wykonal sie poprawnie to zlicza.
                }
/*          O(n2)

            public static int cout(int[] tab val){
            int i = 0;
            for(int el : tab)
                if(el == tab);
                i++
               return i;
               }
               long count = IntStream.of(tab).filter(x -> x == val).cout();
               return (int) count;
 */
/*
               o(1)


 */
            }
            System.out.println();
            System.out.println("Liczba " + i+ " wystepuje " + liczba + " razy." );
            liczba = 0; // zerowanie "countera'
            System.out.println();
            System.out.println("w tym momecie jest cyfra " +i);
            System.out.println("petla sie konczy");
            System.out.println("KONIEC PETLI, AKTUALNA WARTOSC i = " +i);
        }

    }

}
