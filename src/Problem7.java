public class Problem7 {
    public static int[] reverseArray(int[] arr, int i, int j){
        //Tail Recursion.
        if(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            reverseArray(arr, i+1, j-1);
        }
        return arr;
    }
}