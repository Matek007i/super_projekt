package dzien0324;

import java.util.Arrays;

public class Zad5_slack {
    public static void main(String[] args) {
        int[] tab = {10,15,20,30};

            exchange(0,1, tab);
        System.out.println(Arrays.toString(tab));                //zamienia elementy w tablicy tj 10,15,20,30
                                                                //zamienia na 15,10,20,30
    }

    public static void exchange(int a, int b, int[] tab){
        int tmp = tab[a]; //10
        tab[a] = tab[b]; // 15 15 20 30
        tab[b] = tmp;




        }

    }


