package dzien0324;

public class Zad13_slack {
    public static void main(String[] args) {

        int result1 = minimum(6, 3);
        int result2 = minimum(-1, 22);
        System.out.println(result1);
        System.out.println(result2);

    }

    public static int minimum (int a, int b){
        if(a < b){
            return a;
        } else {
            return b;
        }




    }
}
