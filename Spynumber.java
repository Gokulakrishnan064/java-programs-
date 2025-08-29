package main;
import java.util.*;
public class Spynumber {
	public static void main (String[]args) { 
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int rem;
		int sum=0;
		int product=1;
		while(a!=0) {
			rem=a%10;
			sum=sum+rem;
			product=product*rem;
			a=a/10;
		}
		if(sum==product) {
			System.out.println("SPY");
		}
		else {
			System.out.println("NOt SPY");
		}
	}

}
