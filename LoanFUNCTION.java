package main;
import java.util.*;
public class LoanFUNCTION {
	public static boolean eligiblitu(int age,int salary,boolean loan,int credit,int amount ) {
		int loanamount=amount*20;
		if(age>60 || age<21) {
			System.out.println("the age is not in the range");
			return false;		
		}
		if(salary<25000) {
			System.out.println("the salary is not enough ");
			return false;
		}
		if(loan==true) {
			System.out.println("ther is a exixting loan");
			return false;
		}
		if(credit<700) {
			System.out.println("Not enough credit score");
			return false;			
			}
		if(loanamount<amount) {
			System.out.println("Loan amount is greater than salary");
			return false;		
		}
		return true;
	}
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the age");
		int age=sc.nextInt();
		System.out.println("Enter the salary");
		int salary=sc.nextInt();
		System.out.println("Dou you have existing loan");
		boolean loan=sc.nextBoolean();
		System.out.println("Enter the credit score");
		int credit=sc.nextInt();
		System.out.println("Enter the amount");
		int amount=sc.nextInt();
		boolean ans=eligiblitu(age,salary,loan,credit,amount );
		if(ans) {
			System.out.println("YOU ARE ELEGIBLE FOR LOAN");
		}
		else {
			System.out.println("YOU ARE NOT ELEGIBLE FOR LOAN");
		}
	
	}

}
