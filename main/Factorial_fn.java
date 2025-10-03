package main;
import java.util.Scanner;
public class Factorial_fn {
	static void fact(int factno) {
		int  result =1;
		for (int i=0;i<=factno;i++) {
			factno=factno*i;
			result=result*i;			
		}
	}
	public static void maun(String[]args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		fact(a);
	}
}



