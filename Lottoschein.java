package antonfries.lotto;

import java.util.stream.IntStream;

public class Lottoschein {
    private String spielscheinNummer = "";
    private final Lottozahlen lottozahlen;

    public Lottoschein(Lottozahlen lottozahlen) {
        IntStream.range(0, 7).forEach($ -> {
            spielscheinNummer += (int) (Math.random() * 10);
        });
        this.lottozahlen = lottozahlen;
    }

    public Lottozahlen getLottozahlen() {
        return lottozahlen;
    }

    /**
     * getSpielscheinNummer() nicht benötigt
     *
     * @return int
     */
    public int getSuperZahl() {
        return Integer.parseInt(String.valueOf(spielscheinNummer.charAt(spielscheinNummer.length() - 1)));
    }

    @Override
    public String toString() {
        return "Lottoschein{" +
                "spielscheinNummer='" + spielscheinNummer + '\'' +
                ", lottozahlen=" + lottozahlen.toString() +
                '}';
    }
}
