package main;
import java.util.*;
public class Leep {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the year");
		int a=sc.nextInt();
		if((a%4==0 && a%100!=0) ||(a%400==0)) {
			System.out.println("it is leap year");
		}
        else{
            System.out.println("it is not leap year");
        }
		
	}
}

	