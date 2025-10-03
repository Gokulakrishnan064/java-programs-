package main;
import java.util.*;
public class Harshadnumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a=n;
		int rem;
		int sum = 0;
		while(n!=0) {
			rem=n%10;
			sum=sum+rem;
			n=n/10;		
		}
		System.out.println(sum);
		if(a%sum==0) {
			System.out.println("Harshad");
		}
		else {
			System.out.println("not Harshad");
		}
		
	}

}
