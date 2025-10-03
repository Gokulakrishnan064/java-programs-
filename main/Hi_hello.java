package main;
import java.util.*;
public class Hi_hello {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int a=sc.nextInt();
		if(a%3==0 && a%5==0) {
			System.out.println("hihello!");
		}
		else if(a%3==0) {
			System.out.println("hi!");
		}
		else if(a%5==0) {
			System.out.println("hello");
		}
		else {
			System.out.println("Invalid");
		}
		

	}

}
