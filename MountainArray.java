package main;
//Q=941
public class MountainArray {
	public static boolean arr(int arr[]) {
		int max=Integer.MIN_VALUE;
		int ind=-1;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
				ind=i;
			}
		}
		if(max==arr[0]||max==arr[arr.length-1]) {
			return false;
		}
		for(int i=0;i<ind;i++) {
			if(arr[i]>=arr[i+1]) {
				return false;
			}
		}
		for(int i=ind;i<arr.length-1;i++) {
			if(arr[i]<=arr[i+1]) {
				return false;
			}
		}
		return true;
	}	
	public static void main (String[]args) {
		int arr[]= {1,2,3,4,3,2,1};
		boolean ans=arr(arr);
		System.out.println(ans);
	}
}
	