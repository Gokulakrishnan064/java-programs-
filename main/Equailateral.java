package main;
import java.util.*;
public class Equailateral {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		double a=sc.nextDouble();
		double b=sc.nextDouble();
		double c=sc.nextDouble();
		if(a==b&&b==c) {
			System.out.println("it is Equilateral");
		}				
		else if (a == b || b == c || a == c) {
			System.out.println("The triangle is Isosceles");
		 }
		else {
            System.out.println("The triangle is Scalene");
        }	     
	}
}

