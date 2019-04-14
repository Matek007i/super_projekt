package zaddom3103.Zad12;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Konto {
    private double stanKonta;
    private Osoba wlasciciel;
    private String numerKonta;

    public void wplasc(double kwota){
        stanKonta += kwota;

    }
    public void wyplac(double kwota){
        stanKonta -= kwota;
    }

}
