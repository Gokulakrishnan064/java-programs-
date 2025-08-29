package main;
import java.util.*;
public class Secondlongestint {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int d=sc.nextInt();
		int larger=a;
		int small=Integer.MIN_VALUE;
		if(larger<b) {
			larger=b;	
			}
		if(larger<c) {
			larger=c;	
			}
		if(larger<d) {
			larger=d;	
			}
		if(a!=larger&&a>small) {
			small=a;
		}
		if(b!=larger&&b>small) {
			small=b;
		}if(c!=larger&&c>small) {
			small=c;
		}if(d!=larger&&d>small) {
			small=d;
		}
		System.out.printf("The second largest value is : "+small);
		
	}

}
