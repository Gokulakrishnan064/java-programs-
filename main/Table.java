package main;
import java.util.*;
public class Table {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no of times:");
		int a=sc.nextInt();
		int b=1;
		System.out.println("enter the multiply no:");
		int c=sc.nextInt();
		
		for(int i=1;i<=a;i++)
		{
			b=c*i;
			System.out.println(i+"x"+c+"="+b);
		}
		
	}
	}