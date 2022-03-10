public class Ch6GCD {
    public int gcd(int m, int n) {
        // it doesn't matter which is larger

        // assume m, n >= 1
        
        int r = n % m;

        while (r != 0) {
            n = m;
            m = r;
            r = n % m;
        }

        return m;
    }
    
}
