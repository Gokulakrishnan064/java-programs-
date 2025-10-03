package Strings;
import java.util.*;
public class stringexpansion{
    public static String Stringexp(String s) {
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int count = 0;
            while (i + 1 < s.length() && Character.isDigit(s.charAt(i + 1))) {
                count = count * 10 + (s.charAt(i + 1) - '0');
                i++;
            }
            if (count == 0) sb.append(c);
            else sb.append(String.valueOf(c).repeat(count));
        }
        
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String ans = Stringexp(s);
        System.out.println(ans);
        sc.close();
    }
}