package Strings;
import java.util.*;
public class UpperandLowerwithoutinbuiltmethod {
	public static String casechange(String str){
        char[] a=str.toCharArray();
        System.out.println(Arrays.toString(a));
        for(int i=0;i<a.length;i++){
        	if(a[i]>='a' && a[i]<='z') {
        		a[i]=(char)(a[i]-32);            
            }
            else if(a[i]>='A' && a[i]<='Z') {
        		a[i]=(char)(a[i]+32);
        		
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



