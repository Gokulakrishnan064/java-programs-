package main;
import java.util.*;
public class ZigzagARRAYFUNCTION{
	public static boolean ziczag(int [] arr ) {
		for (int i = 1; i < arr.length-1; i++) {
            if (!((arr[i] > arr[i - 1] && arr[i] > arr[i + 1]) ||
                  (arr[i] < arr[i - 1] && arr[i] < arr[i + 1]))) {
                return false;
            }
        }
        return true;
    }
	public static void main(String[]args) {
		int arr[]= {21,24,17,25,22,26,20};
		boolean ans=ziczag(arr);
		if(ans) {
			System.out.println("it is ziczag array");
		}
		else {
			System.out.println("it is not ziczag array"); 
			
		}
	}
	 
	}
