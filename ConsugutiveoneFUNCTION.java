package main;

import java.util.Arrays;

public class ConsugutiveoneFUNCTION {
	public static int conone(int arr[]){
		 int maxCount = 0;
		 int count=0;
	        for (int i : arr) {
	            if (i == 1) {
	                count++;
	                if(count>maxCount) {
	                	maxCount=count;
	                }
	            } else {
	                count = 0; 
	            }
	        }
	        return maxCount;
	    }
	public static void main(String[] args) {
        int arr[] = {1,1,1,1,1,1,0,0};
        int ans = conone(arr); 
        System.out.println(ans);
	}

}
