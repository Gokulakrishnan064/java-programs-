package main;
import java.util.*;
public class EvenDigit {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		while(a!=0) {
			int b=a%10;
			if(b%2!=0) {
				System.out.println("odd");
				return;
			}
				a=a/10;	
					
			}
		System.out.println("yes even");
		}
		
	}



