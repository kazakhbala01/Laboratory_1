public class Problem9 {
        public static int calculateBinomialCoefficient(int n, int k) {
            if (k == 0 || k == n) {
                return 1;
            } else {
                return calculateBinomialCoefficient(n - 1, k - 1) + calculateBinomialCoefficient(n - 1, k);
            }
        }
    }
