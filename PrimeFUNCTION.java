package main;
import java.util.*;
public class PrimeFUNCTION {
	public static boolean prime(int a) {
		if(a<=1) {
			return false;
		}
		for(int i=2;i<=Math.sqrt(a);i++) {
			if(a%i==0) {
				return false;
			}
		}
		return true;
	}
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no");
		int pr=sc.nextInt();
		boolean chect=prime(pr);
		if(chect) {
			System.out.print("prime");
		}
		else {
			System.out.print("not prime");
		}
		
		
	}

}
