package kyu7;

public class Arge {

    static int count = 0;
    static int sum = 0;

    public static int nbYear(int p0, double percent, int aug, int p) {

        sum = (int) (p0 + p0 * percent / 100 + aug);

        if (sum <= p) {
            p0 = nbYear(p0, percent / 100, aug, p);
            count++;
        }
        return count;
    }
}
