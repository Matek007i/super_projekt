package dzien0704.InterferjsyZad03;


import lombok.Data;
import lombok.ToString;

@Data
@ToString(callSuper = true)
public class Pracownik extends Osoba implements PrzedstawSie {
     private double pensja = 0.0;


    public Pracownik(String imie, String nazwisko, int age, double pensja) {
        super(imie, nazwisko, age);
        this.pensja = pensja;
    }
    @Override
    public void wyswietlDane(){
        System.out.println(this);
    }

}



