package main;
import java.util.*;
public class FactorialMethod {
	public static int fact(int a) {
		int factorial=1;
		for (int i=1;i<=a;i++) {
			factorial=factorial*i;
		}
		return factorial;
	}
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number for fatorial");
		int num=sc.nextInt();
		int result=fact(num);
		System.out.println(result);
	}

}
