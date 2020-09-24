package antonfries.lotto;

import java.util.ArrayList;

public class Lotto {

    private ArrayList<Lottoschein> lottoscheine;
    private Ziehung ziehung = null;

    public Lotto() {
        lottoscheine = new ArrayList<>();
    }

    public void annehmenTipp(Lottoschein lottoschein) {
        lottoscheine.add(lottoschein);
    }

    public void ziehenLottoZahlen() {
        ziehung = new Ziehung();
        System.out.println("[DEBUG] Ziehung: " + ziehung.getLottozahlen().toString());
    }

    public void auswerten() {
        if (ziehung == null) {
            throw new RuntimeException("Es ist noch keine Ziehung erfolgt worden!");
        }
        int uebereinstimmungZahl;
        int index = 1;
        System.out.println("Klasse\tAnzahl Richtige");
        for (Lottoschein lottoschein : lottoscheine) {
            uebereinstimmungZahl = ziehung.getLottozahlen().vergleichen(lottoschein.getLottozahlen());
            System.out.print(index + "\t" + uebereinstimmungZahl + " Richtige");
            if (lottoschein.getSuperZahl() == ziehung.getSuperzahl()) {
                System.out.print(" + SZ");
            }
            System.out.println();
            System.out.println("[DEBUG] "+lottoschein.toString());
            index++;
        }
        lottoscheine = new ArrayList<>();
    }
}
