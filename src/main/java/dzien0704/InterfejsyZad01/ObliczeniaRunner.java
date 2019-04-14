package dzien0704.InterfejsyZad01;


public class ObliczeniaRunner {
    public static void main(String[] args) {
        Prostokat prostokat = new Prostokat(5, 6);
        Kwadrat kwadrat = new Kwadrat (10);
        Kolo kolo = new Kolo(5);

        System.out.println("Pole prostokata to: " +prostokat.policzPole() + "Obwod prostokata to: " + prostokat.policzObwod()
                +"Objetosc prostokata to: " + prostokat.policzObjetosc(5));
    }

    }

