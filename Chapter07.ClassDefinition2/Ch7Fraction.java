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
}