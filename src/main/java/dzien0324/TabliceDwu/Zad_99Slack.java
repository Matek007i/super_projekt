package dzien0324.TabliceDwu;

public class Zad_99Slack {
    public static void main(String[] args) {
       int[] tab = {3,6};
       double result = srednia(tab);
        System.out.println(result);




    }

    public static double srednia(int[] tab){                        // liczenie sredniej z tablicy
        double r = 0.0;
        for(int el: tab){
            r += el;
        }
        return r / tab.length;


    }

}
