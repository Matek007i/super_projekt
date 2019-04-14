package zaddom3103.Zad12;

/*ad 12: Utwórz klasę Konto służącą do obsługi rachunku bankowego
        pola:
        •    stan konta
        •    właściciel konta(To osoba która ma imie, nazwisko, adress, pesel, wiek) (użyj kompozycji)
        •    numer konta
        metody:
        •    umożliwiające wpłacanie na rachunek
        •    umożliwiające wypłacanie z rachunku
        •    pobranie numeru konta*/

public class Zad12Runner {
    public static void main(String[] args) {

        Osoba osoba = new Osoba("Jan", "Kowalski", "01-914 Warszawa, 3-Maja 15", "231312312", 15);
        Konto konto = new Konto(0.0, osoba, "231231231");
        konto.wplasc(500);

        System.out.println(konto);

    }


}

