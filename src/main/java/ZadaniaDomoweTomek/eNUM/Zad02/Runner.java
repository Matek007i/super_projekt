package ZadaniaDomoweTomek.eNUM.Zad02;

public class Runner {
    public static void main(String[] args) {
        Samochod samochod = new Samochod("Opel", "Kadet", Kolor.CZARNY);
        Samochod samochod1 = new Samochod("Audi","a4", Kolor.NIEBIESKI);
        Samochod samochod3 = new Samochod("BMW","e5", Kolor.ZOLTY);


        System.out.println(samochod);
        System.out.println(samochod1);
        System.out.println(samochod3);

    }
}
