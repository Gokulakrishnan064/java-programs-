package main;
import java.util.*;
public class PalindromeFUNCTION {
	public static boolean palindrome(int a) {
		int orginal=a;
		int rev=0;
		while(a!=0) {
			int rem=a%10;
			rev=rev*10+rem;
			a=a/10;
		}
		return rev==orginal;
		
	}
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no");
		int pa=sc.nextInt();
		if(palindrome(pa)) {
			System.out.println("palindrome");
		}
		else {
			System.out.println(" not palindrome");
		}
	}

}
