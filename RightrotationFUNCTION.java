package main;
import java.util.Arrays;

public class RightrotationFUNCTION {
    
    // Reverse part of array between start and end
    public static void reverse(int[] arr, int start, int end) {
        while(start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9};
        int k = 3;
        k = k % arr.length;   // handle k > n
        reverse(arr, 0, arr.length-1);
        reverse(arr, 0, k-1);
        reverse(arr, k, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}
