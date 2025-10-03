package main;
import java.util.Scanner;
 class Factorial {
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number for factorial");
		int a=sc.nextInt();
		int fact = 1;
		for (int i=1;i<=a;i++) {
			fact=fact*i;		 
		}
		 System.out.printf("The Factorial of %d is %d ",a,fact);		
	}

}
