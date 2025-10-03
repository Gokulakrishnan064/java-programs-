package main;
import java.util.*;
public class BookingFUNCTION {
public static int ticket(String type,int KM) {
		
		if(type.equals("adult")) {
			return 10*KM;
		}
		else if(type.equals("child")) {
			return 5*KM;
		}
		else {
			return 7*KM;
		}

	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int total=0;
		System.out.println("Enter no. of passengers:");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			System.out.println("Passenger"+i);
			sc.nextLine();
			System.out.println("Enter passenger type(adult/child/senior):");
			String type=sc.nextLine();
			System.out.println("Enter distance in KM:");
			int KM=sc.nextInt();
			int fare=ticket(type,KM);
			System.out.println("Fare for passenger"+i+"=$"+fare);
			total=total+fare;	
		}
		System.out.println("Total fare for "+n+" passenger=$"+total);

	}

}
		