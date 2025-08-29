package main;
import java.util.*;
public class PrintGrade {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int mark=sc.nextInt();
		String a=(mark<=100&&mark>=90)? "A":(mark<=89&&mark>=80)? "B":(mark<=79&&mark>=70)? "C":(mark<=69&&mark>=60)? "D":(mark<=59&&mark>=50)? "E": (mark<=49&&mark>=0)? "fail":"";
		System.out.println(a);
		
		

	}

}
