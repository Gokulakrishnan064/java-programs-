package main;
import java.util.*;
public class Magicno {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int rem;
		
		while(a>1 && a<9) {
			int sum=0;
		while(a!=0) {
			rem=a%10;
			sum=rem+sum;
			a=a/10;
		}
		a=sum;
		}
		if(a==1) {
			System.out.println("MAGIC");
		}
		else {
			System.out.println("NOT MAGIC");
		}
	}
}
