package main;
import java.util.*;
public class TwoarrayEqualFUNCTION {
	public static boolean check(int[]array,int[]array1) {
		if(array.length==array1.length) {
		for(int i=0;i<array.length;i++) {
			if(array[i]!=array1[i]){
				return false;
			}
			}
		}
		else {
			return false;
		}
		return false;
		
	}
	public static int [] input(Scanner sc) {
		System.out.println("enter the total no of elements");
		int element=sc.nextInt();
		int [] arr=new int[element];
		for(int i=0;i<element;i++) {
			arr[i]=sc.nextInt();
		}
		return arr;
	}
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
			int []array=input(sc);
			int []array1=input(sc);
			
			if(check(array,array1)) {
				System.out.println("equal");
			}
			else {
				System.out.println("not equal");
			}
	}
	}

