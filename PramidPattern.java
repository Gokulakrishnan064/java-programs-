 package main;

public class PramidPattern {
	public static void main(String[]rgs) {
		int n=15;
		n=2*n;
		for(int i=1;i<=n;i++) {
			if(i%2!=0) {
				for(int j=1;j<=n-i;j++) {
					System.out.print(" ");
					}
				for(int j=1;j<=i;j++) {
					System.out.print("* ");
				}
				System.out.println();
			}
		}
	}
	
}
