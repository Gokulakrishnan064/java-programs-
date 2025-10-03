package main;
import java.util.Scanner;

public class Armstrongno {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int dup=num;
        int ab=num;
        int count=0;
        int sum=0;
        while(num!=0) {
        	num/=10;
        	count++;	
        }    
        while(dup!=0) {
        	int a=dup%10;
        	sum=sum+(int)(Math.pow(a, count));
        	dup=dup/10;
        }
        if(ab==sum) {
        	System.out.println("amstrong");
        }
        else {
        	System.out.println("not amstrong");
        }
        
        
    }
    	
    }
        

        