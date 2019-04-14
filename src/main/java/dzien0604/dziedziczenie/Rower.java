package dzien0604.dziedziczenie;

public class Rower extends Pojazd implements KoloWymienic{
    @Override
    public void jedz() {
        System.out.println("Rower jedzie");
    }

    public Rower(double maxPr, int iloscKol, double predkosc) {
        super(maxPr, iloscKol, predkosc);
    }

    @Override
    public void hamuj() {
        System.out.println("Rower hamuje");
    }

    @Override
    public void wymienKolo() {
        System.out.println("wymieniam kolo w rowerze");
            }
}
