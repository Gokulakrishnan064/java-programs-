package main;
import java.util.*;
public class V_or_C {
	public static void main(String[]args) { 
		Scanner sc=new Scanner(System.in);
		char ch=sc.next().charAt(0);
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
		{
			System.out.println("THe given character is vowel"+ch);
		}
		else {
			System.out.println("THe given character is con" +ch);
			
		}
		
		
	}

}
