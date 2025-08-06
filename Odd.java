package main;
import java.util.Scanner;
public class Odd {
	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int n = scanner.nextInt();
	        int sumEven = 0;
	        int sumOdd = 0;
	        int num = scanner.nextInt();
	        for (int i = 1; i <= n; i++) 
	        {
	        	 if (num % 2 == 0) {
		                sumEven += num;
		            } else {
		                sumOdd += num;
		            }
		        }

		        // Display results
		        System.out.print(   sumEven +" "+ sumOdd);
		    }
		
	        }
	      

	           


