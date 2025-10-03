package main;
import java.util.*;
public class RailwaySeatBooking {
	public static void available(int arr[]) {
		   System.out.println("Current Seat Availability (0=Available, 1=Booked):");
		   System.out.println(Arrays.toString(arr));
			}
	public static void count(int arr[]) {
		int count=0;
		for(int seat:arr) {
			if(seat==0) {
				count++;
			}
		}
		if(count==arr.length) {
			System.out.println("Train compartment is empty.");
		}
		System.out.println("The avaliable count is "+count);
	}
	public static void seatno(int arr[]) {
		System.out.println("The available seat numbers are : ");
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==0) {
				 System.out.print((i+1) + " ");			 
			}
		}
		 System.out.println();	
	}
	public static void bookSeat(int[] seats, Scanner sc) {
		System.out.print("Enter the total no of seat to book : ");
		int totalseat=sc.nextInt();
		for(int i=0;i<totalseat;i++) {
        System.out.print("Enter seat number to book (1-10): ");
        int seatNo = sc.nextInt();

        if (seatNo < 1 || seatNo > seats.length) {
            System.out.println("Invalid seat number!");
            i--;
            continue;
        }

        if (seats[seatNo - 1] == 0) {
            seats[seatNo - 1] = 1;
            System.out.println("Seat " + seatNo + " booked successfully");
        } else {
            System.out.println("Seat " + seatNo + " is already booked");
            i--;
        }
        }
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int []arr= {0,0,0,0,0,0,0,0,0,0};
		available(arr);
		count(arr);
		seatno(arr);
		bookSeat(arr, sc);	
		System.out.println("\nAfter Booking:");
		 available(arr);
	     count(arr);
	     seatno(arr);
	}

}
