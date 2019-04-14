package ZadaniaDomoweTomek.eNUM.Zad02;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Samochod {
    private String nazwa;
    private String model;
    private Kolor kolor;
}
