public class Ch7Fraction {
    private int numerator;

    private int denominator;

    public Ch7Fraction(int n, int d) {
        numerator = n;
        denominator = d;
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setNumerator(int n) {
        numerator = n;
    }

    public void setDenominator(int d) {
        if (d == 0) {
            // fatal error

            System.err.println("Fatal error");

            System.exit(1);
        }

        denominator = d;
    }

    public String toString() {
        return getNumerator() + "/" + getDenominator();
    }

    private int gcd_euclid(int m, int n) {
        int r = n % m;

        while (r != 0) {
            n = m;
            m = r;
            r = n % m;
        }

        return m;
    }

    public Ch7Fraction simply() {
        int num = getNumerator();
        int den = getDenominator();

        int gcd = gcd_euclid(num, den);

        Ch7Fraction simp = new Ch7Fraction(num / gcd, den / gcd);

        return simp;
    }

    public Ch7Fraction add(Ch7Fraction fr) {
        int a, b, c, d;

        a = this.getNumerator();
        b = this.getDenominator();

        c = fr.getNumerator();
        d = fr.getDenominator();

        Ch7Fraction sum = new Ch7Fraction(a * d + b * c, b * d);

        sum = sum.simply();

        return sum;
    }

    public Ch7Fraction subtract(Ch7Fraction fr) {
        int a, b, c, d;

        a = this.getNumerator();
        b = this.getDenominator();

        c = fr.getNumerator();
        d = fr.getDenominator();

        Ch7Fraction diff = new Ch7Fraction(a * d - b * c, b * d);

        diff = diff.simply();

        return diff;
    }

    public Ch7Fraction multiply(Ch7Fraction fr) {
        int a, b, c, d;

        a = this.getNumerator();
        b = this.getDenominator();

        c = fr.getNumerator();
        d = fr.getDenominator();

        Ch7Fraction prod = new Ch7Fraction(a * c, b * d);

        prod = prod.simply();

        return prod;
    }

    public Ch7Fraction divide(Ch7Fraction fr) {
        int a, b, c, d;

        a = this.getNumerator();
        b = this.getDenominator();

        c = fr.getNumerator();
        d = fr.getDenominator();

        Ch7Fraction quot = new Ch7Fraction(a * d, b * c);

        quot = quot.simply();

        return quot;
    }
}