package main;

public class FirstLastindex {
	
	/*   WITH TWO LOOP
	  
	 
	public static void index(int []arr,int target) {
		int first=-1;
		int last=-1;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==target) {
				first=i;
				break;
			}
		}
		for(int j=arr.length-1;j>=0;j--) {
			if(arr[j]==target) {
				last=j;
				break;
			}
	}
		System.out.println("first : "+first);
		System.out.println("last : "+last);
	}
	
		*/
//----------------------------------------------------------------------------------------------------
	
	// SINGLE LOOP 
	public static void index1loop(int []arr,int target) {
		int first=-1;
		int last=-1;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==target) {
				if(first==-1) {
				first=i;
			}
				last=i;
		}
		}
		System.out.println("First index: " + first);
        System.out.println("Last index: " + last);
        }
		
		
	public static void main(String[]args) {
		int arr []= {5,8,3,4,2,9,3,11,18,3,1,4};
		int target=3;
		index1loop(arr,target);
	}

}
