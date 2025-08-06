package main;
import java.util.*;
public class Powerfunction {
	public  static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		long a=sc.nextLong();
		long b=sc.nextLong();
		Powerfunction.Power(a,b);
	}
	public static void Power(long a,long b) {
		long c= (long) Math.pow(a, b);
			System.out.printf("The Power of the number is : %d",c);
		}
	

}
