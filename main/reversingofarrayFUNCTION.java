package main;
import java.util.Arrays;

public class reversingofarrayFUNCTION {
   public static int[] reverse(int arr[]) {
        int[] ans = new int[arr.length];
        int index = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            ans[index] = arr[i];
            index++;
        }
        return ans; 
    }
   public static int[] reverse2point(int arr[]) {
	   int start=0;
	   int end=arr.length-1;
	   while(start<end) {
		   int temp=arr[start];
		   arr[start]=arr[end];
		   arr[end]=temp;
		   start++;
		   end--;  
	   }
	   return arr;
   }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9};
        int ans[] = reverse2point(arr);
        System.out.println(Arrays.toString(ans)); 
    }
}
