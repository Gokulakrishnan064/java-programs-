package main;
import java.util.Scanner;
public class Alter_num{
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the start value:");
		int a=sc.nextInt();
		System.out.println("enter the end value:");
		long b=sc.nextInt();	
		long sum=0;
		long  product=1;
		for(long i=a;i<=b;i=i+2) {
			sum=sum+i;
			product=product*i;
			System.out.println("\n"+i);
		}
			
			System.out.println("\n"+"the sum is:"+sum);
			System.out.println("\n"+"the product is:"+product);
			
		}

}



	
	
