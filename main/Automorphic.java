package main;
import java.util.*;
public class Automorphic {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int sq=a*a;
		int dummy=sq;
		int count=0;
		while(dummy!=0) {
			dummy=dummy/10;
			count++;
		}
		double math=Math.pow(10,(count+1)/2);
		int rhs=(int)(sq%math);
		if(rhs==a) {
			System.out.println("Automorphic");
		}
		else {
			System.out.println("not Automorphic");	
		}	
	}

}