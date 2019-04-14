package dzien0704.InterfejsyZad01;

import lombok.AllArgsConstructor;

public class Kolo implements Obliczenia {
    private int promien;

    public Kolo(int promien) {
        this.promien = promien;
    }

    @Override
    public double policzPole() {
        return Math.PI*(promien*promien);

    }

    @Override
    public double policzObwod() {
        return 2*Math.PI*promien;

    }

    @Override
    public double policzObjetosc(int wysokosc) {
        return Math.PI*(2*promien) /4;

    }
}
