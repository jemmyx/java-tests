import java.io.*;

public class Hourglass
{
	public static void main(String[] args)
	{
		// int[][] multi = new int[][]{
			// {-9,-9,-9,1,1,1},
			// {0,-9,0,4,3,2},
			// {-9,-9,-9,1,2,3},
			// {0,0,8,6,6,0},
			// {0,0,0,-2,0,0},
			// {0,0,1,2,4,0},
		// };
		
		int[][] multi = new int[][]{
			{-1, -1, 0, -9, -2, -2},
			{-2, -1, -6, -8, -2, -5},
			{-1, -1, -1, -2, -3, -4},
			{-1, -9, -2, -4, -4, -5},
			{-7, -3, -3, -2, -9, -9},
			{-1, -3, -1, -2, -4, -5}
		};
		
		hourGlassSum(multi);
	}
	
	static int hourGlassSum(int[][] arr)
	{		
		int max = 0;
		int sum = 0;
		int arrlengthVert = arr[0].length;
		int arrlengthHoriz = arr.length;
		int sumloopcounter = 0;
		
		for(int i=0; i<arr.length; i++){
			
			for(int j=0; j<arr[i].length; j++){
				
				/* test if subset possible */
				if( !( (i+2)<arrlengthVert && (j+2)<arrlengthHoriz ) ){
					break;
				}

				/* System.out.println("Processs with subset calculation (i="+i+" to "+(i+2)+", j="+j+" to "+(j+2)+")"); */
				sum = arr[i][j]+arr[i][j+1]+arr[i][j+2]   +   arr[i+1][j+1]   +   arr[i+2][j]+arr[i+2][j+1]+arr[i+2][j+2];
				
				System.out.println("Intermediate sum is "+sum);
				
				if(sumloopcounter==0){
					max = sum;	//first time max if sum
				}
				
				sumloopcounter++;
				
				if(sum > max){
					max = sum;
				}
			}

		}
		
		System.out.println("Max sum is "+max+", loop="+sumloopcounter);
		
		return max;
	}
}