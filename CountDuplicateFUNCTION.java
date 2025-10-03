package main;
import java.util.*;
public class CountDuplicateFUNCTION {
	public static void duplicate(int[]arr) {
		boolean [] arr1=new boolean[arr.length];
		for(int i=0;i<=arr.length-1;i++) {
			if(arr1[i]) continue;
			int count=1;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					count++;
					arr1[j]=true;
				}
			}
			if(count>1) 
				System.out.println(arr[i]+" repeats "+count);		
		}
	}
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the total element");
		int element=sc.nextInt();
		int []arr=new int[element];
		System.out.println("enter the elements");
		for(int i=0;i<=element;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println(Arrays.toString(arr));
		duplicate(arr);
	}

}
