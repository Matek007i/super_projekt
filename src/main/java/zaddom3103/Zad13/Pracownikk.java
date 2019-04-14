package zaddom3103.Zad13;


import lombok.Data;

@Data

public class Pracownikk {
    private String imie;
    private String drugieImie;
    private String naziwsko;
    private int wiek;
    private boolean czyKob;
    private double pensja;
    private String adres;

    public Pracownikk(String imie, String drugieImie, String naziwsko, int wiek, boolean czyKob, double pensja, String adres) {
        this.imie = imie;
        this.drugieImie = drugieImie;
        this.naziwsko = naziwsko;
        this.wiek = wiek;
        this.czyKob = czyKob;
        this.pensja = pensja;
        this.adres = adres;
    }

    public String toString() {
        return imie + " " + drugieImie + " " + naziwsko + " " + wiek + " " + toString(czyKob) + " "
                + pensja + " " + adres + " Do emerytury pozostalo:  "
                + emerytura(wiek, true) + " dni";
    }

    public static String toString(boolean czyKob) {
        return czyKob ? "Kobieta" : "Mezczyzna";
    }

    public static int emerytura(int wiek, boolean czyKob) {
        if (czyKob == true) {
            wiek -= 65;
        } else {
                wiek -= 60;
            }
        return wiek;
    }
    }









