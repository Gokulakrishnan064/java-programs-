package main;
import java.util.*;
public class TwistedPrimeinarrayFUNCTION {
	public static boolean prime(int i) {	
			if(i<=1) {
				return false; 
			}
			for(int j=2;j<=i/2;j++) {
				if(i%j==0) {
					return false;
				}
			}
			return true;
			
		}
	public static int twist(int i) {
		int rev=0;
		while(i!=0) {
			int mod=i%10;
			rev=rev*10+mod;
			i=i/10;
		}
		return rev;
	}
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the total no of element");
		int element=sc.nextInt();
		int [] arr=new int[element];
		for(int i=0;i<element;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println(Arrays.toString(arr));
		for(int i=0;i<arr.length;i++) {
			int num=arr[i];
			boolean ans=prime(num);
			int rev=twist(num);
			boolean revprime=prime(rev);
			if(ans && revprime) {
				System.out.println(num);			
				}
		}
	}	
	}
