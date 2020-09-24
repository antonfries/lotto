package antonfries.lotto;

import java.util.Date;

public class Ziehung {
    private Date datum;
    private int superzahl;
    private Lottozahlen lottozahlen;

    public Ziehung() {
        datum = new Date();
        superzahl = (int) (Math.random() * 10);
        lottozahlen = new Lottozahlen();
    }

    public Lottozahlen getLottozahlen() {
        return lottozahlen;
    }

    public int getSuperzahl() {
        return superzahl;
    }
}
