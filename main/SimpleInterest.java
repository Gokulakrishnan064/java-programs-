package main;
import java.util.*;
public class SimpleInterest {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the principle amount");
		int p=sc.nextInt();
		System.out.println("Enter the no of years");
		int n=sc.nextInt();
		System.out.println("Enter the rate of intrest");
		double r=sc.nextDouble();
		double c=((p*n*r)/100);
		System.out.println("simple intrest is "+c);
	}
}
		
		