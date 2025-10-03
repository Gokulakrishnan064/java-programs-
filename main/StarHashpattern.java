package main;
import java.util.*;
public class StarHashpattern {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int a=sc.nextInt();
		for(int i=1;i<=a;i++) {
			if(i%5!=0) {
				System.out.print("*");
			}
			if(i%5==0) {
				System.out.println("#");
			}		
		}
	}

}
