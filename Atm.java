package main;
import java.util.*;
public class Atm {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int pin=1436;
		int attempt=0;
		System.out.println("Enter the pin");
		for(int i=1; i<= 3 ; i++){
		int a=sc.nextInt();
		if(pin==a) {
			System.out.println("Correct");
			break;
		}
		else if(pin!=a) {
			attempt+=1;
			if(attempt<3) {
				System.out.println("Incorrect try again");
				System.out.println("Enter the pin");		
			}
		}
		if(attempt>=3) {
			System.out.println("incorrect your id is blocked");
		}

		}
	}
	
}
