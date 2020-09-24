package antonfries.lotto;

public class Lottoschein {
    private String spielscheinNummer = "";
    private Lottozahlen lottozahlen;

    public Lottoschein(Lottozahlen lottozahlen) {
        for (int i = 0; i < 7; i++) {
            spielscheinNummer += (int) (Math.random() * 10);
        }
        this.lottozahlen = lottozahlen;

    }

    public Lottozahlen getLottozahlen() {
        return lottozahlen;
    }

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
