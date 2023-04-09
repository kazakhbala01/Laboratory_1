public class Problem2 {
    // n - length of array
    // arr - array
    // average - average of array elements
    // return - returns average of array elements
    public static double calculateAverage(int[] arr, int n){
        if (n==0){
            return 0;
        }else{
            return (arr[n-1] + (n-1)*calculateAverage(arr, n-1))/n;
        }
    }
}