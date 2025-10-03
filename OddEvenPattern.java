package main;
import java.util.*;
public class OddEvenPattern {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the total no of rows");
		int a=sc.nextInt();
		int odd=1;
		int even=2;
		for(int i=1;i<=a;i++) {
			if(i%2!=0) {
				for(int j=1;j<=i;j++) {
					System.out.print(odd+" ");
					odd=odd+2;
				}
				System.out.println();
			}
			if(i%2==0) {
				for(int j=1;j<=i;j++) {
					System.out.print(even+" ");
					even=even+2;
				}
				System.out.println();
			}
				
			}
		}
		
		
	}
	





