package zaddom3103;

/*Utwórz metodę, która przyjmuje dwa parametry - pierwszy to prędkość z jaką poruszał się Twój pojazd, a drugi to dopuszczalna prędkość.
        Metoda ma zwrocić wartość mandatu w przypadku przekroczenia dopuszczalnej prędkości. Każde przekroczenie o rozpoczęte 10 km/h to 100zł*/

public class Zad0315 {
    public static void main(String[] args) {
        System.out.println(mandat(90, 60));
        System.out.println(mandat(91, 60));

    }
    public static int mandat(double predkosc, int dopPredkosc){
        predkosc -= dopPredkosc;
        predkosc /= 10.0;

        int wartoscMandatu = (int) Math.ceil(predkosc) * 100;
        if(wartoscMandatu > 0){
            return wartoscMandatu;
        }else{
            return 0;
        }
    }
}
