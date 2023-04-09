public class Problem7 {
    // i - starting element index
    // j - ending element index
    // arr - array
    // temp - local variable
    // return - returns array elements in reverse order
    public static int[] reverseArray(int[] arr, int i, int j){
        if(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            reverseArray(arr, i+1, j-1);
        }
        return arr;
    }
}