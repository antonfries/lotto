package antonfries.lotto;

public class Main {
    public static void main(String[] args) {
        Lotto lotto = new Lotto();
        Lottozahlen lottozahlen1 = new Lottozahlen(1, 2, 3, 4, 5, 6);
        Lottozahlen lottozahlen2 = new Lottozahlen(7, 8, 9, 10, 11, 12);
        Lottozahlen lottozahlen3 = new Lottozahlen(13, 14, 15, 16, 17, 18);
        Lottozahlen lottozahlen4 = new Lottozahlen(19, 20, 21, 22, 23, 24);
        Lottozahlen lottozahlen5 = new Lottozahlen(25, 26, 27, 28, 29, 30);
        Lottozahlen lottozahlen6 = new Lottozahlen(31, 32, 33, 34, 35, 36);
        Lottoschein lottoschein1 = new Lottoschein(lottozahlen1);
        Lottoschein lottoschein2 = new Lottoschein(lottozahlen2);
        Lottoschein lottoschein3 = new Lottoschein(lottozahlen3);
        Lottoschein lottoschein4 = new Lottoschein(lottozahlen4);
        Lottoschein lottoschein5 = new Lottoschein(lottozahlen5);
        Lottoschein lottoschein6 = new Lottoschein(lottozahlen6);
        lotto.annehmenTipp(lottoschein1);
        lotto.annehmenTipp(lottoschein2);
        lotto.annehmenTipp(lottoschein3);
        lotto.annehmenTipp(lottoschein4);
        lotto.annehmenTipp(lottoschein5);
        lotto.annehmenTipp(lottoschein6);
        lotto.ziehenLottoZahlen();
        lotto.auswerten();
    }
}
