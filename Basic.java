package main;
import java.util.*;
public class Basic {
	public static void main(String[]args) {
		Scanner re=new Scanner(System.in);
		int a=re.nextInt();
		int b=re.nextInt();
		if(a>b) {
			System.out.printf("the value is %d and %d and the greater is %d",a,b,a);
		}
		else {
			System.out.printf("the value is %d and %d and the greater is %d",a,b,b);
		}
		
	}

}
