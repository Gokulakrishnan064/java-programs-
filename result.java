
package main;
import java .util.*;

public class result {
	public static void main(String args[])
	{
		Scanner Sc = new Scanner(System.in);
		int mark = Sc.nextInt();
		if(mark>=0 && mark<=35)
		{
			System.out.println("fail");
		}
		else
		{
			System.out.println("pass");
		}
	}

}
