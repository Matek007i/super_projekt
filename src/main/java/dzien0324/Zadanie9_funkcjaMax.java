package dzien0324;

public class Zadanie9_funkcjaMax {
    public static void main(String[] args) {
        int[] tab = {3, 2, 5};
        int res = max(tab);
        System.out.println(res);
    }

    public static int max(int[] tab){
        int max = tab[0];
        for (int i = 1; i < tab.length; i++) {            // funkcja na max element w tabeli
            if (max < tab[i]) {
                max = tab[i];
            }
        }
        return max;
    }
}





