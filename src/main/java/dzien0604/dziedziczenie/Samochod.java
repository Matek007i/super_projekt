package dzien0604.dziedziczenie;

public class Samochod extends Pojazd implements KoloWymienic {
    private int spalanie;

    public int getSpalanie() {
        return spalanie;
    }

    public void setSpalanie(int spalanie) {
        this.spalanie = spalanie;
    }

    public Samochod(double maxPr, int iloscKol, double predkosc) {
        super(maxPr, iloscKol, predkosc);
    }

    @Override
    public void jedz() {
        System.out.println("Samochod jedzie");
    }

    @Override
    public void hamuj() {
        System.out.println("Samochod hamuje");
    }

    @Override
    public void wymienKolo() {
        System.out.println("wymieniam kolo w samochodzie");
    }
}
