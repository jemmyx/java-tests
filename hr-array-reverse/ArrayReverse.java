import java.io.*;

class ArrayReverse
{
	public static void main(String[] args){
		
		int[] a = new int[]{2,4,6,8,9,10};
		int[] ret = reverseArray(a);
		
		System.out.println("*********** Rever Array ***********");
		for(int i=0; i<ret.length; i++){
			System.out.print(ret[i]+",");
		}
		
	}
	
	static int[] reverseArray(int[] a){

		int tempv;
		int n = a.length;
		int[] finalArr = new int[n];
		
		for(int i=0; i<n; i++){
			tempv = a[i];
			finalArr[i] = a[n-1-i];
			finalArr[n-1-i] = a[i];
		}

		return finalArr;
		
	}
	
}