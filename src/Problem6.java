class Problem6 {
    // n - input number
    // a - power of n
    // return - returns n to the of a
    public static int calculatePower(int n, int a) {
        if (n == 0) {
            return 0;
        } else if (a == 0) {
            return 1;
        } else {
            return n * calculatePower(n, a - 1);
        }
    }
}