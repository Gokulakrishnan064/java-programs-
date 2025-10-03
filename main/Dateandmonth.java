package main;
import java.util.*;
public class Dateandmonth {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the date");
		int date=sc.nextInt();
		System.out.println("enter the month");
		int month=sc.nextInt();
		if(month>=1||month<=12) {
			if(month==2&&date>=1&&date<=28) {
				System.out.println("Valid");
			}
			else if(month==4||month==6||month==9||month==11&&date>=1&&date<=30) {
				System.out.println("valid");
			}
			else if(month==1||month==3||month==5||month==7||month==8||month==10||month==12&&date>=1&&date<=31) {
				System.out.println("valid");				
			}
			else {
				System.out.println("invalid");
			}
		}
		else {
			System.out.println("invalid");
		}
	}

}
