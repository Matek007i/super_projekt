package dzien0604.dziedziczenie;

public class DziedziczenieRunner {
    public static void main(String[] args) {
        Pojazd samochod = new Samochod(50,20,15.0);
        Pojazd rower = new Rower(20, 2, 10);
        Pojazd Statek = new Statek(50,50.0);

        System.out.println(samochod.getPredkosc());
        System.out.println(rower.getPredkosc());

        jedzPan(samochod);
        jedzPan(rower);

        koloWymien((Samochod) samochod);



    }
    public static void jedzPan(Pojazd pojazd){
        pojazd.jedz();
        if(pojazd instanceof Samochod){
            System.out.println(((Samochod) pojazd).getSpalanie());
        }
        }
    public static void koloWymien(KoloWymienic KoloWymienic){
        KoloWymienic.wymienKolo();
    }




}
