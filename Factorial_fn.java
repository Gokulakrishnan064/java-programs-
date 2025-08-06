package main;
import java.util.Scanner;
public class Factorial_fn {
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b = 1;
		Factorial_fn.Factorial(a,b);	
	}
	public static void Factorial(int a,int b) {
		for (int i=1;i<=a;i++) {
			b=b*i;		 
		}
		 System.out.printf("The Factorial of %d is %d ",a,b );		
	}

}



