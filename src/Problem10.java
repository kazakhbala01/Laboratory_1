public class Problem10 {
    // a and b - input numbers
    // return - returns great common divisor of a and b
    public static int calculateGCD(int a, int b) {
        if (a == 0)
            return b;
        return calculateGCD(b % a, a);
    }
}