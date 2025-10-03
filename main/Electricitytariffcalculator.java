package main;
import java.util.*;
public class Electricitytariffcalculator {

	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1) Domestic 2) commercial 3) industry");
		int a=sc.nextInt();
		switch(a) {
		case 1:
			System.out.println("domestic");
			System.out.println("enter the Number of unit");
			double unit=sc.nextDouble();
			System.out.println(unit*3.0);
			break;
		case 2:
			System.out.println("commercial");
			System.out.println("enter the Number of unit");
			double units=sc.nextDouble();
			System.out.println(units*5.0);
			break;
		case 3:
			System.out.println("industry");	
			System.out.println("enter the Number of unit");
			double uni=sc.nextDouble();
			System.out.println(uni*8.0);
			break;
		default:
			System.out.println("NOT FOUND");
			break;		
		}		
	}
}
