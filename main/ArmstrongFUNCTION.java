package main;
import java.util.*;
public class ArmstrongFUNCTION {
	public static boolean armstrong(int a) {
		int orginal=a;
		int temp=a;
		int sum=0;
		int count=0;
		while(temp!=0) {
			temp=temp/10;
			count++;		
		}
		temp=a;
		while(temp!=0) {
			int rem=temp%10;
			sum=(sum+(int)(Math.pow(rem,count)));
			temp=temp/10;
		}	
		return sum==a;
	}
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no");
		int arms=sc.nextInt();
		if(armstrong(arms)) {
			System.out.println("ARMSTRONG NO");
		}
		else {
			System.out.println(" NOT ARMSTRONG NO");
		}
	}

}
