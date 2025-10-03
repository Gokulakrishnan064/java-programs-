package main;
import java.util.*;
public class Menu {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter \n1)deposit\r\n"
				+ "2)withdraw\r\n"
				+ "3)ballenc\r\n"
				+ "4)exit \r\n"
				);
		int initial=10000;
		int a=sc.nextInt();
		switch(a) {
		case 1:
			System.out.println("deposit");
			System.out.println("enter the DEPOSIT amount");
			int deposit=sc.nextInt();
			initial=initial+deposit;
			System.out.println(initial);
			break;
		case 2:
			System.out.println("withdraw");
			System.out.println("enter the WITHDRAW amount");
			int withdraw=sc.nextInt();
			if(initial>withdraw) {
				if(withdraw %100 ==0) {
					System.out.println("collect the amount");
					initial=initial-withdraw;
				}
				else {
					System.out.println("enter the valid amount");
				}		
			}
			else {
				System.out.println("INSUFFIENT BALLENCE");
			}
			System.out.println(initial);
			break;
		case 3:
			System.out.println("ballence");
			System.out.println(initial);
			break;
		case 4:
			System.out.println("exit");
			System.out.println("thankyou");
			break;
		default:
			System.out.println("NOT FOUND");
		}
	}

}
