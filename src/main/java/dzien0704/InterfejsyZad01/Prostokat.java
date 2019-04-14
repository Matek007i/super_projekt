package dzien0704.InterfejsyZad01;

public class Prostokat implements Obliczenia {
    private int dlugosc;
    private int szerokosc;

    public Prostokat(int dlugosc, int szerokosc) {
        this.dlugosc = dlugosc;
        this.szerokosc = szerokosc;
    }

    @Override
    public double policzPole() {
        return dlugosc * szerokosc;


    }

    @Override
    public double policzObwod() {
        return 2 * dlugosc + 2 * szerokosc;
    }

    @Override
    public double policzObjetosc(int wysokosc) {
        return dlugosc*szerokosc*wysokosc;
    }
}
