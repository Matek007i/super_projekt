package dzien0324;

public class Zad4_slack {
    public static void main(String[] args) {
        int tab[][] = {{10, 15, 20, 30},
                {51, 231, 212, 12},
                {51, 21, 576, 21},
                {12, 3, 5, 8}};
        printArr(tab);
    }

    public static void printOneArr(int[] tab) {
        for (int i = 0; i < tab.length; i++) {
            System.out.print(tab[i] + " ");
        }
        System.out.println();
    }

    public static void printArr(int[][] tab) {
        for (int k = 0; k < tab.length; k++) {
            printOneArr(tab[k]);
        }
        /*for (int k = 0; k < 4; k++) {
            for (int i = 0; i < 4; i++) {                                    // tworzenie funkicji ktora wypluwa tablice
                System.out.print(tab[k][i] + " ");
            }
            System.out.println();
        }*/
        /*        System.out.print(tab[0][0] + " ");      //10
        System.out.print(tab[0][1] + " ");        //15
        System.out.print(tab[0][2]+ " ");        //20
        System.out.print(tab[0][3]+ " ")_;        //30
        System.out.println();              //enter
        System.out.print(tab[0][0]);      //51
        System.out.print(tab[1][1]);        //231
        System.out.print(tab[1][2]);        //212
        System.out.print(tab[1][3]);        //12*/
/*
        System.out.println();
        for (int i = 0; i < 4; i++) {
            System.out.print(tab[0][i] + " ");
            System.out.println();
        }
        for (int i = 0; i < 4; i++) {
            System.out.print(tab[1][i] + " ");
        }
*/


    }
}
