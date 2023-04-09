public class Problem10 {
    public static int calculateGCD(int a, int b) {
        if (a == 0)
            return b;
        return calculateGCD(b % a, a);
    }
}