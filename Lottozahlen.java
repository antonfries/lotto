package antonfries.lotto;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class Lottozahlen {
    final int MAX = 49;
    private int[] lottozahlen;

    public Lottozahlen() {
        lottozahlen = ThreadLocalRandom.current().ints(1, MAX)
                .distinct().limit(6).toArray();
    }

    public int[] getLottozahlen() {
        return lottozahlen;
    }

    public Lottozahlen(int zahl1, int zahl2, int zahl3, int zahl4, int zahl5, int zahl6) {
        lottozahlen = new int[6];
        lottozahlen[0] = zahl1;
        lottozahlen[1] = zahl2;
        lottozahlen[2] = zahl3;
        lottozahlen[3] = zahl4;
        lottozahlen[4] = zahl5;
        lottozahlen[5] = zahl6;
    }

    @Override
    public String toString() {
        return "Lottozahlen{" +
                "lottozahlen=" + toString(lottozahlen) +
                '}';
    }

    public static String toString(int[] a) {
        if (a == null) {
            return "null";
        } else {
            int iMax = a.length - 1;
            if (iMax == -1) {
                return "[]";
            } else {
                StringBuilder b = new StringBuilder();
                b.append('[');
                int i = 0;

                while (true) {
                    if (a[i] < 10) {
                        b.append('0');
                    }
                    b.append(a[i]);
                    if (i == iMax) {
                        return b.append(']').toString();
                    }

                    b.append(", ");
                    ++i;
                }
            }
        }
    }

    public int vergleichen(Lottozahlen lottozahlen) {
        return Arrays.stream(this.lottozahlen)
                .distinct()
                .filter(x -> Arrays.stream(lottozahlen.getLottozahlen()).anyMatch(y -> y == x))
                .toArray().length;
    }
}
