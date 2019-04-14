package zaddomdzien0324;

import java.util.Arrays;
import java.util.Random;

public class ZadTablKlasa {
    public static void main(String[] args) {

        Random random = new Random();
        int[] tab = new int[20];
        for (int i = 0; i < tab.length; i++) {
            tab[i] = random.nextInt(10) + 1;

        }
        System.out.println(Arrays.toString(tab));
        int[] liczbaWystapien = new int[10];
        for (int el : tab) {
            liczbaWystapien[el - 1]++;

            for (int i = 0; i < 10; i++) {
                System.out.println(i+1 + " - " + liczbaWystapien[i]);
            }
        }
    }
}
