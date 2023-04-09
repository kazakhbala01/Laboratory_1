public class Problem9 {
    // basis: (n!)/(((n-k)!)*(k!))
    // n - input number
    // k - input number
    // return - returns binomial coefficient of n and k
    public static int calculateBinomialCoefficient(int n, int k) {
        if (k == 0 || k == n) {
            return 1;
        } else {
            return calculateBinomialCoefficient(n - 1, k - 1) + calculateBinomialCoefficient(n - 1, k);
        }
    }
}
