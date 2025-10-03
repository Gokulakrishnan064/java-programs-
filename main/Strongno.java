package main;
import java.util.*;

public class Strongno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int sum = 0;
        int n = a;

        while (n > 0) {
            int digit = n % 10; 
            int fact = 1;
            for (int i = 1; i <= digit; i++) {
                fact *= i;
            }

            sum += fact;
            n /= 10;  
        }

        if (a == sum) {
            System.out.println("Strong number");
        } else {
            System.out.println("Not a strong number");
        }
    }
}
