public class Problem3 {
    // n - input number
    // i - default number for checking conditions, which equals to 2
    // isPrime - function that checks is n is prime or not
    public static boolean isPrime(int n, int i) {
        if (n < 2) {
            return false;
        }
        if (n % i == 0) {
            return false;
        }
        if (i * i > n) {
            return true;
        }
        return isPrime(n, i + 1);
    }
}