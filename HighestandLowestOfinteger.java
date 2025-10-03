package main;
import java.util.*;
public class HighestandLowestOfinteger {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int low =a%10;
		int high=a%10;
		while(a!=0) {
			int b=a%10;
			if(low>b) {
				low=b;
			}
			else if(high<b) {
				high=b;
			}
			a=a/10;
		}
		System.out.println(low);
		System.out.println(high);


	}

}
