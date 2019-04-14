package dzien0604.Enumy.Zadanie01;

public enum Day {
    PONIEDZIALEK(1,true),
    WTOREK(2, true),
    SRODA(3, true),
    CZWARTEK(4, true),
    PIATEK(5, false),
    SOBOTA(6, false),
    NIEDZIELA(7, true);

    private int dzienTygodnia;
    private boolean czyPracujacy;

    Day(int dzienTygodnia, boolean czyPracujacy) {
        this.dzienTygodnia = dzienTygodnia;
        this.czyPracujacy = czyPracujacy;
    }



    public boolean isCzyPracujacy() {
        return czyPracujacy;
    }
}
