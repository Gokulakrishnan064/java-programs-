package Strings;
import java.util.*;
public class Removiwhitespace {
	public static void Removiwhitespace(String s) {
		System.out.println(s.replace(" ",""));	
		}
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		Removiwhitespace(s);
	}

}
