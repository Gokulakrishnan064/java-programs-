package main;
import java.util.*;
public class PositiveNegativecountFUNCTION {
	public static void count(int[]arr){
		int positivecount=0;
		int negativecount=0;
		for(int i=0;i<=arr.length-1;i++) {
			if(arr[i]>0) {
				positivecount++;
			}
			else if(arr[i]<0){
				negativecount++;
			}		
		}
		System.out.println("Total positive number :"+positivecount);
		System.out.println("Total negative number :"+negativecount);
		}
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the  No of element");
		int element=sc.nextInt();
		int [] arr=new int[element];
		for(int i=0;i<element;i++) {
			arr [i]=sc.nextInt();
			
		}
		System.out.println(Arrays.toString(arr));
		count(arr);
		
		
	}

}
