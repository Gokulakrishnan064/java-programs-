package main;

import java.util.Arrays;

public class MovetozeroFUNCTION {
	public static int []movezero(int arr[]){
		int ans[]=new int[arr.length];
		int index=0;
		for(int i:arr) {
			if(i!=0) {
				ans[index]=i;
				index++;				
			}
		}
		return ans;
		
	}
	public static void main(String[] args) {
        int arr[] = {1,0,0,0,6,0,8,0};
        int ans[] = movezero(arr); 
        System.out.println(Arrays.toString(ans)); 
	}

}
