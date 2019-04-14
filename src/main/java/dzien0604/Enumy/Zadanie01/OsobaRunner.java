package dzien0604.Enumy.Zadanie01;

public class OsobaRunner {
    public static void main(String[] args) {
        Osoba osoba = new Osoba(Day.WTOREK);
        Osoba osoba2 = new Osoba(Day.WTOREK);

        System.out.println(osoba.getDzienUrodzenia() == osoba2.getDzienUrodzenia());
        System.out.println(osoba2.getDzienUrodzenia().isCzyPracujacy());
    }
}
