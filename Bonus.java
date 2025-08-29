package main;
import java.util.*;
public class Bonus {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the salary");
		int salary=sc.nextInt();
		double bonous=0;
		double totalsalary=salary;
		System.out.println("enter the experience");
		int experience=sc.nextInt();
		if(experience>=10) {
			bonous=((salary*10)/100);
			totalsalary=bonous+totalsalary;
		}
		else if(experience<=9&&experience>=5) {
			bonous=((salary*8)/100);
			totalsalary=bonous+totalsalary;
		}
		else if(experience<5) {
			bonous=((salary*5)/100);
			totalsalary=bonous+totalsalary;
		}
		System.out.println(totalsalary);
	}

}
