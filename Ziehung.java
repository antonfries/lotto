package antonfries.lotto;

import java.util.Date;

public class Ziehung {
    private final Date datum;
    private final int superzahl;
    private final Lottozahlen lottozahlen;

    public Ziehung() {
        datum = new Date();
        superzahl = (int) (Math.random() * 10);
        lottozahlen = new Lottozahlen();
    }

    @Override
    public String toString() {
        return "Ziehung{" +
                "datum=" + datum +
                ", superzahl=" + superzahl +
                ", lottozahlen=" + lottozahlen.toString() +
                '}';
    }

    public Lottozahlen getLottozahlen() {
        return lottozahlen;
    }

    public int getSuperzahl() {
        return superzahl;
    }
}
