package dzien0324.TabliceDwu;

public class TabliceDwu {
    public static void main(String[] args) {
        //tablica tablic  /tablica glowna / tablica1 / tablica2 / tablica3
        int[][] oceny = {{3, 4, 2}, {2, 5, 6}, {4, 3, 2}};

        for (int i = 0; i < 3; i++) {                           // wyswietlanie ocen pierwszej tablicy tj 3,4,2
            System.out.print(oceny[0][i] + " ");
        }
        System.out.println();
        for (int i = 0; i < 3; i++) {
            System.out.print(oceny[2][i] + " ");                //wyswietlanie ocen trzeciej tablicy tj 4,3,2
        }

        System.out.println();
        for (int i = 0; i < 3; i++) {                   // wyswietlanie pierwszych ocen 3 tablic tj. 3,2,4
            System.out.print(oceny[i][0] + " ");
        }



    }
}
