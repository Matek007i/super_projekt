package dzien0604.dziedziczenie;

public class Statek extends Pojazd {
    public Statek(double maxPr,  double predkosc) {
        super(maxPr, 0, predkosc);
    }

    @Override
    public void jedz() {
        System.out.println("Statek jedzie");
    }

    @Override
    public void hamuj() {
        System.out.println("Statek hamuje");
    }
}
