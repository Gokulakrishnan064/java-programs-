package main;

public class Butterflyypattern {
	public static void main(String[]args){
		int a=2;
		for(int i=1;i<=a;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			for(int j=1;j<=2*(a-i);j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();		
		}
		for(int i=a;i>=i;i--) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			for(int j=1;j<=2*(a-i);j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();		
		
	}
	
}}
