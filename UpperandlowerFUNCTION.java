package main;
import java.util.*;

public class UpperandlowerFUNCTION {
    public static String casechange(String str){
        char[] a=str.toCharArray();
        System.out.println(Arrays.toString(a));
        for(int i=0;i<a.length;i++){
            if(i%2==0){
                a[i]=Character.toUpperCase(a[i]);
            }
            else{
                 a[i]=Character.toLowerCase(a[i]);
            }
            
        }
        String ans=new String(a);
        return ans;
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        String result=casechange( str);
        System.out.println(result);
}
}