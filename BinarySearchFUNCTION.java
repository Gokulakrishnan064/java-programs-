package main;
import java.util.Scanner;
public class BinarySearchFUNCTION {
	public static int binary(int arr[],int target) {
		int left=0;
		int right=arr.length-1;
		while(left<=right) {
			int mid=(left+(right-left))/2;
			if(arr[mid]==target) {
				System.out.println("Target found at index"+mid);
				return mid;
			}
			else if(arr[mid]>target) {
				right=mid-1;
			}
			else {
				left=mid+1;
			}
			System.out.println(target +"is arrested");
		}
		return -1;
	}
	public static void main(String[]args) {
		int arr[]= {1,2,3,4,5,6,7,8,9};
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value to search");
		int target=sc.nextInt();
		int ans=binary(arr,target);
		System.out.println(ans);
	}
}
