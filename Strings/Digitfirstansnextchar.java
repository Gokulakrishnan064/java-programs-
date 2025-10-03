package Strings;
import java.util.*;
public class Digitfirstansnextchar {
	public static String digitandchar(String s) {
		String dig="";
		String cha="";
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(ch>='0'  && ch<='9') {
				dig=dig+ch;
			}
			else if((ch >= 'A' && ch <= 'Z') ||ch>='a'  && ch<='z') {
				cha=cha+ch;
			}
		}
		return dig+cha;
		
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		System.out.println(digitandchar(s));

	}

}
