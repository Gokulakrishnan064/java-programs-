package main;
import java.util.*;
public class Sum {
	public static void main(String[]args) {
		long oddsum=0;
		long evensum=0;
		long rem;
		Scanner sc=new Scanner(System.in);
		long a=sc.nextLong();
		while(a>0) {
			rem=(a%10);
			if(a%2==0) {
				evensum=rem+evensum;
			}
			else {
				oddsum=rem+oddsum;
			}
			a=a/10;
		}
		System.out.println(evensum +" "+ oddsum);
	
	}

}
