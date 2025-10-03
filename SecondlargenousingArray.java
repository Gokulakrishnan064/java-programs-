package main;

public class SecondlargenousingArray {
	public static void main(String[]args) {
		int[]arr= {15,45,88,66,55,78};
		int fmax=Integer.MIN_VALUE;
		int smax=Integer.MIN_VALUE;
		for(int i: arr) {
			if(i>fmax) {
				smax=fmax;
				fmax=i;
			}
			if(fmax!=i && i>smax) {
				smax=i;
			}
		}
		System.out.println(smax);
	}

}
