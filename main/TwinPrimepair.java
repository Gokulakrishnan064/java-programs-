package main;
import java.util.*;
public class TwinPrimepair {
	private static final Boolean True = null;
	private static final Boolean False= null;

	public static void main(String[]args) {
		int a=100;
		for(int i=3;i<=a;i++) {
			Boolean Prime1=True;
			Boolean Prime2=True;
			for(int j=2;j<i/2;j++) {
				if(i%j==0) {
				Prime1=False;
			}
			
		}
			for(int k=2;k<(i+2);k++) {
				if((i+2)%k==0) {
					Prime2=False;
				}
			}
			if(Prime1 && Prime2) {
				System.out.println("("+i+":"+(i+1)+")");
			}
		}
	}
}