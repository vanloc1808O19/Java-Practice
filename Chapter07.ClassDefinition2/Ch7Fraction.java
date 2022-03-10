public class Ch7Fraction {
    private int numerator;

    private int denominator;

    // default constructor
    public Ch7Fraction() {
        setNumerator(0);
        setDenominator(1);

        // this (0,1);
    }

    public Ch7Fraction(int n, int d) {
        numerator = n;
        denominator = d;
    }

    public Ch7Fraction (int number) {
        numerator = number;
        denominator = 1;
    }

    // copy constructor
    public Ch7Fraction (Ch7Fraction f) {
        numerator = f.getNumerator();
        denominator = f.getDenominator();
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

    private static int gcd_euclid(int m, int n) {
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

        int gcd = Ch7Fraction.gcd_euclid(num, den);

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

    public Ch7Fraction add(int n) {
        Ch7Fraction nf = new Ch7Fraction(n, 1);

        Ch7Fraction sum = add(nf);

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

    public Ch7Fraction subtract(int n) {
        Ch7Fraction nf = new Ch7Fraction(n, 1);

        Ch7Fraction diff = subtract(nf);

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

    public Ch7Fraction multiply(int n) {
        Ch7Fraction nf = new Ch7Fraction(n, 1);

        Ch7Fraction prod = multiply(nf);

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

    public Ch7Fraction divide(int n) {
        Ch7Fraction nf = new Ch7Fraction(n, 1);

        Ch7Fraction quot = divide(nf);

        return quot;
    }

    public static Ch7Fraction min(Ch7Fraction f1, Ch7Fraction f2) {
        // convert to decimals and compare

        double d1 = f1.decimal();
        double d2 = f2.decimal();

        if (d1 <= d2) {
            return f1;
        } else {
            return f2;
        }
    } 

    private double decimal() {
        // return the decimal equivalent
        return (double) getNumerator() / (double) getDenominator();
    }
}