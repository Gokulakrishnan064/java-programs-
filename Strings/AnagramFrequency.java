package Strings;

import java.util.Scanner;

public class AnagramFrequency {
	public static boolean isanagramfreq(String s,String s2) {
		if(s.length()!=s2.length()) {
			return false;
		}
		int freq[]=new int[26];
		for(char c:s.toCharArray()) {
			freq[c-'a']=freq[c-'a']+1;
		}
		for(char c:s2.toCharArray()) {
			freq[c-'a']=freq[c-'a']-1;
		}
		for(int i:freq) {
			if(i!=0) {
				return false;
			}
		}
		return true;
	}
	public static void main(String[]args) {
			Scanner sc=new Scanner(System.in);
			String s=sc.nextLine();
			String s2=sc.nextLine();
			boolean ans=isanagramfreq(s,s2);
			if(ans=true) {
				System.out.println("Anagram");
			}
			else {
				System.out.println(" not Anagram");
			}

	



}

}
