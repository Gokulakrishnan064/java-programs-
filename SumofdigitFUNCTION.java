package main;
import java.util.*;
public class SumofdigitFUNCTION {
	public static int sum(int a) {
		int orginal=a;
		int sum=0;
		while(a!=0) {
			int rem=a%10;
			sum=sum+rem;
			a=a/10;
		}
		return sum;
	}
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the Nth number");
		int num=sc.nextInt();
		int sumofdigit=sum(num);
		System.out.print(sumofdigit);
	}

}
