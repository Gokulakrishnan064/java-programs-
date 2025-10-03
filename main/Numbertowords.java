package main;
import java.util.*;
public class Numbertowords {
	public static void main (String[]args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int rev=0,temp=a;
		while(temp!=0) {
			rev=rev*10+temp%10;
			temp=temp/10;
		}
		while(rev!=0) {
			int rem=rev%10;
			rev=rev/10;
			switch(rem) {
			case 1:
				System.out.print("one ");
				break;
			case 2:
				System.out.print("two ");
				break;
			case 3:
				System.out.print("three ");
				break;
			case 4:
				System.out.print("four ");
				break;
			case 5:
				System.out.print("five ");
				break;
			case 6:
				System.out.print("six ");
				break;
			case 7:
				System.out.print("Seven ");
				break;
			case 8:
				System.out.print("eight ");
				break;
			case 9:
				System.out.print("nine ");
				break;
			case 0:
				System.out.print("Zero ");
				break;
			default:
				System.out.print("Not found ");
			}
			
		}
		
	}
	
}
