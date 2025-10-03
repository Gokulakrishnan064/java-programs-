package main;
//Q=896
public class Sortedarray {
	public static boolean checkarray(int arr[]) {
		boolean b=true;
		boolean c=true;
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]>arr[i+1]) {
				b=false;
			}
			if(arr[i]<arr[i+1]) {
				c=false;		
			}
			}
		return b||c;
		}
	public static void main (String[]args) {
		int arr[]= {1,2,3,4,5,6,7};
		boolean ans=checkarray(arr);
		System.out.println(ans);		
}
		}
			
	
		