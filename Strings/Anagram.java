package Strings;
import java.util.*;
public class Anagram {
	public static String isanagram(String s, String s2) {
		char  a [] =s.toCharArray();
		char b []=s2.toCharArray();
		Arrays.sort(a);
		Arrays.sort(b);
		String c1=a.toString();
		String c2=b.toString();
		System.out.println(c1);
		System.out.println(c2);
		if(c1.equals(c2)) {
			return "Anagram";
		}
		else {
			return "Not Anagram";
		}
	}
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String s2=sc.nextLine();
		String ans=isanagram(s,s2);
		System.out.println(ans);
	}

}
