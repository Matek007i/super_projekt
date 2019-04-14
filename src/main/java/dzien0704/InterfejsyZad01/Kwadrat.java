package dzien0704.InterfejsyZad01;

public class Kwadrat implements Obliczenia {
    private int dlugosc;

    public Kwadrat(int dlugosc) {
        this.dlugosc = dlugosc;
    }

    @Override
    public double policzPole() {
        return dlugosc * dlugosc;
    }

    @Override
    public double policzObwod() {
        return 4 * dlugosc;
    }

    @Override
    public double policzObjetosc(int wysokosc) {
        return dlugosc*dlugosc*wysokosc;
    }
}
