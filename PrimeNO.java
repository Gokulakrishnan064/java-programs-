package main;
import java.util.*;
public class PrimeNO {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		int a= sc.nextInt();
		for(int i=1;i<=a;i++) {
			if(a%i==0 && a%1==0) {
				System.out.println("prime");
			}
			else {
				System.out.println("Not prime");
			}					
		}
	}

}
