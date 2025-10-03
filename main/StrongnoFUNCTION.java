package main;
import java.util.*;
public class StrongnoFUNCTION {
	public static boolean strong(int a) {
		int dup=a;
		int sum=0;
		while(dup!=0) {
			int rem=dup%10;
			int fact=1;
			for(int i=1;i<=rem;i++) {
				fact=fact*i;				
			}
			sum=sum+fact;
			dup=dup/10;
		}
		return sum==a;
	}
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no");
		int st=sc.nextInt();
		if(strong(st)) {
			System.out.println("Strong NO");
		}
		else {
			System.out.println("NOT Strong NO");
		}
	}

}
