package main;
import java.util.*;
public class AmicablenoFUNCTION {
	public static int divisorsum(int n) {
		int sum=0;
		for(int i=1;i<=n/2;i++) {
			if(n%i==0) {
				sum=sum+i;
			}
		}
		return sum;	
	}
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in) ;
		int num=sc.nextInt();
		int num1=sc.nextInt();
		int ans=divisorsum(num);
		int ans1=divisorsum(num1);
		if(num==ans1 && num1==ans) {
			System.out.println("Amicable no");
		}
		else {
			System.out.println("Not Amicable no");
		}
	}
}
