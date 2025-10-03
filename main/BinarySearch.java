package main;
import java.util.*;
public class BinarySearch {
	public static void main(String[]args) {
		int[]arr= {7,12,23,34,45,56,67,78,90};	
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the target");
		int target=sc.nextInt();
		int left=0;
		int right=arr.length-1;
		while(left<=right) {
			int mid=left=(right-left)/2;
			if(arr[mid]==target) {
				System.out.println(arr[mid]);
			}
			else if(arr[mid]>target) {
				right=mid-1;
			}
			else {
				left=mid+1;
			}
		}
		
		}
	}


