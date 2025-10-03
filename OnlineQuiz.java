package main;
import java.util.*;
public class OnlineQuiz {
	public static void ans(char[] arr) {
		char correct[]= {'A','B','C','D','A'};
		int correctans=0;
		int wrongans=0;	
		int total=5;
		for(int i=0;i<correct.length;i++) {
			if(correct[i]==arr[i]) {
				System.out.println("Question " + (i+1) + " is Correct");
				correctans++;
				
			}
			else {
				System.out.println("Question " + (i+1) + " is Incorrect");
				wrongans++;
			}
			}
		System.out.println("Total Correct Answer :"+correctans);
		System.out.println("Total Wrong Answer   :"+wrongans);
		System.out.println("Score                : " + correctans + "/" + total);
		
	}
	public static void main (String[]args) {
		Scanner sc=new Scanner(System.in);
		char []arr=new char[5];
		System.out.println("Enter your answers (A/B/C/D): ");
		for (int i=0;i<5;i++) {
			arr[i]=Character.toUpperCase(sc.next().charAt(0));
		}
		System.out.println("Your answers :" +Arrays.toString(arr));
		ans(arr);
	}

}
