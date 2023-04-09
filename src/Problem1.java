public class Problem1 {
    // n - length of array
    // arr - array
    // min - minimum number in the array
    // return - returns minimum number in the array
    public static int findMin(int[] arr, int n) {
        if (n == 1) {
            return arr[0];
        } else {
            int min = findMin(arr, n - 1);
            return Math.min(min, arr[n - 1]);
        }
    }
}
