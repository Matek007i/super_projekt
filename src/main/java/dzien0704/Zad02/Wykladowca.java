package dzien0704.Zad02;

public class Wykladowca extends Osoba {
    private Uczelnia uczelnia;

    public Wykladowca(String imie, int age) {
        super(imie, age);
    }

    public Wykladowca(String imie, int age, Uczelnia uczelnia) {
        super(imie, age);
        this.uczelnia = uczelnia;
    }
}
