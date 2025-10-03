package Strings;
import java.util.*;
public class Reversingstring {
	public static String reverse(String s) {
		StringBuffer sb = new StringBuffer();
		String str = "";
        String[] words = s.split(" ");
        for (String w : words) {
        	for(int i = w.length()-1 ; i >=0 ; i--) {
        		str+= w.charAt(i);
        	}
        	str+= " ";
		}
        return str;
        
	}
	public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();
    String ans = reverse(s);
    System.out.println(ans);
    sc.close();
}
}
	


