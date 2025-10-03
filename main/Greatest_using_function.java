package main;
import java.util.*;
public class Greatest_using_function {
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		Greatest_using_function.Greatest(a,b);	
	}
	public static void Greatest(int a,int b) {
		if(a>b) {
			System.out.printf("The greatest number of %d and %d is %d :",a,b,a);
		}
		else {
			System.out.printf("The greatest number of %d and %d is %d :",a,b,b);			
		}
	}

}
