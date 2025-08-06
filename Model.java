package main;
import java.util.*;
public class Model {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		char ch=sc.next().charAt(0);
		if(ch=='a' || ch=='e'|| ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U') {
			System.out.print("vowels");
		}
		else {
			System.out.print("consonant");
		}

	}

}
