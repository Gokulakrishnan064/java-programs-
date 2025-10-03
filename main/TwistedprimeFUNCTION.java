package main;
import java.util.*;
public class TwistedprimeFUNCTION {
	public static boolean prime(int a) {
		if(a<=1) {
			return false;
		}
		for(int i=2;i<=a/2;i++) {
			if(a%i==0) {
				return false;
			}
		}
		return true;
	}
	public static int reverse(int n) {
		int rev=0;
		while(n!=0) {
			int mod=n%10;
			rev=rev*10+mod;
			n=n/10;
		}
		return rev;
	}
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		boolean b=prime(n);
		int rev=reverse(n);
		boolean c=prime(rev);
		if(b==c) {
			System.out.println(n+"  is a Twisted prime");
		}
		else {
			System.out.println(n+"  is not a Twisted prime");
		}
	}
}
