package Strings;
import java.util.*;
public class nonrepeatvalue {
	public static void isreapted(String s) {
		for(int i=0;i<s.length();i++) {
			for(int j=i+1;j<s.length();j++) {
				if(s.charAt(i)!=s.charAt(j)) {
					System.out.println(i);
				}
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		isreapted(s);
	}

}
