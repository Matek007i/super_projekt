package dzien0604.dziedziczenie;

public abstract class Pojazd {
    private double maxPr;
    private int iloscKol;
    private double predkosc;

    public abstract void jedz();
    public abstract void hamuj();

    public Pojazd(double maxPr, int iloscKol, double predkosc) {
        this.maxPr = maxPr;
        this.iloscKol = iloscKol;
        this.predkosc = predkosc;
    }

    public double getPredkosc(){
    return predkosc;
}
}