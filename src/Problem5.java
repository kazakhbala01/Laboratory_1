public class Problem5 {
    // n - input number
    // return - returns  nth term in the Fibonacci series
    public static int calculateFibonacci(int n) {
        if (n == 0 || n == 1) {
            return n;
        } else {
            return calculateFibonacci(n - 1) + calculateFibonacci(n - 2);
        }
    }
}