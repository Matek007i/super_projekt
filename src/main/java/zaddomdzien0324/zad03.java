package zaddomdzien0324;

public class zad03 {
    public static void main(String[] args) {

        int a = 5;          // deklarowanie dwoch zmiennych a = 5, b = 7
        int b = 7;
        System.out.print("Pole prostokąta: ");
        System.out.println(pole(a,b));
        System.out.print("Obwod prostokąta: ");
        System.out.println(obwod(a, b));
    }
    public static int pole(int a, int b){         // pole prostokata
        int pole = a*b;
        return pole;

    }
    public static int obwod(int a, int b){     // obwod prostokata
        int obwod = (2*a) + (2*b);
        return obwod;
    }
}
