package main;
import java.util.*;
public class Switch {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		int day=sc.nextInt();
		switch(day) {
		
		case 1:
			System.out.println("sat");
			break;
		case 2:
			System.out.println("Sunday");
			break;
		case 3:
			System.out.println("mon");
			break;
		case 4:
			System.out.println("tu");
			break;
		case 5:
			System.out.println("we");
			break;
		case 6:
			System.out.println("thu");
			break;
		case 7:
			System.out.println("fri");
			break;
		default:
			System.out.println("");
			break;
		}

}
}