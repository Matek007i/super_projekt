package dzien0704.InterferjsyZad03;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Osoba implements PrzedstawSie {
    private String imie;
    private String nazwisko;
    private int age;


    @Override
    public void wyswietlDane() {
        System.out.println(this);

    }
}
