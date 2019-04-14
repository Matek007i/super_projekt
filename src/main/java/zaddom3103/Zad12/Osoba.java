package zaddom3103.Zad12;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Osoba {
    private String imie;
    private String nazwisko;
    private String adres;
    private String pesel;
    private int wiek;
}
