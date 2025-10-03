package Strings;
import java.util.*;
public class Countupper {
	public static int isupper(String s) {
		int count=0;
		char []s1=s.toCharArray();
		for(int i=0;i<s1.length;i++) {
			if(s1[i]>='A' && s1[i]<='Z') {
				count++;
			}	
			}
		return count;
		}
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		System.out.println(isupper(s));
	}

}
