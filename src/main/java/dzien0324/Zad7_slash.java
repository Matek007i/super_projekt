package dzien0324;

import java.util.Arrays;

public class Zad7_slash {
    public static void main(String[] args) {
        int[] tab = {1, 2, 3, 4, 5};
        double srd = srednia(tab);

        int lessThanAvg = lessThanValueCount(tab, srd);
         int[] result = lessThanValueTab(tab, srd, lessThanAvg);

        System.out.println(srd);
        System.out.println(lessThanAvg);
        System.out.println(result[0] + " " +result[1]);
        System.out.println(tabToString(result));
        System.out.println(Arrays.toString(result));
    }

    public static double srednia(int[] tab) {
        double srd = 0.0;
        for (int sr : tab) {
            srd += sr;                                                              // liczenie sredniej
        }
        return srd / tab.length;
    }

    public static int lessThanValueCount(int[] tab, double val) {
        int couter = 0;
        for (int el : tab) {                                                //zwracanie elementow ktore sa mniejsze od sredniej
            if (el < val) {
                couter++;
            }
        }
        return couter;
    }

    public static int[] lessThanValueTab(int[] tab, double val, int lessThanAvg) {
        int[] result = new int[lessThanAvg];
        int indexTabResult = 0;
        for (int el : tab) {                                            // zwracanie tabeli ktora zawiera tylko mniejsze elementy od sredniej
            if (el < val) {
                result[indexTabResult] = el;
                indexTabResult++;
            }

        }
        return result;
    }

    public static String tabToString(int[] tab){
        String result = "[";
        for(int el : tab){
            result += el + ",";             // tworzenie znakow  [ ]
        }
        result += "]";
        return result;
    }
}

