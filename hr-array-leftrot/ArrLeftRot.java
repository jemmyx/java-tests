import java.io.*;

public class ArrLeftRot
{

	public static void main(String[]args){
			
		int[] a = {1,2,3,4,5};
		int d = 4;
		
		int[] res = rotLeft(a,d);

		for(int k=0;k<res.length;k++){
			System.out.println("res("+k+") is "+res[k]);
		}

	}
	
    // Complete the rotLeft function below.
    static int[] rotLeft(int[] a, int d) {

        int counter = 0;

        if(d==a.length || d==0 || a.length==0){
            return a;
        }

        int[] finalArray = new int[a.length];        
        
        for(int i=d; i < a.length; i++){
            finalArray[counter] = a[i];
            counter++;
        }
        
        for(int i=0; i<d; i++){
            finalArray[counter] = a[i];
            counter++;
        }
        return finalArray;

    }	
	
}