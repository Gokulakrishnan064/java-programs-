package main;
import java.util.*;
public class Odd_Even {
	public  static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		long a=sc.nextLong();
		Odd_Even.Oddoreven(a);
	}
	public static void Oddoreven(long a) {
		if(a%2==0) {
			System.out.println("EVEN");
		}
		else {
			System.out.println("ODD");
		}
	}
}
