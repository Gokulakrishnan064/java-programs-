package main;
import java.util.*;
public class Palindrome {
	public static void main(String[]args) {
     Scanner sc = new Scanner(System.in);
     int a =sc.nextInt();
     int sum=0;
     int n=a;
     while(n>0) {
    	 n=n%10;
    	 int fact=1;
    	 for(int i=1;i<=n;i++) {
    		 fact=fact*i;
    	 }
    	 sum=sum+fact;
    	 n=a/10;
     }
     if(a==sum) {
    	 System.out.print("strong number");
     }
     else {
    	 System.out.print("not a strong number");
     }
     }
}
