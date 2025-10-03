package main;
import java.util.*;
public class ShoppingcardFUNCTION {
	public static int total(int item,Scanner sc) {
		int total=0;
		for(int  i=1;i<=item;i++) {
			System.out.println("enter price of the item "  +i+  " element");
			int price=sc.nextInt();
			total=total+price;
		}
		return total;	
	}
	public static double membership(int totalans,Scanner sc) {
		double discountamount;
		System.out.println("do you have membership card (true/false)");
		boolean mem=sc.nextBoolean();
		if(mem) {
			discountamount=((totalans*20)/100);
		}
		else {
			discountamount=((totalans*10)/100);
		}
		return totalans-discountamount;
	}
	public static double extradiscount(double membershipdiscoutamount) {
		double amount=0.0;
		if(membershipdiscoutamount>5000) {
			amount=((membershipdiscoutamount*5)/100);
		}
		
		return membershipdiscoutamount-amount;
	}
	public static double delivery(double extradiscount) {
		if(extradiscount<500) {
			extradiscount=extradiscount+50;
		}
		return extradiscount;
	}
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the total no of item :");
		int item=sc.nextInt();
		int totalans=total(item,sc);    
		System.out.println("Total Price (before discounts):         " +totalans);
		double membershipdiscoutamount=membership(totalans,sc);
		System.out.println("Total Price (before discounts):         " +totalans);
		System.out.println("After Membership Discount:              " +membershipdiscoutamount);
		double extradiscount=extradiscount(membershipdiscoutamount);
		System.out.println("After Extra Discount:                   " +extradiscount);
		double deliverycharge=delivery(extradiscount);        
		System.out.println("                                        --------");
		System.out.println("Final Amount (with delivery if needed): " + deliverycharge);
		
		
	}

}
