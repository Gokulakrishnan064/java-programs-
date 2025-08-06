package main;
import java.util.*;
public class Find_the_char {
	public static void main(String[]args) {
		Scanner ch=new Scanner(System.in);
		char fg=ch.next().charAt(0);
		if(fg>='0'&& fg<='9')
		{
			System.out.println("it is a digit");
		}
		else if(fg>+'a'&&fg<='z'||fg>='A'&&fg<='Z')
		{
			System.out.println("it is a alpha");
		}
		else {
			System.out.println("it is a special char");
			
		}
	}

}
