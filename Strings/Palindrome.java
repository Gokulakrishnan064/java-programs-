package Strings;
import java.util.*;
public class Palindrome {
	public static String checkpalli(String s) {
		StringBuilder sb=new StringBuilder(s);
		sb.reverse();
		if(s.equals(sb.toString())) {
			return "palindrome";
		}
		else {
			return "Not palindrome";
		}
	}
	public static boolean checkpali2point(String s) {
		int start=0;
		int end=s.length()-1;
		while(start<end) {
			if(s.charAt(start)!=s.charAt(end)) {
				return false;
			}
			start ++;
			end --;
		}
		return true;
	}
		

	
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String ans=checkpalli(s);
		System.out.println(ans);
		boolean ans2=checkpali2point(s);
		if(ans2=true) {
			System.out.println("palindrome");
		}
		else {
			System.out.println(" not palindrome");
			
		}
		
		
	}

}
