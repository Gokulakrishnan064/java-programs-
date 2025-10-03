package main;
import java.util.*;
public class Oddnopattern {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter thr no of row");
		int a=sc.nextInt();
		int odd=1;
		for(int i=1;i<=a;i++) {
				for(int j=1;j<=i;j++) {
					System.out.print(odd+" ");
					odd=odd+2;
				}
				System.out.println();
			}
		
	}

}
