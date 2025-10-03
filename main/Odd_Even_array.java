package main;
import java.util.*;
public class Odd_Even_array {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("total no of element");
		int size=sc.nextInt();
		int[]number=new int[size];
		 System.out.println("Enter"+ size +"integer elements:");
		for (int i=0;i<size;i++) {
			 System.out.print("Element"+(i + 1)+":");
			number[i]=sc.nextInt();
		}
		int evencount=0;
		int oddcount=0;
		for(int num:number) {
			if (num%2==0) {
				evencount++;
			}
			else {
				oddcount++;
			}
		}
		System.out.println(evencount);
		System.out.println(oddcount);
	}
}
