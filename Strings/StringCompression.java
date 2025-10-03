package Strings;
import java.util.*;
import java.util.Scanner;

public class StringCompression {
	public static String compression(String s) {
		int freq[]=new int[26];
		for(char c:s.toCharArray()) {
			freq[c-'a']++;
		}
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<freq.length;i++) {
			if(freq[i]!=0) {
				char c=(char)(i+'a');
				sb.append(c).append(freq[i]);
			}
		}
		return sb.toString();
	}
		public static void main(String[]args) {
			Scanner sc=new Scanner(System.in);
			String s=sc.nextLine();
			String ans=compression(s);
			System.out.println(ans);

		
	}
}
