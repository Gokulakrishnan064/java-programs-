package main;
import java.util.*;
public class Perfect_no {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value:");
		int a=sc.nextInt();
		int sum=0;
		int b=a/2;
		for(int i=1;i<=b;i++)
		{
			if(a%i==0)
			{
				sum=sum+i;
			}
		}
		if(sum==a)
		{
			System.out.println("it is a prefect no");
		}
		else {
				System.out.println("it is not a prefect no");
				
			}
		}
	  }
	 
